package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException,FileNotFoundException {



        BufferedReader filereader=new BufferedReader(new FileReader(args[0]));
        BufferedWriter filewriter= new BufferedWriter( new FileWriter(args[1]));
        while (filereader.ready()){
            String line=filereader.readLine();
            String[]arr=line.trim().split(" ");
            for (String x:arr){
                if (x.matches(".*[0-9].*"))
                    filewriter.write(x+" ");
            }
        }
        filereader.close();
        filewriter.close();
    }
}
