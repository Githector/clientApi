package com.cirvianum.daw.clientcirvianum.service;


import com.cirvianum.daw.clientcirvianum.entities.MP;
import com.cirvianum.daw.clientcirvianum.entities.UF;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MpService {
    final String uri = "http://api-env.eba-ww3mgtgg.us-east-1.elasticbeanstalk.com/";

    public List<MP> getMps(){
        String uriGetMps = uri + "getMps";
        RestTemplate rt = new RestTemplate();
        ResponseEntity<List<MP>> rateResponse =
                rt.exchange(uriGetMps,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<MP>>() {
                        });
        List<MP> llistaMps = rateResponse.getBody();

        return llistaMps;

    }

    public MP sendReqSaveMp(MP mp){
        String uriAddMp = uri+"addMp";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //headers.set("my-id", "profe-test");
        HttpEntity<MP> httpEntity = new HttpEntity<>(mp,headers);
        RestTemplate rt = new RestTemplate();
        ResponseEntity<MP> responseEntity = rt.postForEntity( uriAddMp, httpEntity,MP.class);
        MP newMp = responseEntity.getBody();
        System.out.println(newMp.getIdMp());
        System.out.println(newMp.getIdMp());
        return newMp;

    }

    public MP saveUfByMp(UF uf, int idMp){
        String uriAddUfByMp = uri+"addUfByMp/"+idMp;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<UF> httpEntity = new HttpEntity<>(uf,headers);
        RestTemplate rt = new RestTemplate();
        ResponseEntity<MP> responseEntity = rt.postForEntity( uriAddUfByMp, httpEntity,MP.class);
        MP mpModified = responseEntity.getBody();



        return mpModified;
    }


}
