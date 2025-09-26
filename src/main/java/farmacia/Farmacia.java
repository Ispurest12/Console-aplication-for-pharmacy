package farmacia;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Farmacia {
    Scanner scanner = new Scanner(System.in);

    private int pastillasAgregadas;
    private final int maximaCapacidadPastillas = 100;
    private final Pastilla[] pastillas;


    private int jarabesAgregados;
    private final int maximaCapacidadJarabes = 50;
    private final Jarabe[] jarabes;


    private int pomadasAgregadas;
    private final int maximaCapacidadPomadas = 50;
    private final Pomada[] pomadas;


    public Farmacia() {
        this.pastillasAgregadas = 0;
        this.pastillas = new  Pastilla[maximaCapacidadPastillas];
        this.jarabesAgregados = 0;
        this.jarabes = new Jarabe[maximaCapacidadJarabes];
        this.pomadasAgregadas = 0;
        this.pomadas = new Pomada[maximaCapacidadPomadas];
    }

    public  void agregarMedicamentoPastilla() {
            if (pastillasAgregadas < maximaCapacidadPastillas) {
            String nombre = Herramienta.pedirString("Nombre de la pastilla: ", scanner);
            String laboratorio = Herramienta.pedirString("Nombre de laboratorio: ", scanner);
            Boolean generico = Herramienta.pedirBool("Generico: ", scanner);
            int codigo = Herramienta.pedirEntero("Codigo de barras: ", scanner);
            double costoMedicamento = Herramienta.pedirDouble("Costo medicamento: ", scanner);
            double costoPublico = Herramienta.pedirDouble("Costo publico: ", scanner);
            scanner.nextLine();
            LocalDate fechaFabricacion = Herramienta.pedirFecha("Fecha de fabricacion: ", scanner);
            LocalDate fechaCaducidad = Herramienta.pedirFecha("Fecha de caducidad: ", scanner);
            String pastillasTotales = Herramienta.pedirString("Pastillas totales: ", scanner);
            String miligramosPorPastilla = Herramienta.pedirString("Miligramos por pastilla: ", scanner);
            pastillas[pastillasAgregadas] = new Pastilla(nombre, laboratorio, generico, codigo, costoMedicamento, costoPublico, fechaFabricacion, fechaCaducidad, pastillasTotales, miligramosPorPastilla);
            pastillasAgregadas++;
            System.out.println("Pastillas Agregadas: " + pastillasAgregadas);
        }
    }

    public void agregarMedicamentoJarabe() {
        if (jarabesAgregados < maximaCapacidadJarabes) {
            String nombre = Herramienta.pedirString("Nombre del jarabe: ", scanner);
            String laboratorio = Herramienta.pedirString("Nombre de laboratorio: ", scanner);
            Boolean generico = Herramienta.pedirBool("Generico: ", scanner);
            int codigo = Herramienta.pedirEntero("Codigo de barras: ", scanner);
            double costoMedicamento = Herramienta.pedirDouble("Costo medicamento: ", scanner);
            double costoPublico = Herramienta.pedirDouble("Costo publico: ", scanner);
            scanner.nextLine();
            LocalDate fechaFabricacion = Herramienta.pedirFecha("Fecha de fabricacion: ", scanner);
            LocalDate fechaCaducidad = Herramienta.pedirFecha("Fecha caducidad: ", scanner);
            String militrosTotales = Herramienta.pedirString("Militres totales: ", scanner);
            boolean dosificador = Herramienta.pedirBool("Dosificador: ", scanner);
            scanner.nextLine();
            jarabes[jarabesAgregados] = new Jarabe(nombre, laboratorio, generico, codigo, costoMedicamento, costoPublico, fechaFabricacion, fechaCaducidad, militrosTotales, dosificador);
            jarabesAgregados++;
            System.out.println("Jarabes Agregadas: " + jarabesAgregados);
        }


    }

    public void agregarMedicamentoPomada() {
        if (pomadasAgregadas < maximaCapacidadPomadas) {
            String nombre = Herramienta.pedirString("Nombre del medicamento: ", scanner);
            String laboratorio = Herramienta.pedirString("Nombre de laboratorio: ", scanner);
            Boolean generico = Herramienta.pedirBool("Generico: ", scanner);
            int codigo = Herramienta.pedirEntero("Codigo de barras: ", scanner);
            double costoMedicamento = Herramienta.pedirDouble("Costo medicamento: ", scanner);
            double costoPublico = Herramienta.pedirDouble("Costo publico: ", scanner);
            scanner.nextLine();
            LocalDate fechaFabricacion = Herramienta.pedirFecha("Fecha de fabricacion: ", scanner);
            LocalDate fechaCaducidad = Herramienta.pedirFecha("Fecha caducidad: ", scanner);
            String gramosPorUnidad = Herramienta.pedirString("Gramos por unidad: ", scanner);
            scanner.nextLine();
            pomadas[pomadasAgregadas] = new Pomada(nombre, laboratorio, generico, codigo, costoMedicamento, costoPublico, fechaFabricacion, fechaCaducidad, gramosPorUnidad);
            pomadasAgregadas++;
            System.out.println("Pomadas Agregadas: " + pomadasAgregadas);
        }
    }

    public void eliminarMedicamentoPastilla() {
        if(pastillasAgregadas == 0){
            System.out.print("No hay pastillas a eliminar ");
            return;
        }
        System.out.println("Indice a eliminar: \n");
        int  indiceEliminar = scanner.nextInt();
        if(indiceEliminar >= 0 && indiceEliminar < pastillasAgregadas ) {
            System.out.println("Estas seguro de eliminar? (S/N): \n");
            char confirmacion =  scanner.next().toLowerCase().charAt(0);
            if(confirmacion == 's') {
                for(int i = indiceEliminar; i < pastillasAgregadas - 1 ; i++) {
                    pastillas[i] = pastillas[i + 1];
                }
                pastillas[pastillasAgregadas - 1] = null;
                pastillasAgregadas--;
                System.out.println("Eliminada correctamente");
            }else{
                System.out.println("Eliminacion cancelada");
            }
        }else{
            System.out.println("Indice invalido");

        }

    }

    public void eliminarMedicamentoJarabe() {
        if(jarabesAgregados == 0) {
            System.out.print("No hay jarabes a eliminar ");
            return;
        }
        System.out.println("Indice a eliminar: \n");
        int  indiceEliminar = scanner.nextInt();
        if(indiceEliminar >= 0 && indiceEliminar < jarabesAgregados ) {
            System.out.println("Estas seguro de eliminar? (S/N): \n");
            char confirmacion =  scanner.next().toLowerCase().charAt(0);
            if(confirmacion == 's') {
                for(int i  = indiceEliminar; i < jarabesAgregados - 1 ; i++) {
                    jarabes[i] = jarabes[i+1];
                }
                jarabes[jarabesAgregados - 1]  = null;
                jarabesAgregados--;
                System.out.println("Eliminada correctamente");
            }else{
                System.out.println("Eliminacion cancelada");
            }
        }else{
            System.out.println("Indice invalido");
        }

    }
    public void eliminarMedicamentoPomada() {
        if(pomadasAgregadas == 0) {
            System.out.print("No hay pomadas a eliminar ");
            return;
        }
        System.out.println("Indice a eliminar: \n");
        int  indiceEliminar = scanner.nextInt();
        if(indiceEliminar >= 0 && indiceEliminar < pomadasAgregadas ) {
            System.out.println("Estas seguro de eliminar? (S/N): \n");
            char confirmacion =  scanner.next().toLowerCase().charAt(0);
            if(confirmacion == 's') {
                for(int i = indiceEliminar; i < pomadasAgregadas - 1 ; i++) {
                    pomadas[i] = pomadas[i+1];
                }
                pomadas[pomadasAgregadas - 1] = null;
                pomadasAgregadas--;
                System.out.println("Eliminada correctamente");
            }else{
                System.out.println("Eliminacion cancelada");
            }
        }else{
            System.out.println("Indice invalido");
        }
    }


    public void modificarPrecioUnaPastilla() {
        int indice = Herramienta.pedirEntero("Indice de la pastilla a modificar su precio: ", scanner);
        if(pastillasAgregadas == 0){
            System.out.println("No hay pastillas a modificar");
            return;
        }
        if(indice >= 0 && indice < pastillasAgregadas){
            System.out.println("Introduce el precio nuevo: \n");
            pastillas[indice].setCostoPublico(scanner.nextDouble());
            System.out.println("Precio actualizado \n");
        }

    }

    public void modificarPrecioPorcentajePastillas() {
        if(pastillasAgregadas == 0) {
            System.out.println("No hay pastillas a modificar");
            return;
        }
        double porcentajeDescuento = Herramienta.pedirDouble("Porcentaje de reduccion de precio:", scanner);
        double factor = 1 - (porcentajeDescuento/100);
        for(int i = 0; i < pastillasAgregadas; i++) {
            Pastilla pastillActual =  pastillas[i];
            double precioActual = pastillActual.getCostoPublico();
            double nuevoPrecio = precioActual*factor;
            pastillActual.setCostoPublico(nuevoPrecio);
        }
    }

    public void modificarPrecioJarabe() {
        if(jarabesAgregados == 0) {
            System.out.println("No hay jarabes a modificar");
            return;
        }
        int indice = Herramienta.pedirEntero("Indice del jarabe a modificar su precio: ", scanner);

        if(indice >= 0 && indice < jarabesAgregados ){
            System.out.println("Introduce el precio nuevo: \n");
            jarabes[indice].setCostoPublico(scanner.nextDouble());
            System.out.println("Precio actualizado \n");

        }

    }

    public void modificarPrecioJarabesPorcentaje(){
        if(jarabesAgregados == 0) {
            System.out.println("No hay jarabes a modificar");
            return;
        }
        double porcentajeDescuento = Herramienta.pedirDouble("Porcentaje de reduccion de precio: ", scanner);
        double factor = 1 - (porcentajeDescuento/100);

        for(int i = 0; i < jarabesAgregados; i++){
            Jarabe jarabeActual =  jarabes[i];
            double precioActual = jarabeActual.getCostoPublico();
            double nuevoPrecio = precioActual*factor;
            jarabeActual.setCostoPublico(nuevoPrecio);
            System.out.println("Precio actualizado \n");

        }
    }
    public void modificarPrecioPomada(){
        if(pomadasAgregadas == 0) {
            System.out.println("No hay pomadas a modificar");
            return;
        }
        int indice = Herramienta.pedirEntero("Indice del pomadas a modificar su precio", scanner);
        if(indice >= 0 && indice < pomadasAgregadas){
            System.out.println("Introduce el precio nuevo: \n");
            pomadas[indice].setCostoPublico(scanner.nextDouble());
            System.out.println("Precio actualizado \n");
        }
    }

    public void modificarPrecioPomadaPorcentaje(){
        if(pomadasAgregadas == 0) {
            System.out.println("No hay pomadas a modificar");
            return;
        }
        double porcentajeDescuento = Herramienta.pedirDouble("Porcentaje de reduccion de precio: ", scanner);
        double factor = 1 - (porcentajeDescuento/100);
        for(int i = 0; i < pomadasAgregadas; i++) {
            Pomada pomadaActual =  pomadas[i];
            double precioActual = pomadaActual.getCostoPublico();
            double nuevoPrecio = precioActual*factor;
            pomadaActual.setCostoPublico(nuevoPrecio);
            System.out.println("Precio actualizado \n");
        }
    }


    public void mostrarPrecioTodasLasPastillas(){
        boolean encontrado = false;
        for(int i  = 0; i < pastillasAgregadas; i++){
            Pastilla pastillaActual =  pastillas[i];
            if(pastillaActual.getTipo_medicamento() == false){
                System.out.println(pastillaActual);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No hay pastillas con patente \n");

        }

    }
    public void mostrarPrecioTodosLosJarabes(){
        boolean encontrado = false;
        for(int i  = 0; i < jarabesAgregados; i++){
            Jarabe jarabeActual = jarabes[i];
            if(jarabeActual.getTipo_medicamento() == false){
                System.out.println(jarabeActual);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No hay jarabes con patente \n");

        }
    }
    public void mostrarPrecioTodasLasPomadas(){
        boolean encontrado = false;
        for(int i  = 0; i < pomadasAgregadas; i++){
            Pomada pomadaActual =  pomadas[i];
            if(pomadaActual.getTipo_medicamento() == false){
                System.out.println(pomadaActual);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No hay pomadas con patente \n");

    }
   }
     public void mostrarPrecioTodasLasPastillasG(){
         boolean encontrado = false;
         for(int i  = 0; i < pastillasAgregadas; i++){
             Pastilla pastillaActual =  pastillas[i];
             if(pastillaActual.getTipo_medicamento() == true){
                 System.out.println(pastillaActual);
                 encontrado = true;
             }
         }
         if(!encontrado){
             System.out.println("No hay pastillas genericas \n");

         }
     }

     public void mostrarPrecioTodosLosJarabesG(){
         boolean encontrado = false;
         for(int i  = 0; i < jarabesAgregados; i++){
             Jarabe jarabeActual = jarabes[i];
             if(jarabeActual.getTipo_medicamento() == true){
                 System.out.println(jarabeActual);
                 encontrado = true;
             }
         }
         if(!encontrado){
             System.out.println("No hay jarabes genericas \n");

         }
     }
     public void mostrarPrecioTodosLasPomadasG(){
         boolean encontrado = false;
         for(int i  = 0; i < pomadasAgregadas; i++){
             Pomada pomadaActual =  pomadas[i];
             if(pomadaActual.getTipo_medicamento() == true){
                 System.out.println(pomadaActual);
                 encontrado = true;
             }
         }
         if(!encontrado){
             System.out.println("No hay pomadas genericos \n");

         }
     }

     public void imprimirResumenPatente(){
         double precioTotalPastillas = 0.0;
         double precioTotalJarabes = 0.0;
         double precioTotalPomadas = 0.0;
         if (pastillasAgregadas > 0 || pomadasAgregadas > 0 || jarabesAgregados > 0) {
             for (int i = 0; i < pastillasAgregadas; i++) {
                 Pastilla pastillaActual = pastillas[i];
                 if (pastillaActual.getTipo_medicamento() == false) {
                     System.out.println(i + " " + pastillaActual.MostrarNombrePastillaPrecio());
                     precioTotalPastillas += pastillaActual.getCostoPublico();
                 }
             }
             for (int i = 0; i < jarabesAgregados; i++) {
                 Jarabe jarabeActual = jarabes[i];
                 if (jarabeActual.getTipo_medicamento() == false) {
                     System.out.println(i + " " + jarabeActual.MostrarNombreJarabePrecio());
                     precioTotalJarabes += jarabeActual.getCostoPublico();
                 }
             }
             for (int i = 0; i < pomadasAgregadas; i++) {
                 Pomada pomadaActual = pomadas[i];
                 if (pomadaActual.getTipo_medicamento() == false) {
                     System.out.println(i + " " + pomadaActual.MostrarNombrePomadaPrecio());
                     precioTotalPomadas += pomadaActual.getCostoPublico();
                 }
             }
             System.out.println("Pastillas agregadas: " + pastillasAgregadas + ", Suma de precios: " + precioTotalPastillas);
             System.out.println("Jarabes agredos: " + jarabesAgregados + ", Suma de precios: " + precioTotalJarabes);
             System.out.println("Pomadas agregadas: " + pomadasAgregadas + ", Suma de precios: " + precioTotalPomadas);
             System.out.println("Objetos totales en inventario " + (pastillasAgregadas + jarabesAgregados + pomadasAgregadas) + "Precio total: " + (precioTotalJarabes + precioTotalPomadas + precioTotalPastillas));


         }
         if(pastillasAgregadas == 0 && pomadasAgregadas == 0 && jarabesAgregados == 0 ) {
             System.out.println("No hay medicamentos \n");

         }
     }

     public void imprimirResumenGenerico(){
         double precioTotalPastillasGenericas = 0.0;
         double precioTotalJarabesGenericos = 0.0;
         double precioTotalPomadasGenericas = 0.0;
         if(pastillasAgregadas > 0 || pomadasAgregadas > 0 || jarabesAgregados > 0) {
             if(pastillasAgregadas > 0) {
                 for (int i = 0; i < pastillasAgregadas; i++) {
                     Pastilla pastillaActual = pastillas[i];
                     if (pastillaActual.getTipo_medicamento() == true) {
                         System.out.println(i + " " + pastillaActual.MostrarNombrePastillaPrecio());
                         precioTotalPastillasGenericas += pastillaActual.getCostoPublico();
                     }
                 }
             }else{System.out.println("No hay pastillas \n");}
             if(jarabesAgregados > 0) {
                 for (int i = 0; i < jarabesAgregados; i++) {
                     Jarabe jarabeActual = jarabes[i];
                     if (jarabeActual.getTipo_medicamento() == true) {
                         System.out.println(i + " " + jarabeActual.MostrarNombreJarabePrecio());
                         precioTotalPastillasGenericas += jarabeActual.getCostoPublico();
                     }
                 }
             }else{System.out.println("No hay jarabas \n");}
             if(pomadasAgregadas > 0) {
                 for (int i = 0; i < pomadasAgregadas; i++) {
                     Pomada pomadaActual = pomadas[i];
                     if (pomadaActual.getTipo_medicamento() == true) {
                         System.out.println(i + " " + pomadaActual.MostrarNombrePomadaPrecio());
                         precioTotalPomadasGenericas += pomadaActual.getCostoPublico();
                     }
                 }
             }else{System.out.println("No hay pomadas \n");}
             System.out.println("Pastillas agregadas: " + pastillasAgregadas + ", Suma de precios: " + precioTotalPastillasGenericas);
             System.out.println("Jarabes agredos: " + jarabesAgregados + ", Suma de precios: " + precioTotalJarabesGenericos);
             System.out.println("Pomadas agregadas: " + pomadasAgregadas + ", Suma de precios: " + precioTotalPomadasGenericas);
             System.out.println("Objetos totales en inventario " + (pastillasAgregadas + jarabesAgregados + pomadasAgregadas) + " Precio total: " + (precioTotalJarabesGenericos + precioTotalPomadasGenericas + precioTotalPastillasGenericas));

         }
         if(pastillasAgregadas == 0 && pomadasAgregadas == 0 && jarabesAgregados == 0 ) {
             System.out.println("No hay medicamentos \n");
         }
     }


    public void buscarPorNombre() {
        String nombreBuscado = Herramienta.pedirString("Nombre del medicamento a buscar: ", scanner);
        if (pastillasAgregadas == 0 && jarabesAgregados == 0 && pomadasAgregadas == 0) {
            System.out.println("No hay medicamentos \n");
            return;
        }
        if (pastillasAgregadas > 0) {
            for (int i = 0; i < pastillasAgregadas; i++) {
                Pastilla pastillaActual = pastillas[i];
                if (pastillaActual.getNombre().equalsIgnoreCase(nombreBuscado)) {
                    System.out.println(pastillaActual.FormatoAmplio());
                }
            }
        } else {
            System.out.println("No hay pastillas \n");
        }
        if (jarabesAgregados > 0) {
            for (int i = 0; i < jarabesAgregados; i++) {
                Jarabe jarabeActual = jarabes[i];
                if (jarabeActual.getNombre().equalsIgnoreCase(nombreBuscado)) {
                    System.out.println(jarabeActual.FormatoAmplioJarabe());
                }
            }
        } else {
            System.out.println("No hay jarabas \n");
        }
        if (pomadasAgregadas > 0) {
            for (int i = 0; i < pomadasAgregadas; i++) {
                Pomada pomadaActual = pomadas[i];
                if (pomadaActual.getNombre().equalsIgnoreCase(nombreBuscado)) {
                    System.out.println(pomadaActual.formatoAmplioPomada());
                }
            }
        }else{System.out.println("No hay pomadas \n");}
    }

  public void buscarPorCodigoDeBarras() {
      int numeroDeBarras = Herramienta.pedirEntero("Numero de barras a buscar: ", scanner);
      if (pastillasAgregadas == 0 && jarabesAgregados == 0 && pomadasAgregadas == 0) {
          System.out.println("No hay medicamentos \n");
          return;
      }
      if (pastillasAgregadas > 0) {
          for (int i = 0; i < pastillasAgregadas; i++) {
              Pastilla pastillaActual = pastillas[i];
              if (pastillaActual.getCodigo_barras() == numeroDeBarras) {
                  System.out.println(pastillaActual.FormatoAmplio());
              }
          }
      } else {
          System.out.println("No hay pastillas \n");
      }
      if (jarabesAgregados > 0) {
          for (int i = 0; i < jarabesAgregados; i++) {
              Jarabe jarabeActual = jarabes[i];
              if (jarabeActual.getCodigo_barras() == numeroDeBarras) {
                  System.out.println(jarabeActual.FormatoAmplioJarabe());
              }
          }
      } else {
          System.out.println("No hay jarabes \n");
      }
      if (pomadasAgregadas > 0) {
          for (int i = 0; i < pomadasAgregadas; i++) {
              Pomada pomadaActual = pomadas[i];
              if (pomadaActual.getCodigo_barras() == numeroDeBarras) {
                  System.out.println(pomadaActual.formatoAmplioPomada());
              }
          }
      }else{System.out.println("No hay pomadas \n");}
  }

   public void buscarPorAnioEspecifico(){
       if(pastillasAgregadas == 0 && jarabesAgregados == 0 && pomadasAgregadas == 0){
           System.out.println("No hay medicamentos \n");
           return;
       }
       int anioBuscado = Herramienta.pedirEntero("Año del medicamento que buscas: ", scanner);
       boolean encontrado = false;
       if(pastillasAgregadas > 0) {
           for (int i = 0; i < pastillasAgregadas; i++) {
               Pastilla pastillaActual = pastillas[i];
               LocalDate fechaPublicacicon = pastillaActual.getFecha_publicacion();
               if (fechaPublicacicon.getYear() == anioBuscado) {
                   System.out.println(pastillaActual.MostrarNombrePastillaPrecio());
                   encontrado = true;
               }
           }
       }else{
           System.out.println("No hay Pastillas  \n");
       }
       if(jarabesAgregados > 0) {
           for (int i = 0; i < jarabesAgregados; i++) {
               Jarabe jarabeActual = jarabes[i];
               LocalDate fechaPublicacicon = jarabeActual.getFecha_publicacion();
               if (fechaPublicacicon.getYear() == anioBuscado) {
                   System.out.println(jarabeActual.MostrarNombreJarabePrecio());
                   encontrado = true;
               }
           }
           } else
           {
           System.out.println("No hay Jarabes  \n");
       }
       if(pomadasAgregadas > 0) {
           for (int i = 0; i < jarabesAgregados; i++) {
               Pomada pomadaActual = pomadas[i];
               LocalDate fechaPublicacicon = pomadaActual.getFecha_publicacion();
               if (fechaPublicacicon.getYear() == anioBuscado) {
                   System.out.println(pomadaActual.MostrarNombrePomadaPrecio());
                   encontrado = true;
               }
           }
       }else{System.out.println("No hay Pomadas  \n");}
       if(!encontrado){
           System.out.println("No hay elementos de ese año \n");
       }
   }

   public void buscarCaducado(){
       LocalDate hoy = LocalDate.now();
       boolean encontrado = false;
       if(pastillasAgregadas > 0) {
           for (int i = 0; i < pastillasAgregadas; i++) {
               Pastilla pastillaActual = pastillas[i];
               LocalDate pastillaVencida = pastillaActual.getFecha_caducidad();
               if (pastillaVencida.isBefore(hoy)) {
                   System.out.println("Pastilla vencida: " + pastillaActual.MostrarNombrePastillaPrecio());
                   encontrado = true;
               }
           }
       }else{System.out.println("No hay Pastillas  \n");}
       if(jarabesAgregados > 0) {
           for (int i = 0; i < jarabesAgregados; i++) {
               Jarabe jarabeActual = jarabes[i];
               LocalDate jarabeVencido = jarabeActual.getFecha_caducidad();
               if (jarabeVencido.isBefore(hoy)) {
                   System.out.println("Jarabe vencido:" + jarabeActual.MostrarNombreJarabePrecio());
               }
           }
       }else{System.out.println("No hay Jarabes  \n");}
       if(pomadasAgregadas > 0) {
           for (int i = 0; i < pomadasAgregadas; i++) {
               Pomada pomadaActual = pomadas[i];
               LocalDate pomadaVencido = pomadaActual.getFecha_caducidad();
               if (pomadaVencido.isBefore(hoy)) {
                   System.out.println("Pomada vencida: " + pomadaActual.MostrarNombrePomadaPrecio());
                   encontrado = true;
               }
           }
       }else{System.out.println("No hay Pomadas  \n");}
       if(!encontrado){
           System.out.println("No hay medicamentos caducados");
       }
   }

   public void ordenarPorNombrePastilla(){
       if(pastillasAgregadas == 0){
           System.out.println("No hay pastillas para ordenar");
           return;
       }
       Arrays.sort(pastillas, 0, pastillasAgregadas, Comparator.comparing(Pastilla::getNombre,  String.CASE_INSENSITIVE_ORDER));
       for(int i = 0; i < pastillasAgregadas; i++){
           System.out.println(pastillas[i]);
       }
   }
   public void ordenarPorPrecioPastilla(){
       if(pastillasAgregadas == 0){
           System.out.println("No hay pastillas para ordenar");
           return;
       }
       Arrays.sort(pastillas, 0, pastillasAgregadas, Comparator.comparingDouble(Pastilla::getCostoPublico));
       for(int i = 0; i < pastillasAgregadas; i++){
           System.out.println(pastillas[i]);
       }
   }
   public void ordenarPorNombreJarabe(){
       if(jarabesAgregados == 0){
           System.out.println("No hay jarabes para ordenar");
           return;
       }
       Arrays.sort(jarabes, 0, jarabesAgregados, Comparator.comparing(Jarabe::getNombre,  String.CASE_INSENSITIVE_ORDER));
       for(int i = 0; i < jarabesAgregados; i++){
           System.out.println(jarabes[i]);
       }
   }
   public void ordenarPorPrecioJarabe(){
       if(jarabesAgregados == 0){
           System.out.println("No hay jarabes para ordenar");
           return;
       }
       Arrays.sort(jarabes, 0, jarabesAgregados, Comparator.comparingDouble(Jarabe::getCostoPublico));
       for(int i = 0; i < jarabesAgregados; i++){
           System.out.println(jarabes[i]);
       }
   }

   public void ordenarPorNombrePomada(){
       if(pomadasAgregadas == 0){
           System.out.println("No hay pomadas para ordenar");
           return;
       }
       Arrays.sort(pomadas, 0, pomadasAgregadas, Comparator.comparing(Pomada::getNombre, String.CASE_INSENSITIVE_ORDER));
       for (int i = 0; i < pomadasAgregadas; i++) {
           System.out.println(pomadas[i]);
       }
   }

   public void ordenarPorPrecioPomada(){
       if(pomadasAgregadas == 0){
           System.out.println("No hay pomadas para ordenar");
           return;
       }
       Arrays.sort(pomadas, 0, pomadasAgregadas, Comparator.comparingDouble(Pomada::getCostoPublico));
       for(int i = 0; i < pomadasAgregadas; i++){
           System.out.println(pomadas[i]);
       }
   }




}

