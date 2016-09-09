package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        Map<String,Double> map=new TreeMap<String, Double>();
        String filename=args[0];
        BufferedReader reader=new BufferedReader(new FileReader(filename));
        while (reader.ready()){
            String line=reader.readLine();
            String[]arr=line.split(" ");
            String name=arr[0];
            Double num =Double.parseDouble(arr[1]);
            if (!map.containsKey(name)){
                map.put(name,num);
            }
            else {
                Double a=map.get(name);
                map.put(name,num+a);
            }
        }
        reader.close();
        double max=0;
        String maxname=null;
        for (Map.Entry<String,Double > item:map.entrySet()){
            String name=item.getKey();
            double num=item.getValue();
            if (num>max){
                max=num;
                maxname=name;
            }
        }
        System.out.println(maxname);
    }
}