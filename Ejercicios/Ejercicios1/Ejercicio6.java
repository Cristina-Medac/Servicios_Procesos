/* Desarrolla un programa que te devuelva (solo) la IP de tu ordenador.
 ipconfig -- IPv4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException { // o se hace un try-catch o se pone el throws

        ProcessBuilder pb = new ProcessBuilder("CMD", "/c", "ipconfig");
        Process proceso = pb.start();

        BufferedReader br = new BufferedReader(
            new InputStreamReader(proceso.getInputStream())); //meto en el bufer el proceso

        String linea;
        while((linea = br.readLine()) != null){ //voy leyendo las lineas una a una
            if(linea.contains("IPv4")){ //busco la línea que contenga "IPv4"
                int longitud = linea.length(); //mido la longitud de toda la cadena
                int espacio = linea.lastIndexOf(" "); //busco el último espacio, que está justo antes de la IP
                String ip = linea.substring(longitud, espacio); //guardo lo que hay entre ambos caracteres
                System.out.println(ip);
            }
        }

    }

}
