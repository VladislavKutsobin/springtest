package net.proselyte.springbootapp.dao;


import net.proselyte.springbootapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department, Integer> {
}
