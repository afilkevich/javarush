package com.javarush.test.level26.lesson02.task01;

import java.util.*;

/* Почитать в инете про медиану выборки
Реализовать логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы
Вернуть отсортированный массив от минимального расстояния до максимального
Если удаленность одинаковая у нескольких чисел, то выводить их в порядке возрастания
*/
public class Solution {
    public static void main(String[] args){
        Integer[]arr={5,8,15,17};
       sort(arr);


    }
    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        final double median;
        if (array.length%2!=0){
            median=array[array.length/2];
        }
        else {
            median=(array[array.length/2-1]+array[array.length/2]) /2;
        }
        Comparator<Integer>compareByMedian=new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return (int) (Math.abs(o1-median)-Math.abs(o2-median));
            }
        };
       List list=Arrays.asList(array);
        Collections.sort(list,compareByMedian);
        array= (Integer[]) list.toArray();


                             //implement logic here
        return array;
    }
}
