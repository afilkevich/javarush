package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Александр on 27.04.2016.
 */
public class Computer
 {
     private Monitor monitor;
     private Mouse mouse;
     private Keyboard keyboard;

     public Computer()
     {
         this.keyboard= new Keyboard();
         this.monitor= new Monitor();
         this.mouse= new Mouse();
     }

     public Keyboard getKeyboard()
     {
         return keyboard;
     }

     public Mouse getMouse()
     {

         return mouse;
     }

     public Monitor getMonitor()
     {

         return monitor;
     }
 }
