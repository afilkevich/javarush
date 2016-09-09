package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fil1=reader.readLine();
        String fil2=reader.readLine();
        String fil3=reader.readLine();
        FileInputStream inputStream=new FileInputStream(fil1);
        FileOutputStream outputStream=new FileOutputStream(fil2);
        FileOutputStream outputStream2=new FileOutputStream(fil3);
        byte[]buff=new byte[inputStream.available()];

        while (inputStream.available()>0){
          int count=inputStream.read(buff);
            int lengthf2=count/2+count%2;
            int lengthf3=count-lengthf2;
            outputStream.write(buff,0,lengthf2);
            outputStream2.write(buff,lengthf2,lengthf3);


        }
        reader.close();
        inputStream.close();
        outputStream.close();
        outputStream2.close();



    }
}
