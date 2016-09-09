package com.javarush.test.level27.lesson15.big01.kitchen;

/**
 * Created by Александр on 15.08.2016.
 */
public enum Dish
{

        Fish(25), Steak(30), Soup(15), Juice(5), Water(3);


        private int duration;

      Dish(int i)
    {
        duration=i;
    }

    public int getDuration()
    {
        return duration;
    }

    public static String allDishesToString(){
           Dish[] dishArr= Dish.values();
            StringBuilder line=new StringBuilder();
            for (Dish d:dishArr){
                line.append(d.toString());
                line.append(",");
                line.append(" ");
            }

            line.delete(line.length()-2,line.length());
            String dish=line.toString().trim();

            return dish;

        }

    }


