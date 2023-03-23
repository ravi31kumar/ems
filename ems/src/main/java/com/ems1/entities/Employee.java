package com.ems1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eid;

    private String name;

    private String mobile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sid", referencedColumnName = "sid")
    private Salary salary;

    // Constructors, getters, and setters
}
