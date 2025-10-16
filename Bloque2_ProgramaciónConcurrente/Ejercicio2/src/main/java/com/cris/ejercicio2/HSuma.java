
package com.cris.ejercicio2;


public class HSuma extends Thread{
    
    int num1;
    int num2;
    
    public HSuma(int i, int ii){
        num1 = i;
        num2 = ii;
    }
    
    public void run(){
        
        System.out.println("Suma: " + (num1 + num2));
        
        
    }

}
