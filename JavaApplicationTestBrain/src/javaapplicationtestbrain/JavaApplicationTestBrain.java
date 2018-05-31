/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationtestbrain;

import java.awt.Color;

/**
 *
 * @author Dejan
 */
public class JavaApplicationTestBrain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestFrame gB = new TestFrame();
        gB.setVisible(true);
        gB.getContentPane().setBackground(Color.WHITE);
        gB.setLocation(550, 140);
        
    }
    
}
