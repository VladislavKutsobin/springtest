package net.proselyte.springbootapp.service;

import net.proselyte.springbootapp.dao.RoleDao;
import net.proselyte.springbootapp.dao.UserDao;
import net.proselyte.springbootapp.model.Role;
import net.proselyte.springbootapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;



    @Override
    public void save(User user) {
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
