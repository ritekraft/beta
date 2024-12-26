package com.RiteKraft.registry.Service;

import com.RiteKraft.registry.Dto.UserDTO;
import com.RiteKraft.registry.Entity.User;
import com.RiteKraft.registry.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    //@Autowired
    //private PasswordEncoder passwordEncoder;

   // public String encodePassword(String rawPassword) {
    //    return passwordEncoder.encode(rawPassword);
   // }

   @Override
    public String addUser(UserDTO userDTO) {
        User user = new User(
            userDTO.getUserId(),
            userDTO.getUsername(),
            userDTO.getEmail(),

            userDTO.getPassword()
        );

        userRepo.save(user);
        return user.getUsername();
    }
}
