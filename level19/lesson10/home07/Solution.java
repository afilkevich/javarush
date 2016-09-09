package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String file2=args[0];
        String file3=args[1];
        BufferedReader reader=new BufferedReader(new FileReader(file2));
        BufferedWriter writer=new BufferedWriter(new FileWriter(file3));
        String line=null;

        while ((line=reader.readLine())!=null){
         String[]arr=line.split("\\s");
          String result="";
            for (String a:arr){
                if (a.length()>6)
                    result+=a+",";
            }
           // if (result.length()>=7)
           // {
                result = result.substring(0, result.length() - 1);
                writer.write(result + String.format("%n"));
           // }
    }
        reader.close();
        writer.close();
    }
}
