package com.example.reclamation.controller;

import com.example.reclamation.service.RecService;
import com.example.reclamation.entity.Reclamation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reclamation")
@RequiredArgsConstructor
public class RecController {
    RecService recService;

    @PostMapping("/addRec")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addRec(@RequestBody Reclamation rec) {
        recService.addRec(rec);
    }

    @GetMapping("/getAllRec")
    public List<Reclamation> getRecs() {
        return recService.getAllRec();
    }

    @PutMapping("/updateRec/{id_rec}")
    public Reclamation updateRec(@PathVariable int id_rec, @RequestBody Reclamation rec) {
        return recService.updateRec(rec);
    }

    @DeleteMapping("/removeRec/{id_rec}")
    public void removeRec(@PathVariable int id_rec) {
        recService.removeRec(id_rec);
    }
}
