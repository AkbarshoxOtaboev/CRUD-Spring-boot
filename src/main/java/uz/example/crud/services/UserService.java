package uz.example.crud.services;

import uz.example.crud.dto.UserDTO;
import uz.example.crud.entities.User;

import java.util.List;


public interface UserService {

    void saveUser(User user);

    List<User> getAllUsers();

    void updateUserById(Long id, UserDTO userDTO);

    void deleteUser(Long id);

    User getUserById(Long id);
}
