package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {

        ArrayList<String> l1=new ArrayList<String>();
        l1.add("dsff");
        l1.add("re3");
        ArrayList<String>l2=new ArrayList<String>();
        l2.add("Sfddf");
        l2.add("svb");
        ArrayList<String>l3=new ArrayList<String>();
        l3.add("frrfg");
        l3.add("rt");
        ArrayList<String>[]list=new ArrayList[3];
        list[0]=l1;
        list[1]=l2;
        list[2]=l3;
        //напишите тут ваш код

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}