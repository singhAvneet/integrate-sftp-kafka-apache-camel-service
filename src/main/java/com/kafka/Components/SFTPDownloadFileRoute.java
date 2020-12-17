package com.kafka.Components;


import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class SFTPDownloadFileRoute extends RouteBuilder
{
    @Autowired
    private Environment env;


    @Autowired
    Producer producerProcessor;

    private static Logger logger =  LoggerFactory.getLogger(SFTPDownloadFileRoute.class);


    @Override
    public void configure() throws Exception {

        if (isExecHost()) {
            from(env.getProperty("ftp.server.uri"))
                    .to("file:" + env.getProperty("ftp.local.data.dir"))
                    .log(LoggingLevel.INFO, (org.slf4j.Logger) logger, "download file ${file:name} complete.")
                    .process(producerProcessor)
                    ;
        }
    }

    private boolean isExecHost() {
        String hostName = "";
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            logger.error("get hostname fail !", e);
            return false;
        }
        return hostName.endsWith(hostName.split(",")[0]);
    }
}