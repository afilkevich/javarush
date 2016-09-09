package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String sa=  reader.readLine();
        int a=Integer.parseInt(sa);
        if (a>0){
            int b = a+a;
            System.out.println(b);
        }
        else {
            int b=a+1;
            System.out.println(b);
        }



    }

}