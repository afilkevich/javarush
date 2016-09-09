package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        Thread threada=new Thread(new SpecialThread());
        list.add(threada);
        Thread threadb=new Thread(new SpecialThread());
        list.add(threadb);
        Thread threadc=new Thread(new SpecialThread());
        list.add(threadc);
        Thread threadd=new Thread(new SpecialThread());
        list.add(threadd);
        Thread threade=new Thread(new SpecialThread());
        list.add(threade);
        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
