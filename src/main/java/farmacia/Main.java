package farmacia;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Farmacia mifarmacia = new Farmacia();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("El Ahorro \n");
            System.out.print("1. Agregar un medicamento \n");
            System.out.print("2. Borrar un medicamento \n");
            System.out.print("3. Modificar un medicamento \n");
            System.out.print("4. Imprimir medicamento de patente \n");
            System.out.print("5. Imprimir medicamento generico \n");
            System.out.print("6. Imprimir resumen \n");
            System.out.print("7. Buscar \n");
            System.out.print("8. Ordenar e imprimir \n");
            System.out.print("9. salir \n");
            int opcion = Herramienta.pedirEntero("Opcion: ", scanner);
            switch (opcion) {
                case 1: {
                    System.out.println("a. pastillas ");
                    System.out.println("b. jarabes ");
                    System.out.println("c. pomadas ");
                    char respuesta = Herramienta.pedirChar("Opcion: ", scanner);
                    switch (respuesta) {
                        case 'a': {
                        mifarmacia.agregarMedicamentoPastilla();
                        }break;
                    case 'b': {
                        mifarmacia.agregarMedicamentoJarabe();
                        }break;
                        case 'c': {
                        mifarmacia.agregarMedicamentoPomada();
                        }break;
                    }break;
                }
                case 2: {
                    System.out.println("a. pastillas ");
                    System.out.println("b. jarabes ");
                    System.out.println("c. pomadas ");
                    char respuesta = Herramienta.pedirChar("Opcion: ", scanner);
                    switch (respuesta) {
                        case 'a': {
                            mifarmacia.eliminarMedicamentoPastilla();
                        }break;
                        case 'b':{
                            mifarmacia.eliminarMedicamentoJarabe();
                        }break;
                        case 'c':{
                           mifarmacia.eliminarMedicamentoPomada();
                        }break;
                    }
                    }break;
                case 3:{
                    System.out.println("a. Modificar precio de una pastilla ");
                    System.out.println("b. Modificar el precio de todas las pastillas(porcentaje de costo)");
                    System.out.println("c. Modificar el precio de un jarabe ");
                    System.out.println("d. Modificar el precio de todos los jarabes(Porcentaje de costo) ");
                    System.out.println("e. Modificar el precio de una pomada ");
                    System.out.println("f. Modificar el precio de todas las pomadas(Porcentaje de costo) ");
                    System.out.println("g. Regresar ");
                    char respuesta = Herramienta.pedirChar("Opcion: ", scanner);
                    switch (respuesta) {
                        case 'a':{
                            mifarmacia.modificarPrecioUnaPastilla();
                        }break;
                        case 'b':{
                            mifarmacia.modificarPrecioPorcentajePastillas();
                        }break;
                        case 'c': {
                            mifarmacia.modificarPrecioJarabe();
                        }break;
                        case 'd': {
                            mifarmacia.modificarPrecioJarabesPorcentaje();
                        }break;
                        case 'e':{
                            mifarmacia.modificarPrecioPomada();
                        }break;
                        case 'f':{
                            mifarmacia.modificarPrecioPomadaPorcentaje();
                        }

                    }
                }break;
                case 4:{
                    System.out.println("a. Imprimir la lista de todas las pastillas con precio ");
                    System.out.println("b. Imprimir la lista de todos los jarabes con precio ");
                    System.out.println("c. Imprimir la lista de todas las pomadas con precio  ");
                    char resultado = Herramienta.pedirChar("Opcion: ", scanner);
                    switch (resultado) {
                        case 'a':{
                            mifarmacia.mostrarPrecioTodasLasPastillas();
                        }break;
                        case 'b':{
                            mifarmacia.mostrarPrecioTodosLosJarabes();
                        }break;
                        case 'c':{
                            mifarmacia.mostrarPrecioTodasLasPomadas();
                        }break;
                    }
                } break;
                case 5:{
                    System.out.println("a. Imprimir la lista de todas las pastillas genericas con precio ");
                    System.out.println("b. Imprimir la lista de todos los jarabes genericos con precio ");
                    System.out.println("c. Imprimir la lista de todas las pomadas genericas con precio  ");
                    char resultado = Herramienta.pedirChar("Opcion: ", scanner);
                    switch (resultado) {
                        case 'a':{
                            mifarmacia.mostrarPrecioTodasLasPastillasG();
                        }break;
                        case 'b':{
                            mifarmacia.mostrarPrecioTodosLosJarabesG();
                        } break;
                        case 'c':{
                            mifarmacia.mostrarPrecioTodosLasPomadasG();
                        }
                    }break;
                }
                case 6: {
                    System.out.println("a. Imprimir resumen de medicamentos con patente");
                    System.out.println("b. Imprimir resumen de medicamentos genericos");
                    char resultado = Herramienta.pedirChar("Opcion: ", scanner);
                    if (resultado == 'a') {
                        mifarmacia.imprimirResumenPatente();
                    }
                    if (resultado == 'b') {
                        mifarmacia.imprimirResumenGenerico();
                    }
                }break;
                case 7:{
                    System.out.println("a. Buscar un producto por nombre e imprimir toda su informacion ");
                    System.out.println("b. Buscar un producto por codigo de barras e imprimir toda su informacion ");
                    System.out.println("c. Buscar medicamento por año especifico e imprimir informacion");
                    System.out.println("d. Buscar medicamento caducado e imprimirlos ");
                    char resultado = Herramienta.pedirChar("Opcion: ", scanner);
                    switch (resultado) {
                        case 'a':{
                            mifarmacia.buscarPorNombre();
                        }break;
                        case 'b':{
                            mifarmacia.buscarPorCodigoDeBarras();
                        }break;
                        case 'c':{
                            mifarmacia.buscarPorAnioEspecifico();
                        }break;
                        case 'd':{
                            mifarmacia.buscarCaducado();
                        }break;
                    }
                }break;
                case 8:{
                    System.out.println("a. Pastillas");
                    System.out.println("b. Jarabes");
                    System.out.println("c. Pomadas");
                    char resultado = Herramienta.pedirChar("Opcion: ", scanner);
                    switch (resultado) {
                        case 'a':{
                            System.out.println("1. Ordenar por nombre e imprimir datos");
                            System.out.println("2. Ordenar por precio e imprimir datos");

                            int resultado1 = Herramienta.pedirEntero("Opcion: ",scanner);
                            if(resultado1 == 1){
                                mifarmacia.ordenarPorNombrePastilla();
                            }
                            if(resultado1 == 2){
                                mifarmacia.ordenarPorPrecioPastilla();
                            }
                        }break;
                        case 'b':{
                            System.out.println("1. Ordenar por nombre e imprimir datos");
                            System.out.println("2. Ordenar por precio e imprimir datos");

                            int resultado1 = Herramienta.pedirEntero("Opcion: ",scanner);
                            if(resultado1 == 1){
                               mifarmacia.ordenarPorNombreJarabe();
                            }
                            if(resultado1 == 2){
                                mifarmacia.ordenarPorPrecioJarabe();
                            }

                        } break;
                        case 'c':{
                            System.out.println("1. Ordenar por nombre e imprimir datos");
                            System.out.println("2. Ordenar por precio e imprimir datos");

                            int resultado1 = Herramienta.pedirEntero("Opcion: ",scanner);
                            if(resultado1 == 1) {
                                mifarmacia.ordenarPorNombrePomada();
                            }
                            if(resultado1 == 2){
                                mifarmacia.ordenarPorPrecioPomada();
                            }
                        }break;
                    }

                }continue;
                case 9:{
                    salir = true;
                    scanner.close();
                }
            }
        }
    }
}