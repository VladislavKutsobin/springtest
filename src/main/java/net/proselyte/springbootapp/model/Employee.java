package net.proselyte.springbootapp.model;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "salary")
    private int salary;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "employmentdate")
    private Date employmentdate;

    //ManyToOne
    @ManyToMany
    @JoinTable(name = "employee_department", joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "department_id"))
    private Set<Department> departments;
}
