/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

import javax.swing.SwingUtilities;

/**
 *
 * @author Lasitha
 */
public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
           new tictactoegui();
            }
        });
        
       
    }
}
