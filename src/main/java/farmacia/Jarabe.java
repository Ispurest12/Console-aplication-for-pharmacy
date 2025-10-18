package farmacia;
import java.time.LocalDate;


public class Jarabe extends Medicamento {
    private final String mililitros_por_jarabe;
    private final boolean dosificador;


    public Jarabe(String nombre, String lab, Boolean tipo_medicamento, int codigo_barras, double costoMedicamento, double costoPublico, LocalDate fecha_publicacion, LocalDate fecha_caducidad, String mililitros_por_jarabe, boolean dosificador) {
        super(nombre, lab, tipo_medicamento, codigo_barras, costoMedicamento, costoPublico, fecha_publicacion, fecha_caducidad);
        this.mililitros_por_jarabe = mililitros_por_jarabe;
        this.dosificador = dosificador;
    }



    public String MostrarNombreJarabePrecio(){

        return "Nombre del medicamento " + this.getNombre() +", Laboratorio " + this.getLab() + " Costo del medicamento " + this.getCostoMedicamento() + ", Precio al publico " + this.getCostoPublico() ;
    }
    public String FormatoAmplioJarabe(){
        return "Nombre del medicamento " + " militros por jarabe " + mililitros_por_jarabe + this.getNombre() + ", Dosificador " + dosificador + ", costo del medicamento " + this.getCostoMedicamento() + ", Precio al publico " + this.getCostoPublico() + " fecha de fabricacion " + this.getFecha_publicacion() + ", fecha de caducidad " + this.getFecha_caducidad();
    }

}
