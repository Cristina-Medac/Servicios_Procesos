
/* Abrir el cmd y que haga un ping a la página de medac. Luego debe mostrar el código. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio5 {
    public static void main(String[] args) {

        /*
            /c --> indica que se va a ñaadir un comando
            /dir --> un ejemplo de comando
        */ 

                try{

                    // Lanzar CMD con un comendado (ping medac.es)
                    ProcessBuilder pb = new ProcessBuilder("CMD", "/c", "ping medac.es");
                    Process proceso = pb.start();

                    //Capturar y mostrar la salida del comando
                    BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));

                    String linea;
                    while ((linea = br.readLine()) != null){
                        System.out.println(linea);
                    }

                    //Esperar a que termine y mostrar el código
                    int exitCode = proceso.waitFor();
                    System.out.println("Proceso terminado con código: " + exitCode);
                }catch (Exception e){

                }

    }
    
}
