
package com.cris.ejercicio2;


public class HMultiplicar extends Thread{
    
    int num1;
    int num2;
    
    public HMultiplicar(int i, int ii){
        num1 = i;
        num2 = ii;
    }
    
    
public void run(){
    
    System.out.println("Multiplicación: " + (num1 * num2));
        
    }
}
