
/*Simula un menu de inicio, que pregunte al usuario qué programa desea lanzar, mostrándole una lista de 3 opciones.
 * En función de la que el usuario elija, el programa lanzará un software u otro.
 * Una vez lanzado preguntará por consola si desea cerrarlo. Cuando el usuario escriba "si" en consola, Java cerrará
 * el proceso ejcutado (si escribe cualquier otra cosa, volvemos a preguntar)
*/

import java.util.Scanner;

public class Ejercicio4 {
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

            Process p = null;

            switch (opcion) {
                case 1:
                    ProcessBuilder paint = new ProcessBuilder("mspaint");
                    p = paint.start();
                    break;
                case 2:
                    ProcessBuilder bloc = new ProcessBuilder("notepad");
                    bloc.start(); // creamos un proceso
                    break;
                case 3:
                    ProcessBuilder calculadora = new ProcessBuilder("calc");
                    calculadora.start();
                    break;

                default:
                    break;
            }

            do {
                System.out.println("Quieres cerrrar el programa?");
                respuesta = sc.nextLine();

                if (respuesta.equalsIgnoreCase("si")) {
                    p.destroy(); // finaliza el proceso
                }

            } while (!respuesta.equalsIgnoreCase("si"));

        } catch (Exception e) {

        }

        sc.close();
    }
}
