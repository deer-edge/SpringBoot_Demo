package com.example.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Elephant extends Animal{
    private int id;
    private String name;
    private int age;
    private String address;
    private boolean isOld;
    private Date birthday;

    public void play(){
        System.out.println("大象卷鼻玩！");
        System.out.println("pull me！");
        System.out.println("pull me！");
        System.out.println("pull me！");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("象执行了动物的吃饭方法");

    }
}