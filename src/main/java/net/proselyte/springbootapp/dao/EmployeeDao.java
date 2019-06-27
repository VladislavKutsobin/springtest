package net.proselyte.springbootapp.dao;


import net.proselyte.springbootapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
