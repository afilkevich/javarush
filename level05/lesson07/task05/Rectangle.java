package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int top;
    int left;
    int width;
    int height;
    public  void initialize(int top,int left, int width,int height ){//все параметры заданы
        this.top=top;
        this.left=left;
        this.height=height;
        this.width=width;
    }
    public void initialize(int top, int left){// заданы верхняя и левая кордината
        this.top=top;
        this.left=left;
        width=0;
        height=0;
        }
    public void initialize(int left,int top, int height){// высота равна ширине
        this.left=left;
        this.top=top;
        this.height=height;
        this.width=height;
    }
    public void initialize(Rectangle rect){
        this.top=rect.top;
        this.height=rect.height;
        this.width=rect.width;
        this.left=rect.left;
    }
    //напишите тут ваш код

}
