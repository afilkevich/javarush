package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file=reader.readLine();
        reader.close();
        BufferedReader filereader=new BufferedReader(new FileReader(file));
        while (filereader.ready()){
            String line=filereader.readLine();
            StringBuffer a=new StringBuffer(line);
            String reverse=a.reverse().toString();
            System.out.println(reverse);
        }
        filereader.close();
    }
}
