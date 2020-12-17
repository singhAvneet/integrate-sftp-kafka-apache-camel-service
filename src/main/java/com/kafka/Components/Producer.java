package com.kafka.Components;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.ClaimParser.ClaimParser;
import com.kafka.model.Claim;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.kafka.KafkaEndpoint;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.ArrayList;


@Component
public class Producer implements Processor {

    @Autowired
    private ProducerTemplate producerTemplate;

    @Autowired
    private KafkaEndpoint kafkaEndpoint;

    @Autowired
    private ConfigurableApplicationContext context;


    @Override
    public void process(Exchange exchange) throws Exception {
        sendMessage();
    }


    public void sendMessage() throws IOException{
        ClaimParser claimParser = new ClaimParser();
        JSONArray jsonArray = claimParser.GetClaims();
        ArrayList<Claim> claims = FillClaimArray(jsonArray);
        claims.forEach(claim -> producerTemplate.sendBody(kafkaEndpoint,claim));
    }

    private ArrayList<Claim> FillClaimArray (JSONArray jsonArray) {
        ArrayList<Claim> claimArray = new ArrayList<>();
        jsonArray.forEach(obj -> {
            try {
                claimArray.add(FillClaim(obj));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        return claimArray;
    }

    private Claim FillClaim(Object obj) throws  IOException {
        ObjectMapper mapper = new ObjectMapper();
        Claim claim = mapper.readValue(obj.toString(), Claim.class);
           return claim;
    }
}
