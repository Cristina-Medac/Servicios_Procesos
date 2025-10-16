

/* Crea 4 clases:
- una se encargara de recibir dos numeros por parametro y sumarlos
- otra de recibir dos numeros y restarlos
- otra de multiplicarlos
- otra de dividirlos.

en tu main, pide al usuario dos números y crea 4 hilos correspondientes a cada una
de las clases anteriores, pasandole los numeros de  usuario, de forma que las 4 
cuentas dpuedan realizars "simulatenamente"*/


package com.cris.ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        System.out.println("Introduce dos números:");
        int num1 = sc.nextInt();
        sc.nextLine();
        int num2 = sc.nextInt();

        
        HSuma s = new HSuma(num1, num2);
        HResta r = new HResta(num1, num2);
        HMultiplicar m = new HMultiplicar(num1, num2);
        HDividir d = new HDividir(num1, num2);
       
       try{
        s.start();

        r.start();
        m.start();
        d.start();
           
       }catch(Exception e){
           
       }
       
       
        
       
       
       
        
        
        
    }
}
