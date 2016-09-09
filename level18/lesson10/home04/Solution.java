package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName1=reader.readLine();
        String fileName2=reader.readLine();
        FileInputStream input=new FileInputStream(fileName1);
        FileInputStream input1=new FileInputStream(fileName2);

        byte[]buf=new byte[input.available()];
        int count=input.read(buf);;
        byte[]buf1=new byte[input1.available()];
        int count1=input1.read(buf1);
        reader.close();
        input.close();
        input1.close();

        FileOutputStream output=new FileOutputStream(fileName1);

        output.write(buf1,0,count1);
        output.write(buf,0,count);
        output.close();






    }
}
