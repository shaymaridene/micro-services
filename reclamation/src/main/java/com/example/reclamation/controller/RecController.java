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

    private final RecService recService;

    @PostMapping("/addRec/{userId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addRec(@PathVariable Long userId, @RequestBody Reclamation rec) {
        recService.addRec(userId, rec);
    }

    @GetMapping("/getAllRec")
    public List<Reclamation> getRecs() {
        return recService.getAllRec();
    }

    @PutMapping("/updateRec/{id_rec}")
    public Reclamation updateRec(@PathVariable long id_rec, @RequestBody Reclamation rec) {
        rec.setId_rec(id_rec);
        return recService.updateRec(rec);
    }

    @DeleteMapping("/removeRec/{id_rec}")
    public void removeRec(@PathVariable long id_rec) {
        recService.removeRec(id_rec);
    }
}
