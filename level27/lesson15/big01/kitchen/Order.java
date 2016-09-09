package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;
import com.javarush.test.level27.lesson15.big01.Tablet;

import java.io.IOException;
import java.util.List;

/**
 * Created by Александр on 15.08.2016.
 */
public class Order
{
    private Tablet tablet;
    private List<Dish> dishes;

    public Order(Tablet tablet) throws IOException
    {
        this.tablet = tablet;
        this.dishes= ConsoleHelper.getAllDishesForOrder();
    }

    public int getTotalCookingTime(){
        int cookingTime=0;
        for (Dish d:dishes){
            cookingTime+=d.getDuration();
        }
        return cookingTime;
    }

    public boolean isEmpty(){

        return dishes.isEmpty();
    }

    @Override
    public String toString()
    {
        if (dishes.isEmpty()) return "";
        return "Your order: " +
                  dishes +
                tablet;
    }
}
