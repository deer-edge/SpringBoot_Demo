package com.example.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog extends Animal {
    private int id;
    private String name;
    private int age;
    private String address;
    private boolean isOld;
    private Date birthday;

    public void play(){
        System.out.println("狗吃屎玩！");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("狗执行了动物的吃饭方法");
    }
}
