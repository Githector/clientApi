package com.cirvianum.daw.clientcirvianum.controller;

import com.cirvianum.daw.clientcirvianum.entities.Alumne;
import com.cirvianum.daw.clientcirvianum.entities.wrapClass.LlistaAlumnes;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ApiClient {
/*    public static List<Alumne> getAlumnes()
    {
*//*        final String uri = "http://apisec-env.eba-xnbp627s.us-east-1.elasticbeanstalk.com/getAlumnes";
        RestTemplate rt = new RestTemplate();*//*
*//*

        LlistaAlumnes response = rt.getForObject(
                uri,
                LlistaAlumnes.class);
        List<Alumne> alumnes = response.getLlistaAlumnes();

        return alumnes;
*//*


*//*
        ResponseEntity<List<Alumne>> rateResponse =
                rt.exchange(uri,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Alumne>>() {
                        });
        List<Alumne> llista = rateResponse.getBody();

        return llista;
*//*


*//*
        for(Alumne a : alumnes){
            System.out.println("Nom: "+a.getNom());
            System.out.println("Cognoms: "+a.getCognoms());
            System.out.println("Mail: "+a.getMail());
            System.out.println("Photo: "+a.getUrlPhoto());
            System.out.println("*************************");
        }
*//*

    }*/
}
