package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x=0;x<array.length;x++)
        {
            System.out.println(array[x]);
        }
    }

    public static void sort(int[] array)
    {
        for (int i =0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                /*Сравниваем элементы попарно,
                если имеют неправильный порядок ,то меняем местами

                 */
                if (array[j]<array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }

        //напишите тут ваш код
    }
}
