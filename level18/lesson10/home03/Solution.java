package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName1=reader.readLine();
        String fileName2=reader.readLine();
        String fileName3=reader.readLine();
        FileInputStream input1=new FileInputStream(fileName2);
        FileOutputStream output1=new FileOutputStream(fileName1);
        while (input1.available()>0){
            byte[]buf1=new byte[input1.available()];
            int count=input1.read(buf1);
            output1.write(buf1,0,count);
        }
        FileInputStream input2= new FileInputStream(fileName3);
        while (input2.available()>0){
            byte[]buf2=new byte[input2.available()];
            int coun1=input2.read(buf2);
            output1.write(buf2,0,coun1);
            }
        reader.close();
        input1.close();
        input2.close();
        output1.close();

    }
}
