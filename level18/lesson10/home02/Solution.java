package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        String name=args[0];
        FileReader reader=new FileReader(name);
        int countLit=0;
        int count=0;
        while (reader.ready()){
            char a=(char) reader.read();
            if (String.valueOf(a).equals(" ")) count+=1;
            else countLit+=1;

        }
        reader.close();
        countLit=countLit+count;

        double a=((double) count/countLit)*100;
        System.out.print(String.format("%.2f",a));


    }
}
