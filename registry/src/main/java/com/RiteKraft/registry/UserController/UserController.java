package com.RiteKraft.registry.UserController;


import com.RiteKraft.registry.Dto.UserDTO;
import com.RiteKraft.registry.Service.UserIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserIMPL userIMPL;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserDTO userDTO){
        String id = userIMPL.addUser(userDTO);
        return id;
    }
}
