package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.ad.AdvertisementManager;
import com.javarush.test.level27.lesson15.big01.kitchen.Cook;
import com.javarush.test.level27.lesson15.big01.kitchen.Waitor;

/**
 * Created by Александр on 15.08.2016.
 */
public class Restaurant
{
    public static void main(String[] args){
        Tablet tab= new Tablet(5);
        Cook amigoCook= new Cook("amigo");
        Waitor waitor=new Waitor();
        amigoCook.addObserver(waitor);
        tab.addObserver(amigoCook);
        tab.createOrder();




    }
}
