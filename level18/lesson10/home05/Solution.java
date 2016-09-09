package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file1=reader.readLine();
        String file2=reader.readLine();
        ArrayList<String>list=new ArrayList<>();
        reader.close();
        BufferedReader filereader=new BufferedReader(new FileReader(file1));
        BufferedWriter writer=new BufferedWriter(new FileWriter(file2));
        while (filereader.ready()){
            String line=filereader.readLine();
            String[]arr=line.split(" ");

            for (int i=0;i<arr.length;i++){
                double a=Double.parseDouble(arr[i]);

                String x= String.valueOf(Math.round(a));
                list.add(x+" ");
                 }

        }
        for (String a:list){
            writer.write(a);
             }
        filereader.close();
        writer.close();

    }
}
