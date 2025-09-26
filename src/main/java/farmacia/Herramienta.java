package farmacia;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Herramienta {
    // Esta clase es publica por que son las herramientas para pedir los datos y sea mas facil la lectura de codigo



    public static int pedirEntero(String mensaje, Scanner scanner) {
        while(true){
            try {
                System.out.print(mensaje);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Formato de numero incorrecto, favor de introducir un numero entero");
                scanner.nextLine();
            }
        }
    }


    public static String pedirString(String mensaje, Scanner scanner ){
        System.out.print(mensaje);
        return scanner.nextLine();

    }

    public static LocalDate pedirFecha(String mensaje, Scanner scanner) {
        while (true) {
            try {
                System.out.print(mensaje);
                String textoFecha = scanner.nextLine();
                return LocalDate.parse(textoFecha);
            } catch (DateTimeParseException e) {
                System.out.println("Formato de fecha incorrecto, favor de introducir la fecha en formato yyyy-mm-aa");
            }


        }
    }

    public static char pedirChar(String mensaje, Scanner scanner) {
        while (true) {
            try {
                System.out.print(mensaje);
                return scanner.next().toLowerCase().charAt(0);
            } catch (InputMismatchException e) {
                System.out.println("Formato de caracter incorrecto, favor de introducir un caracter");
                scanner.next();
            }
        }
    }


    public static Boolean pedirBool(String mensaje, Scanner scanner ) {
        while (true) {
            try {
                System.out.print(mensaje);
                return scanner.nextBoolean();
            } catch (InputMismatchException e) {
                System.out.println("Formato de booleano incorrecto, favor de introducir un booleano true o false");
                scanner.nextLine();
            }
        }
    }

    public static double pedirDouble(String mensaje, Scanner scanner ) {
        while (true) {
            try {
                System.out.print(mensaje);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Formato de numero incorrecto, favor de introducir un numero");
                scanner.nextLine();
            }
        }
    }



    /* public static int ExtraerNumeroDeString(String texto){
        if(texto == null || texto.isEmpty()){
            return 0;
        }
        String soloNumeros = texto.replaceAll("[^0-9]", "");
        if(soloNumeros.isEmpty()){
            return 0;
        }

        return  Integer.parseInt(soloNumeros);
    }
*/

}
