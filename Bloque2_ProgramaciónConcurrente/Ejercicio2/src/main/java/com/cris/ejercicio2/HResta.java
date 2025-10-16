
package com.cris.ejercicio2;


public class HResta extends Thread {
    
    int num1;
    int num2;
    
    public HResta(int i, int ii){
        num1 = i;
        num2 = ii;
    }
    
    
public void run(){
    
    System.out.println("Resta: " + (num1 - num2));
        
    }
}
