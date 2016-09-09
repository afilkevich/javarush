package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[]ch=s.toCharArray();// создаем массив символов и заносим туда переменную s
        ch[0]=Character.toUpperCase(ch[0]);//увеличиваем первую букву слова
        for (int i=0;i<ch.length;i++){//  проходим через цикл все слова в массиве
            if ((ch[i] == ' ') &&(ch[i+1]!=' '))//если символ[i] равняется " ", и символ [i+1]  не равняется пробелу
                ch[i+1]=Character.toUpperCase(ch[i+1]);// символ [i+1] увеличиваем
            s=new String(ch);// заносим в строковую s  символы из массива



        }

        System.out.println(s);
                //напишите тут ваш код
    }



}
