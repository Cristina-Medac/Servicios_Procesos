
package com.cris.ejercicio3;


public class Animo extends Thread {
    public void run(){
        
         int animoRandom = (int)(Math.random()*31);
         String [] mensajes = {"Venga!!" , "ANIMO!!", "No te rindas!", "Uy casiii"};
         int msj;
         int tiempo;
         
         for (int i = 0; i < 5; i++){
             msj = (int)(Math.random()*4);
             System.out.println(mensajes[msj]);
             tiempo = (int)(2000 + Math.random()*3000);
             //se suma 2000 (2 segundos) para asegurarnos de que minimo hayan 2 segundos entre mensaje y mensje
            try{
                
             sleep(tiempo);
            }catch(Exception e){
                
            }
         }
         
         
         
        
    }

}
