package com.example.reclamation.feign;

import com.example.reclamation.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "user-service")
public interface UserClient {
    @GetMapping("/api/user/TDO/{id}")
    UserDTO getUserById(@PathVariable("id") Long id);
}
