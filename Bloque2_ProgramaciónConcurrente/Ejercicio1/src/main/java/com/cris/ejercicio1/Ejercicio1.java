
/* Crea una aplicación Java que implemente una clase Hilo que imprime 
números del 0 al 10. Crea 4 hilos de dicha clase y comprueba cómo se muestran 
los datos en pantalla.*/

package com.cris.ejercicio1;


public class Ejercicio1 {

    public static void main(String[] args) {
       Hilo h1 = new Hilo(1);
       Hilo h2 = new Hilo(2);
       Hilo h3 = new Hilo(3);
       Hilo h4 = new Hilo(4);
       
       try{
           
       h1.start();
       h1.join();
       
       h2.start();
       h2.join();
       
       h3.start();
       h3.join();
       
       h4.start();
       h4.join();
       
       /* El JOIN hace que el hilo termine completamente su programacion
       o tarea antes de que empiecen los demas. Así, hasta que el h1 no termine
       de mostrar todos sus números, no empezará el h2.      
       */
 
       }catch(Exception e){
           
       }
       
       
       
       
       
       
       
    }
}
