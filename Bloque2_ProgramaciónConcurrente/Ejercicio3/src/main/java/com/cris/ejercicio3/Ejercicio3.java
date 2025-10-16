
/* Crea el juego de adivinar el número, en el que el programa genera un número 
aleatorio entre el  y el 100 (sin mostrarlo al usuario) y va pidiendo números 
al usuario indicándole "mayor" o "menor" hasta que este consiga adivinarlo.

Mientras, otro hilo tentrá una marcha atrás, dandole al jugador tan solo 30 
segundos para adivinar el número.

EXTRA: implementa un hilo más encargado de mostrar, en momentos aleatorios, mensajes de animo al jugador.*/

package com.cris.ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int numAleatorio = (int)(Math.random()*101);
        int numUsuario = 103;
        
        Tiempo seg = new Tiempo();
        Animo mensaje = new Animo();
        seg.start();
        mensaje.start();
        
        System.out.println("Introduce un número: ");

            while(numUsuario != numAleatorio){
                numUsuario = sc.nextInt();
                sc.nextLine();
                if(numAleatorio > numUsuario){
                    System.out.println("Tienes que buscar un número MAYOR");
                }else if (numAleatorio < numUsuario){
                    System.out.println("Tienes que buscar un número MENOR");
                }else {
                    System.out.println("__________ CORRECTO!!!!! _______");
                    break;
                }
        

            
      
        
            
            
            
        }
        
        
        
        
        
    }
}
