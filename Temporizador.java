package timer;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class Temporizador {

    @SuppressWarnings("null")
    public static void main(String[] args) throws InterruptedException {

        int minuto, minutos, segundos, milisegundos, lineas;
        lineas = 10;
        minuto = 0;
        minutos = 0;
        segundos = 0;
        milisegundos = 0;
        while(minuto != 2 || minutos != 5) {
            Thread.sleep(1000);
            milisegundos = milisegundos + 1;
            if(milisegundos > 9) {
                milisegundos = 0;
                segundos = segundos + 1;
            }
            if(segundos > 5) {
                segundos = 0;
                minutos = minutos + 1;
            }
            if(minutos > 9) {
                minutos = 0;
                minuto = minuto + 1;
            }
            
            for (int i=0; i < lineas; i++)
            {
            System.out.println("");
            }
            System.out.println("Temporizador: " + minuto + minutos + ":" + segundos + milisegundos);
            
            }
         
                
            
                
                JFrame ventana = new JFrame("¡Tiempo agotado!");
                ventana.setSize(250,100);
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
                ventana.setLayout(null);
                ventana.getContentPane().setBackground(new java.awt.Color(0, 102, 0));
                
                final JButton boton = new JButton("Ok");
                boton.setBounds(80,5,90,50);
                boton.setFocusable(false);
                //boton.setBackground(java.awt.Color.red);
                ventana.add(boton);
              
            
                boton.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                 if (e.getSource()==boton) {
                        System.exit(0);
                    }    
    }});
            }
}