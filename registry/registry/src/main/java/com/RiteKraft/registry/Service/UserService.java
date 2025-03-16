package com.RiteKraft.registry.Service;

import com.RiteKraft.registry.Dto.UserDTO;

public interface UserService {
    String addUser(UserDTO userDTO);
    String updateUser(UserDTO userDTO);
    void deleteUser(Integer userId);
}
