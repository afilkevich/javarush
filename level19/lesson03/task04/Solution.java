package com.javarush.test.level19.lesson03.task04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Calendar;
import java.util.Date;

import java.util.GregorianCalendar;
import java.util.*;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке.
 Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
        File file=new File("C:\\file1.txt");
        FileInputStream in=new FileInputStream(file);
        Scanner scan=new Scanner(in);
        PersonScannerAdapter adap=new PersonScannerAdapter(scan);
        String person="hf-fgfg-1";
        person=person.replaceAll("[^a-x,^0-9]","");
        System.out.println(person);
        adap.close();

    }
    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner  scan;
        public PersonScannerAdapter(Scanner scan){
            this.scan=scan;
        }

        @Override
        public Person read() throws IOException
        {

            String [] data=scan.nextLine().split(" ");
            Calendar birthday=new GregorianCalendar(Integer.parseInt(data[5]),Integer.parseInt(data[4])-1,Integer.parseInt(data[3]));
            return new Person(data[1],data[2],data[0],birthday.getTime());




        }

        @Override
        public void close() throws IOException
        {
            scan.close();

        }
    }
}
