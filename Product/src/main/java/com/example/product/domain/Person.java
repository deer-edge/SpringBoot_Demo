package com.example.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    private String name;
    private int age;
    private String address;
    private Date birthday;
    private List<Animal> animalList;
}
