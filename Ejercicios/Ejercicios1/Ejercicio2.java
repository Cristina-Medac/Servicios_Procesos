
/*Escribe un algoritmo capaz de abrir directamente la web de Medac
tanto en Chrome como en edge.*/

import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException, InterruptedException {

        /* MODO CHAPUCERO 
        ProcessBuilder medacC = new ProcessBuilder("\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"", 
        "https://instituto.medac.es/");
        medacC.start();
        */

        try{

            String url =   "https://instituto.medac.es/";
            String rutaChrome = "\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"";
            String rutaEdge = "\"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe\"";
    
            ProcessBuilder chrome = new ProcessBuilder(rutaChrome,url);
            chrome.start();
    
            ProcessBuilder edge = new ProcessBuilder(rutaEdge, url);
            edge.start();
        }catch (Exception e){

        }



        






    }
}
