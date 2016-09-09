package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();

       ArrayList<Character>line1=new ArrayList<Character>();
        ArrayList<Character>line2=new ArrayList<Character>();

        for (int i=0;i<s.length();i++)
        {

            if (isVowel(s.charAt(i))) line1.add(s.charAt(i));


            else if (s.charAt(i) != ' ') line2.add(s.charAt(i));
        }


        for(int i=0;i<line1.size();i++)
            System.out.print(line1.get(i)+" ");
        System.out.println();
       for (int i=0;i<line2.size();i++)System.out.print(line2.get(i)+" ");
        //напишите тут ваш код
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
