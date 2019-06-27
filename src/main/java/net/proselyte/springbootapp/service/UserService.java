package net.proselyte.springbootapp.service;

import net.proselyte.springbootapp.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
