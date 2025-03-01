/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mipassword;

/**
 *
 * @author Javier Gomez Riz
 */
import javax.swing.JFrame;
import ui.MainUI;

public class Mipassword {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Generador de Contraseñas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 370);
        frame.setLocationRelativeTo(null); 
        MainUI mainPanel = new MainUI();
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
