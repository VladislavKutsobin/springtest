package net.proselyte.springbootapp.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
