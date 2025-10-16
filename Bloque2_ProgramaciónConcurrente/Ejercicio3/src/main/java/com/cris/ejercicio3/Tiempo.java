package com.cris.ejercicio3;

public class Tiempo extends Thread {

   
    
    
    public void run() {
        
        
        
        int segundos = 30;

        for (int i = 30; i > 0; i--) {
            System.out.println(segundos + " seg");
            segundos--;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
