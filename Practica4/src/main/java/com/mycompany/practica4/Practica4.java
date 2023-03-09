/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica4;


public class Practica4 {
    
    public Practica4 (String Titulo) {
        Vista ventanaN = new Vista();
        ventanaN.setSize(450,350);
        ventanaN.setVisible(true);
    }
    
    public static void main(String[] args) {
        Practica4 form = new Practica4("Ventana Creada");
        Vista ventana = new Vista();
    }
}
