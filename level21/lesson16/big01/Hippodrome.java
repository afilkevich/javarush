package com.javarush.test.level21.lesson16.big01;



import java.util.ArrayList;

public class Hippodrome
{
    public ArrayList<Horse> horses=new ArrayList<>();
    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException
    {
        game=new Hippodrome();

        Horse horse1=new Horse("AD",3.0,0);
        Horse horse2=new Horse("DF",3.0,0);
        Horse horse3=new Horse("FG",3.0,0);

       game. getHorses().add(horse1);
       game. getHorses().add(horse2);
       game. getHorses().add(horse3);

       game.run();
        game.printWinner();
    }
    public Horse getWinner(){
        Horse winner=this.getHorses().get(0);
        for (int i=1;i<this.getHorses().size();i++){
            if (winner.getDistance()<this.getHorses().get(i).getDistance()){
                winner=this.getHorses().get(i);
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is "+this.getWinner().getName()+"!");
    }


    public ArrayList<Horse> getHorses()
    {
        return horses;
    }
    public void move(){
        for (Horse a:getHorses()){
            a.move();
        }

    }
    public void print(){
        for (Horse a:getHorses()){
            a.print();

        }
        System.out.println();
        System.out.println();
    }
    public void run() throws InterruptedException
    {
        for (int i=0;i<100;i++){
            move();
            print();
            Thread.sleep(200);

        }
    }
}
