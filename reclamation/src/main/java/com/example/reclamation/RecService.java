package com.example.reclamation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecService {
    RecRepository repo;


    public List<Reclamation> getAllRec() {
        return repo.findAll();
    }

    public void addRec(Reclamation rec) {
        repo.save(rec);
    }

    public Reclamation updateRec(Reclamation rec) {
        if(repo.existsById(rec.getId_rec())){
            repo.save(rec);
        }
        return null;
    }

    public void removeRec(long id_rec) {
        repo.deleteById(id_rec);
    }
}
