package uz.example.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.example.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
