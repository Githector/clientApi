package com.cirvianum.daw.clientcirvianum.controller;

import com.cirvianum.daw.clientcirvianum.entities.MP;
import com.cirvianum.daw.clientcirvianum.entities.UF;
import com.cirvianum.daw.clientcirvianum.service.AlumneService;
import com.cirvianum.daw.clientcirvianum.service.MpService;
import net.minidev.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClientController {

    //private final AlumneService as;
    private final MpService mps;
    HttpHeaders headers;
    JSONObject personJsonObject;
    MP mp;
    UF uf;

    public ClientController(MpService mps) {
        this.mps = mps;
    }

    @PostMapping(value = "/addMp")
    public String guardarMp(@ModelAttribute MP mp, Model model) {
        System.out.println(mp.nomMp);
        System.out.println(mp.numMp);
        mps.sendReqSaveMp(mp);
        List<MP> llistaMps = mps.getMps();
        model.addAttribute("llistaMps",llistaMps);
        mp = new MP();
        uf = new UF();
        model.addAttribute("mpBuit",mp);
        model.addAttribute("ufBuida",uf);
        boolean infoModal=false;
        model.addAttribute("infoModal",infoModal);

        return "main";
    }

    @RequestMapping("/")
    public String recuperaMps(Model model){
        //aqui buscaré alumnes i quan els tingui..
        List<MP> llistaMps = mps.getMps();
        model.addAttribute("llistaMps",llistaMps);
        mp = new MP();
        model.addAttribute("mpBuit",mp);
        uf = new UF();
        model.addAttribute("ufBuida",uf);
        boolean infoModal=false;
        model.addAttribute("infoModal",infoModal);

        return "main";
    }

/*
    @GetMapping(value = "/addUf")
    public String AddUfByMp(Model model){
        System.out.println("Hello World");
        return "llistaAlumnes";
    }
*/

    @PostMapping(value = "/openModal")
    public String preparaModal(@RequestParam("idMp") int idMp, Model model) {
        System.out.println("Id del mòdul Professional: "+idMp);
        List<MP> llistaMps = mps.getMps();
        model.addAttribute("llistaMps",llistaMps);
        mp = new MP();
        uf = new UF();
        model.addAttribute("idMp",idMp);
        model.addAttribute("mpBuit",mp);
        model.addAttribute("ufBuida",uf);
        boolean infoModal=true;
        model.addAttribute("infoModal",infoModal);

        return "main";
    }

    @PostMapping(value = "/addUf")
    public String preparaModal(@ModelAttribute UF uf, @RequestParam("idMp") int idMp, Model model) {
        System.out.println("Arribo al controller");
        MP mpModified = mps.saveUfByMp(uf,idMp);
        System.out.println("MP modified id: "+mpModified.getIdMp());
        System.out.println("MP modified Nom: "+mpModified.getNomMp());

        System.out.println("Nom UF: "+uf.getNomUf());
        System.out.println("Número : "+uf.getNumUf());
        List<MP> llistaMps = mps.getMps();
        model.addAttribute("llistaMps",llistaMps);
        mp = new MP();
        uf = new UF();
        model.addAttribute("mpBuit",mp);
        model.addAttribute("ufBuida",uf);
        boolean infoModal=false;
        model.addAttribute("infoModal",infoModal);



        return "main";
    }




}
