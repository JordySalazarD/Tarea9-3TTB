/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo-PC
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        int valor1 = 0;
        int valor2 = 0;
        int resultado;
        System.out.println("Ingrese el primer numero");
        valor1 = reader.nextInt();
        System.out.println("ingrese el segundo numero");
        valor2 = reader.nextInt();
        
        resultado = valor1 + valor2;
        
        System.out.println("La suma de "+ valor1 + "+" + valor2 + "="+resultado);
        
       
    }
    
}
