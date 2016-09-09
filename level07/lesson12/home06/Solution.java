package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfather1=new Human("ded1",true,78,null,null);
        Human grandmother1=new Human("baba1",false,76,null,null);
        Human grandfather2=new Human("ded2",true,67,null,null);
        Human grandmother2=new Human("bab2",false,65,null,null);
        Human father=new Human("papa",true,45,grandfather1,grandmother1);
        Human mother=new Human("mama",false,43,grandfather2,grandmother2);
        Human baby1=new Human("old",true,12,father,mother);
        Human baby2=new Human("midl",false,10,father,mother);
        Human baby3=new Human("jun",true,7,father,mother);

        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(baby1);
        System.out.println(baby2);
        System.out.println(baby3);

        //напишите тут ваш код
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human  father;
        private Human   mother;

        public Human(String name,boolean sex,int age,Human father,Human mother){
            this.name=name;
            this.sex=sex;
             this.age = age;
            this.father=father;
            this.mother=mother;
        }


        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
