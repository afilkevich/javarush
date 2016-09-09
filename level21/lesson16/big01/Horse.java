package com.javarush.test.level21.lesson16.big01;

/**
 * Created by Александр on 16.06.2016.
 */
public class Horse
{
    private String name;
    private double speed;
    private double distance;
    public Horse(String name,double speed,double distance){
        this.name=name;
        this.speed=speed;
        this.distance=distance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public double getSpeed()     {  return speed;    }

    public double getDistance()
    {
        return distance;
    }

    public String getName()
    {
        return name;
    }
    public void move(){

        distance+=speed*Math.random();
    }
    public void print(){
        int dist=(int) Math.round(getDistance());
        for (int i=0;i<dist;i++){ System.out.print(".");
        }
        System.out.println(this.getName());
    }
}
