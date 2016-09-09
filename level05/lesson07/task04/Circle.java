package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    int centerX;
    int centerY;
    int radius;
    int width;
    String color;
    public void initialize(int centerX,int centerY,int radius){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
    }
    public void initialize(int centerX,int centerY,int radius,int width){//инмициализируем обект с 4известными перенными
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
    }
    public void initialize(int centerX, int centerY, int radius, int width, String color){//инициализируем обьект с 5 известными переменными
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        this.color=color;
    }
    //напишите тут ваш код

}
