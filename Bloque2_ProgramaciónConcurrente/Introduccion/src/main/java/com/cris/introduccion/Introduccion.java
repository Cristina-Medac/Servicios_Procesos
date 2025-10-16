

package com.cris.introduccion;



public class Introduccion {

    public static void main(String[] args) {
        MiHilo h1 = new MiHilo();
        h1.start(); //se inicia el hilo
        /*No se llama directamente a run(), se usa start() 
        para que el hilo comience realmente y eso ejecutará el run*/
        
        MiHilo h2 = new MiHilo();
        h2.start(); //otro hilo paralelo
        
        
        
        
        
    }
}
