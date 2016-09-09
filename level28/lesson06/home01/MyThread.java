package com.javarush.test.level28.lesson06.home01;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Александр on 23.08.2016.
 */
public class MyThread extends Thread
{
    static AtomicInteger priopity=new AtomicInteger(1);

    public MyThread()
    {
        setMyPriority();
    }

    public MyThread(Runnable target)
    {
        super(target);
        setMyPriority();
    }

    public MyThread(ThreadGroup group, Runnable target)
    {
        super(group, target);
        setMyPriority();
    }

    public MyThread(String name)
    {
        super(name);
        setMyPriority();
    }

    public MyThread(ThreadGroup group, String name)
    {
        super(group, name);
        setMyPriority();
    }

    public MyThread(Runnable target, String name)
    {
        super(target, name);
        setMyPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name)
    {
        super(group, target, name);
        setMyPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize)
    {
        super(group, target, name, stackSize);
        setMyPriority();
    }
  private void setMyPriority(){
      setPriority(priopity.get());
     if (priopity.get()==10) priopity.set(0);
      priopity.incrementAndGet();
  }

}
