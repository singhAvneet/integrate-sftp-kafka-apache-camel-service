package com.kafka.Components;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;


import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class FtpDownloadFileFilter implements GenericFileFilter<Object> {

    private static Logger logger = LoggerFactory.getLogger(FtpDownloadFileFilter.class);

    @Autowired
    private Environment env;

    @Override
    public boolean accept(GenericFile<Object> file) {

        try {
            String fileName = file.getFileName();
            long lastModified = file.getLastModified();
            return isLatestFile(lastModified, 1) && !isInLocalDir(fileName) ;
        } catch (Exception e) {
            logger.error("ftp download file filter error !", e);
            return false;
        }
    }


    private boolean isLatestFile(long lastModified, int dateNum) {

        Calendar calLastMod = Calendar.getInstance();
        calLastMod.setTimeInMillis(lastModified);

        Calendar calThreshold = Calendar.getInstance();
        calThreshold.add(Calendar.DATE, - dateNum);

        return calLastMod.compareTo(calThreshold) > 0 ? true : false;
    }


    private boolean isInLocalDir(String fileName) {
        try {

            List<String> localFileNames = Files.walk(Paths.get(env.getProperty("ftp.local.data.dir")))
                    .filter(Files::isRegularFile)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toList());
            return localFileNames.contains(fileName) ? true : false;
        } catch (Exception e) {
            logger.error("get local downloaded files fail !", e);
            return true;
        }
    }



}