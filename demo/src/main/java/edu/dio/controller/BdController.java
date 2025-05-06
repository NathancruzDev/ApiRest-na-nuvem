package edu.dio.controller;

import edu.dio.UserPixDTO.PixDTO;
import edu.dio.model.User;
import edu.dio.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/allusers")
public class BdController {
    private final UserService user;

    public BdController(UserService user) {
        this.user = user;
    }
    @GetMapping
    public List<PixDTO> allUsers(){
        return  user.getAllUsers().stream()
                .map(user -> new PixDTO(
                        user.getUsername(),
                        user.getPixKey()
                ))
                .collect(Collectors.toList());
    }
}
