package com.example.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private int id;
    private String name;
    private int age;
    private String address;
    private boolean isOld;
    private Date birthday;

    public void play(){
        System.out.println("猫吃鱼玩！");
        System.out.println("猫吃鱼玩！0000");
        System.out.println("猫吃鱼玩！1111");
        System.out.println("猫吃鱼玩！2222");
    }
}
