
package com.cris.ejercicio2;


public class HDividir extends Thread{
    
    int num1;
    int num2;
    
    public HDividir(int i, int ii){
        num1 = i;
        num2 = ii;
    }
    
    
    public void run(){
        
        System.out.println("División: " + (num1/num2));
        
    }
}
