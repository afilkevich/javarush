package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private int height;
    private String color;
    public Dog(String name){
        this.name=name;
    }
    public Dog(String name,int height){
        this.name=name;
        this.height=height;
    }
    public Dog(String name,String color,int height){
        this.name=name;
        this.color=color;
        this.height=height;
    }

    //напишите тут ваш код

}