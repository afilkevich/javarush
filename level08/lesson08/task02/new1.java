package com.javarush.test.level08.lesson08.task02;

/**
 * Created by Александр on 14.03.2016.
 */
import javax.swing.JOptionPane;
public class new1
{
    public  static void main(String args[]){
        String username=JOptionPane.showInputDialog("Логин:");
        String password=JOptionPane.showInputDialog("Пароль:");
        if (username.equals("Саша")&& password.equals("Катя")){
            JOptionPane.showMessageDialog(null,"Катя+Саша= прекрасная семья.И у них все будет прекрасно");

        }
    }
}
