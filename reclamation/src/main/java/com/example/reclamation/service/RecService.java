package com.example.reclamation.service;

import com.example.reclamation.dto.UserDTO;
import com.example.reclamation.entity.Reclamation;
import com.example.reclamation.feign.UserClient;
import com.example.reclamation.repo.RecRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecService {

    private final RecRepository repo;
    private final UserClient userClient;

    public List<Reclamation> getAllRec() {
        return repo.findAll();
    }

    public void addRec(Long userId, Reclamation rec) {
        UserDTO user = userClient.getUserById(userId);
        if (user != null) {
            rec.setClient(user.getName());
            rec.setEmail(user.getEmail());
        }
        repo.save(rec);
    }

    public Reclamation updateRec(Reclamation rec) {
        if (repo.existsById(rec.getId_rec())) {
            return repo.save(rec);
        }
        return null;
    }

    public void removeRec(long id_rec) {
        repo.deleteById(id_rec);
    }
}
