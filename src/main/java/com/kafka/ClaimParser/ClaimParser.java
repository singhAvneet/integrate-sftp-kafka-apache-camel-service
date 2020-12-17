package com.kafka.ClaimParser;


import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileFilter;
import org.apache.camel.spi.AsEndpointUri;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.io.*;
import java.util.*;

public class ClaimParser  {

@Autowired
Environment env;

    PharmacyClaimFileFormat pharmacyClaimFileFormat = new PharmacyClaimFileFormat();

    private String localDir="download/data";
    private String FileName=getLatestFilefromDir(localDir).getName();
    //This method is called by the producer
    public JSONArray GetClaims() throws IOException {

        ArrayList<String> rawClaims = DetermineValidClaim(ReadClaimFile(localDir+"\\"+FileName));
        return ParseValues(rawClaims);
    }

    //This is where you can build a custom object based on what values from the claim you would like.
    private JSONArray ParseValues(ArrayList<String> rawClaims) {
        JSONArray claims = new JSONArray();
        rawClaims.forEach(row -> {
            claims.add(CreateClaimJSONObject(row));
        });
        return claims;
    }

    private JSONObject CreateClaimJSONObject(String claimString) {
        JSONObject claim = new JSONObject();
        claim.put("FileName", FileName);
        claim.put("RecordType", pharmacyClaimFileFormat.GetRecordType(claimString));
        claim.put("PharmacyNumber", pharmacyClaimFileFormat.GetPharmacyNumber(claimString));
        claim.put("ClaimStatus", pharmacyClaimFileFormat.GetClaimStatus(claimString));
        claim.put("DateClaimReceivedatESICanada", pharmacyClaimFileFormat.GetDateClaimReceivedatESICanada(claimString));
        claim.put("DateProcessedOrAdjudicated", pharmacyClaimFileFormat.GetDateProcessedOrAdjudicated(claimString));
        claim.put("PrescriptionNumber", pharmacyClaimFileFormat.GetPrescriptionNumber(claimString));
        claim.put("DateofService", pharmacyClaimFileFormat.GetDateofService(claimString));
        claim.put("DrugDescriptionEnglish", pharmacyClaimFileFormat.GetDrugDescriptionEnglish(claimString));
        claim.put("ClientFirstName", pharmacyClaimFileFormat.GetClientFirstName(claimString));
        claim.put("PatientFirstName", pharmacyClaimFileFormat.GetPatientFirstName(claimString));
        claim.put("ClientID", pharmacyClaimFileFormat.GetClientID(claimString));
        claim.put("CustomerID", pharmacyClaimFileFormat.GetCustomerID(claimString));
        claim.put("SubmittedTotalAmountClaimed", pharmacyClaimFileFormat.GetSubmittedTotalAmountClaimed(claimString));
        claim.put("PaymentMethod", pharmacyClaimFileFormat.GetPaymentMethod(claimString));
        claim.put("PharmacistID", pharmacyClaimFileFormat.GetPharmacistID(claimString));
        return claim;
    }

    //Check to see if row start with 4 or 5
    private ArrayList<String> DetermineValidClaim(ArrayList<String> claims) {
        ArrayList<String> validRows = new ArrayList<>();
        claims.forEach(row -> {
            if (pharmacyClaimFileFormat.GetRecordType(row) == 4 || pharmacyClaimFileFormat.GetRecordType(row) == 5) {
                validRows.add(row);
            }
        });
        return validRows;
    }

    //Read the claim file passed via string
    private ArrayList<String> ReadClaimFile(String file) throws IOException {
        BufferedReader bufReader = new BufferedReader(new FileReader(file));
        ArrayList<String> claims = new ArrayList<>();

        String line = bufReader.readLine();
        while (line != null) {
            claims.add(line);
            line = bufReader.readLine();
        }

        bufReader.close();
        return claims;
    }

    private File getLatestFilefromDir(String dirPath){
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            return null;
        }

        File lastModifiedFile = files[0];
        for (int i = 1; i < files.length; i++) {
            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                lastModifiedFile = files[i];
            }
        }
        return lastModifiedFile;
    }


}