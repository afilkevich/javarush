package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.ad.AdvertisementManager;
import com.javarush.test.level27.lesson15.big01.ad.NoVideoAvailableException;
import com.javarush.test.level27.lesson15.big01.kitchen.Order;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Александр on 15.08.2016.
 */
public class Tablet extends Observable
{
   private final int number;
    private Logger logger=Logger.getLogger(Tablet.class.getName());

    public Tablet(int number)
    {
        this.number = number;
    }

    public void createOrder(){
        Order order;
        try
        {
            order=new Order(this);
            ConsoleHelper.writeMessage(order.toString());


            try
        {
            AdvertisementManager manager=new AdvertisementManager(order.getTotalCookingTime()*60);
            manager.processVideos();
        }
        catch (NoVideoAvailableException e)
        {
            logger.log(Level.INFO,"No video is available for the order " + order.toString());
        }
            setChanged();
            notifyObservers(order);


        }
        catch (IOException e)
        {
            logger.log(Level.SEVERE,"Console is unavailable.");
            return;
        }

    }

    @Override
    public String toString()
    {
        return " of Tablet{" +
                "number=" + number +
                '}';
    }


}
