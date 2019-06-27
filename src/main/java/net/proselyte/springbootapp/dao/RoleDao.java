package net.proselyte.springbootapp.dao;

import net.proselyte.springbootapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Integer> {
}
