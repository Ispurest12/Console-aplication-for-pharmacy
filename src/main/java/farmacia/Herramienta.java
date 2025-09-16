package farmacia;
import java.util.Scanner;
public class Herramienta {
    // Esta clase es publica por que son las herramientas para pedir los datos y sea mas facil la lectura de codigo
    public static int pedirEntero(String mensaje, Scanner scanner ){
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static String pedirString(String mensaje, Scanner scanner ){
        System.out.print(mensaje);
        return scanner.next();
    }

    public static Boolean pedirBool(String mensaje, Scanner scanner ){
        System.out.print(mensaje);
        return  scanner.nextBoolean();
    }

    public static double pedirDouble(String mensaje, Scanner scanner ){
        System.out.print(mensaje);
        return  scanner.nextDouble();
    }

    public static int ExtraerNumeroDeString(String texto){
        if(texto == null || texto.isEmpty()){
            return 0;
        }
        String soloNumeros = texto.replaceAll("[^0-9]", "");
        if(soloNumeros.isEmpty()){
            return 0;
        }

        return  Integer.parseInt(soloNumeros);
    }


}
