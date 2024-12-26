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
        String userName = userIMPL.addUser(userDTO);
        return userName;
    }

    @PostMapping(path = "/update")
    public String updateUser(@RequestBody UserDTO userDTO){
        return userIMPL.updateUser(userDTO);
    }

    @DeleteMapping(path = "/delete/{userId}")
    public void deleteUser(@PathVariable Integer userId){
        userIMPL.deleteUser(userId);
    }

}
