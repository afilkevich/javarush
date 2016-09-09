package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file1=reader.readLine();
        String file2=reader.readLine();
        reader.close();
        FileReader freader=new FileReader(file1);
        FileWriter writer=new FileWriter(file2);
        int count=0;
        while (freader.ready()){
            count++;
            int a= freader.read();
            if (count%2==0){
                writer.write(a);
            }

        }
        freader.close();
        writer.close();
    }
}
