package com.example.motorvognregister;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {


    public final List<Motorvogn> alleMotorvogner = new ArrayList<>();

    @GetMapping("/lagre")
    public void lagreKunde(Motorvogn innKunde){
        alleMotorvogner.add(innKunde);
    }
    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return alleMotorvogner;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleMotorvogner.clear();
    }
}

