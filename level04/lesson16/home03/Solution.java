package com.javarush.test.level04.lesson16.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int m=0;
        for (;true;){
            int s=Integer.parseInt(reader.readLine());
            m=m+s;
            if(s==-1)break;
        }
        System.out.print(m);


        //напишите тут ваш код
    }
}
