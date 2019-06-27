package net.proselyte.springbootapp.dao;

import net.proselyte.springbootapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
