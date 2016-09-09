package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций
(быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
        ArrayList<Objects> ar; ar = new ArrayList<>();
        return ar; //напишите тут ваш код

    }

    public static List  getListForSet()
    {
        ArrayList<String> ad=new ArrayList<>();
        return ad;
        //напишите тут ваш код

    }

    public static List  getListForAddOrInsert()
    {
        LinkedList<String>a=new LinkedList<>();
        return a;
        //напишите тут ваш код

    }

    public static List  getListForRemove()
    {
        LinkedList<String>s=new LinkedList<>();
        return s;
        //напишите тут ваш код

    }
}
