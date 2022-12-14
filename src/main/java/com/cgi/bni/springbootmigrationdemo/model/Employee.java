package com.cgi.bni.springbootmigrationdemo.model;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


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
    @Size(min = 1)
    private String name;
    private String city;
}
