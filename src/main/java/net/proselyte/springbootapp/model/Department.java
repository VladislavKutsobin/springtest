package net.proselyte.springbootapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Department {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "departments")
    private Set<Employee> employees;
}
