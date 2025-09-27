package com.firstProject.Student_Management_System.Model;

import jakarta.persistence.Entity; //javax = jakarta in initial days
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor   // generates default constructor
@AllArgsConstructor  // generates constructor with all fields
@ToString            // generates toString() method
public class Student {
    @Id  // it is given because that point to primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// to autogenerate the id
    private Long id;
    private String name;
    private String email;
}
