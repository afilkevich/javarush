package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Александр on 16.08.2016.
 */
public class Waitor implements Observer
{
    @Override
    public void update(Observable o, Object arg)
    {
        Order ord=(Order) arg;
        Cook cook=(Cook) o;
        ConsoleHelper.writeMessage( ord.toString() + " was cooked by " + cook.toString());
    }
}
