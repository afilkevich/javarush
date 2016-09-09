package com.javarush.test.level26.lesson15.big01;

/**
 * Created by Александр on 29.07.2016.
 */
public enum Operation
{
    INFO, DEPOSIT, WITHDRAW, EXIT, LOGIN;

    public static Operation getAllowableOperationByOrdinal(Integer i){
        Operation oper=null;
       switch (i){
           case 0: throw  new IllegalArgumentException();
           case 1:oper=INFO;
               break;
           case 2:oper=DEPOSIT;
               break;
           case 3:oper=WITHDRAW;
               break;
           case 4:oper=EXIT;
               break;
           default:throw new IllegalArgumentException();

       }
        return oper;
    }
}
