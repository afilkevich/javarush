package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception{
    int [] mas=new int[10];
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    for (int i=0;i<mas.length;i++){
        String s=reader.readLine();
        mas[i]=Integer.parseInt(s);

        }

        for (int i=0;i<mas.length/2;i++){
            int t=mas[i];
            mas[i]=mas[mas.length-1-i];
            mas[mas.length-1-i]=t;
        }
        for (int i=0;i<mas.length;i++){
            System.out.println(mas[i]);
        }
        //напишите тут ваш код

    }
}
