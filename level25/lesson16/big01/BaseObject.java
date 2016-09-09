package com.javarush.test.level25.lesson16.big01;

/**
 * Created by Александр on 20.07.2016.
 */
public class BaseObject
{
    protected double x;
    protected double y;
    protected double radius;
    private boolean isAlive;

    public BaseObject(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isAlive=true;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getRadius()
    {
        return radius;
    }

    public boolean isAlive()
    {
        return isAlive;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void move(){}
    public void draw(Canvas canvas){}
    public void die(){isAlive=false;}
    /*
    проверяем столкнулись ди обьекты .
     если да-то возвращаем true
     */
    public boolean isIntersec(BaseObject o){
        double dx = x- o.x;
        double dy = y - o.y;
        double destination=Math.sqrt(dx * dx + dy * dy);
        double destination2=Math.max(radius,o.radius);
        return destination<destination2;

    }
    public void checkBorders(double minx,double maxx,double miny,double maxy){
        if (x<minx)x=minx;
        if (x>maxx)x=maxx;
        if (y<miny)y=miny;
        if (y>maxy) y=maxy;

    }
}
