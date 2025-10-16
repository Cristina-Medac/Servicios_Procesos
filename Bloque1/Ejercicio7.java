
/* Repite el ejercicio 4, donde tu programa debe ser capaz de cerrar procesos,
 * pero ahora cierra los procesos pidiéndole al CMD que lo haga con el comando taskkill.
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("MENU DE OPCIONES:");
            System.out.println("1. Paint."); // mspaint
            System.out.println("2. Bloc de notas."); // notepad
            System.out.println("3. Calculadora."); // calc
            System.out.print("Introduzca la opción deseada (1-3): ");
            int opcion = sc.nextInt(); //revisar porqué sale dos veces la pregunta de cerrar
            sc.nextLine();
            String respuesta = " ";

            Process p = null; // Process p = paint.start();
            String nombre = " ";

            switch (opcion) {
                case 1:
                    ProcessBuilder paint = new ProcessBuilder("mspaint");
                    p = paint.start();
                    nombre = "mspaint.exe";
                    break;
                case 2:
                    ProcessBuilder bloc = new ProcessBuilder("notepad");
                    bloc.start();
                    nombre = "notepad.exe";
                    break;
                case 3:
                    ProcessBuilder calculadora = new ProcessBuilder("calc");
                    calculadora.start();
                    nombre = "calc.exe";
                    break;

                default:
                    break;
            }

            do {
                System.out.println("Quieres cerrar el programa?");
                respuesta = sc.nextLine();

                if (respuesta.equalsIgnoreCase("si")) {
                    ProcessBuilder cmd = new ProcessBuilder("CMD", "/c", "taskkill /IM " + nombre);
                    Process p1 = cmd.start(); //inicio el proceso
                    

                    
                }

            } while (!respuesta.equalsIgnoreCase("si"));

        } catch (Exception e) {

        }

        sc.close();
        
    }
    
}
