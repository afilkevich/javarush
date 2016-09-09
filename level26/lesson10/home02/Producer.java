package com.javarush.test.level26.lesson10.home02;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Александр on 28.07.2016.
 */
public class Producer implements Runnable
{
    protected ConcurrentHashMap<String,String> map;

    public Producer(ConcurrentHashMap<String, String> map)
    {
        this.map = map;
    }
    public void run(){
        try
        {
            int i=1;
            while (true){
                System.out.println(String.format("Some text for %d",i++));
                Thread.sleep(500);
            }

        }
        catch (InterruptedException e){
            System.out.println(String.format("[%s] thread was terminated",Thread.currentThread().getName()));
        }

    }
}
