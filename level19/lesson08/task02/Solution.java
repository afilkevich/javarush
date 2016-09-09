package com.javarush.test.level19.lesson08.task02;

/* Ридер обертка 2
В методе main подмените объект System.out написанной вами ридер-оберткой
 по аналогии с лекцией
Ваша ридер-обертка должна заменять все подстроки "te" на "??"
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Вывести модифицированную строку в консоль.
*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream oldStream=System.out;
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        PrintStream newStream= new PrintStream(outputStream);
        System.setOut(newStream);
        testString.printSomething();
        String line=outputStream.toString();
        line=line.replaceAll("te","??");
        System.setOut(oldStream);
        System.out.println(line);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
    }
    }

    }

