package com.cgi.bni.springbootmigrationdemo.model;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name = "employee")
@Table(name = "employees")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Employee {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    @NotNull
    private String name;
    private String city;
}
