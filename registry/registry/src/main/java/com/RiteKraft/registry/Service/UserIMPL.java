package com.RiteKraft.registry.Service;

import com.RiteKraft.registry.Dto.UserDTO;
import com.RiteKraft.registry.Entity.User;
import com.RiteKraft.registry.Repo.UserRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

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

    @Override
    public String updateUser(UserDTO userDTO){
       Optional<User> oldUser = userRepo.findById(userDTO.getUserId());
       if(oldUser.isPresent()){
           User curUser  = oldUser.get();
           curUser.setUsername(userDTO.getUsername());
           curUser.setEmail(userDTO.getEmail());
           curUser.setPassword(userDTO.getPassword());
           return "User updated successfully!";
       }
       else{
           return "User not found with ID: " + userDTO.getUsername();
       }
    }

    @Override
    public void deleteUser(Integer userId){
       userRepo.deleteById(userId);
    }

}
