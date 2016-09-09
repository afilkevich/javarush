package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями.ъ
 Придумай и реализуй 10 различных конструкторов для него.
  Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String familia;
        int age;
        int weight;
        String respublic;
        String city;
        public Human(String name,String familia,int age, int weight, String respublic,String city){
            this.name=name;
            this.familia=familia;
            this.age=age;
            this.weight=weight;
            this.respublic=respublic;
            this.city=city;
        }
        public Human(String name,String familia,int age,int weight,String respublic){
            this.name=name;
            this.familia=familia;
            this.age=age;
            this.weight=weight;
            this.respublic=respublic;
            this.city="unknown city";
        }
        public Human(String name,String familia,int age,int weight){
            this.name=name;
            this.familia=familia;
            this.age=age;
            this.weight=weight;
            this.respublic="All world";
            this.city="uknown city";
        }
        public Human(String name,String familia,String respublic,String city){
            this.name=name;
            this.familia=familia;
            this.respublic=respublic;
            this.city=city;
            this.age=22;
            this.weight=55;
        }
        public Human(String name,String familia,int age,String respublic,String city){
            this.name=name;
            this.familia=familia;
            this.age=age;
            this.weight=60;
            this.respublic=respublic;
            this.city=city;
        }
        public Human (String name,String familia,String respublic,int weight){
            this.name=name;
            this.familia=familia;
            this.respublic=respublic;
            this.age=30;
            this.weight=weight;
            this.city="Maybe brest";
        }
        public Human(String name,String familia,int age,String respublic){
            this.name=name;
            this.familia=familia;
            this.age=age;
            this.respublic=respublic;
            this.weight=50;
            this.city="Uknow city";
        }
        public  Human( int age,int weight,String respublic,String city) {
            this.name="uknown name";
            this.familia="unknown familia";
            this.age=age;
            this.weight=weight;
            this.respublic=respublic;
            this.city=city;
        }
        public Human(String name,int age){
            this.name=name;
            this.age=age;
        }
        public Human(String name,String familia){this.name=name;this.familia=familia;}
        //напишите тут ваши переменные и конструкторы
    }
}
