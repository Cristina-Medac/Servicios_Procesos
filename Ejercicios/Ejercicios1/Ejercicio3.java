
/* Crea un programa que pregunte al usuario qué navegador desea usar (de entre los disponibles en tu equipo),
 *  y a qué web quiere acceder. Depuses, el software debe abrir la web en el navegador deseado.
 */

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException, InterruptedException{

        try{

            Scanner sc = new Scanner (System.in);
            System.out.println("Indica que navegador desea utilizar: ");
            System.out.println("1. Chrome. ");
            System.out.println("2. Edge. ");
            System.out.println("Indique la respuesta (1-2): ");
            String opcion = sc.nextLine();
    
    
            System.out.println("Introduzca el nombre de la página a la que desea acceder: ");
            String pagina = sc.nextLine();
    
            
            String paginaChrome = "\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"";
            String paginaEdge = "\"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe\"";
            
        }catch (Exception e){

        }

        

        



        




    }
}
