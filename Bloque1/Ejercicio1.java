
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        
       //try {  ----tambien se puede hace con un try catch

        //los programas nativos de windows no necesitan ruta

        //ejecutar la calculadora de windows
        ProcessBuilder calculadora = new ProcessBuilder("calc"); 
        calculadora.start();

        //la clase processbulder solo para lanzar
        //la clase process para ya hacer mas manipulaciones

        // esperar un momento para asegurarnos de que la calculadora se abra
        //le pedimos que espere 2000 milisegundos antes de pasar a la siguiente linea.
        Thread.sleep(2000);

        //ejecutar el bloc de notas de windows
        ProcessBuilder notepad = new ProcessBuilder ("notepad");
        notepad.start();


        //espear un momento para asegurarnos de que l bloc de notas se abra
        Thread.sleep(2000);

        //Ejecutar paint de windows
        ProcessBuilder paint = new ProcessBuilder("mspaint");
        paint.start();

        //Ejecutar un programa que no sea nativo
        //hay que poner la ruta hasta el .exe del programa que queramos abrir.
        ProcessBuilder github = new ProcessBuilder ("C:\\Users\\PC201\\AppData\\Local\\GitHubDesktop\\GitHubDesktop.exe");
        github.start();
        
        /*
        }catch (Exception e){
         e.printStackTrace()}
        */  
    

        
    }
}
