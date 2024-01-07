package com.example.motorvognregister;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {

    public final List<Motorvogn> alleMotorvogner = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(Motorvogn innMotorvogn){
        alleMotorvogner.add(innMotorvogn);

    }

    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle() {
        return alleMotorvogner;
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {
        alleMotorvogner.clear();
    }
}
