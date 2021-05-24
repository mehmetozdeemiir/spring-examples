package com.kodlayalim.flyway.api;

import com.kodlayalim.flyway.entity.User;
import com.kodlayalim.flyway.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class userApi {

    private final UserRepository userRepository;

    @GetMapping
    public List<User> getAll()
    {
        return userRepository.findAll();
    }
}
