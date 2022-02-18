/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* 2 * PI * RAIO */

/**
 *
 * @author Felpe Castro Ferreira
 */

import javax.swing.JOptionPane;

public class Ex11_Circunferencia {
    public static void main(String[] args) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio da circunferência: "));
        
        JOptionPane.showMessageDialog(null, "Comprimento da circunferência: " + (2 * Math.PI * raio));
    }
}
