package uz.example.crud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.example.crud.dto.UserDTO;
import uz.example.crud.entities.User;
import uz.example.crud.services.UserService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    private ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping(value = "/user/{id}")
    private ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping("/user/save")
    private ResponseEntity<String> saveUser(@RequestBody User user) {
        user.setCreateDate(LocalDateTime.now());
        userService.saveUser(user);
        return ResponseEntity.ok("User has been created");
    }

    @PutMapping("/user/update/{id}")
    private ResponseEntity<String> updateUserById(@PathVariable("id") Long id, @RequestBody UserDTO userDTO) {
        userService.updateUserById(id,userDTO);
        return ResponseEntity.ok("Пользователь успешно обновлен");
    }

    @DeleteMapping("/user/delete/{id}")
    private ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("User deleted");
    }
}
