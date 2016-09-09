package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human ch1=new Human("AS",true,6);
        Human ch2=new Human("FD",false,9);
        Human ch3=new Human("RFF",true,8);
        ArrayList<Human> child=new ArrayList<Human>();
        child.add(ch1);
        child.add(ch2);
        child.add(ch3);
        Human dad=new Human("T",true,45,child);
        Human mom=new Human("G",false,43,child);
        Human gdad1=new Human("t",true,69);
        Human gdad2=new Human("R",true,71);
        Human gmom1=new Human("T",false,74);
        Human gmom2=new Human("E",false,75);

        for(Human a:child){
            System.out.println(a);
        }

        System.out.println(mom);
        System.out.println(dad);
        System.out.println(gdad1);
        System.out.println(gdad2);
        System.out.println(gmom1);
        System.out.println(gmom2);

        //напишите тут ваш код
    }

    public static class Human
            {
                public String name;
                public boolean sex;
                public int age;
                public ArrayList<Human>children=new ArrayList<Human>();

                public Human(String name,boolean sex,int age){
                    this.name=name;
                    this.sex=sex;
                    this.age=age;
                }
                public Human(String name,boolean sex,int age,ArrayList<Human>children){
                    this.name=name;
                    this.sex=sex;
                    this.age=age;
                    this.children=children;
                }
        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
