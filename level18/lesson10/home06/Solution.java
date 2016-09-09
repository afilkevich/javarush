package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.*;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file=args[0];
        FileInputStream reader=new FileInputStream(file);
        SortedMap<Integer,Integer> map=new TreeMap<>();
        while (reader.available()>0){
            int a=reader.read();

            if (!map.containsKey(a)){
                map.put(a,1);
            }
            else {int old=map.get(a);
            map.put(a,old+1);}
            }
        reader.close();
        for (Map.Entry<Integer,Integer> item:map.entrySet()){
            System.out.println((char)(int)item.getKey()+" "+item.getValue());
        }



    }
}
