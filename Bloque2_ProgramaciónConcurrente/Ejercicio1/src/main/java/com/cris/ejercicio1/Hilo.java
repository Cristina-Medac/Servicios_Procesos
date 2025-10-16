
package com.cris.ejercicio1;


public class Hilo extends Thread{
    
    int numHilo;
    
    public Hilo (int i){
        this.numHilo = i;
    }
    
    public void run(){
        
        for (int i = 0; i<10; i++){
            System.out.println("Hilo " + numHilo + ": " + i);
            try{
                sleep(1000); 
                //con esta pausa salen en orden los numeros pero no los hilos
            }catch(InterruptedException e){
                
            }
        }
        
    }
}
