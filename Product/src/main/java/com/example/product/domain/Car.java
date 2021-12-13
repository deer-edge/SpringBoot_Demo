package com.example.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car extends Animal{
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
        
        System.out.println("猫吃鱼玩！3333    等着你pull我");
        
        System.out.println("github代码更新！！！！！");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("猫执行了动物的吃饭方法");
    }
}
