/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;

/**
 *
 * @author guest-ja9hva
 */
public class Principal {
    public static void main(String[] args) {
        SplashScreen spl = new SplashScreen();
        spl.setVisible(true);
        //caso fosse usar "df.setUndecorated(true)" agora , daria erro
        //para isso
        spl.dispose();
        spl.setUndecorated(true);
        spl.setLocationRelativeTo(null);
        spl.setVisible(true);
        
        try {
            Thread.sleep (3000);
        }
        catch (InterruptedException ex) {}
        
        spl.dispose();
        
        CalculoModa cm = new CalculoModa();
        cm.setLocationRelativeTo(null);
        cm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cm.setVisible(true);
        }
}
