package farmacia;

public class Pomada extends Medicamento {
    private String gramosPorUnidad;

    public String getGramosPorUnidad() {
        return gramosPorUnidad;
    }

    public void setGramosPorUnidad(String gramosPorUnidad) {
        this.gramosPorUnidad = gramosPorUnidad;
    }


    public Pomada(String nombre, String lab, Boolean tipo_medicamento, int codigo_barras, double costoMedicamento, double costoPublico, String fecha_publicacion, String fecha_caducidad, String gramosPorUnidad) {
        super(nombre, lab, tipo_medicamento, codigo_barras, costoMedicamento, costoPublico, fecha_publicacion, fecha_caducidad);
        this.gramosPorUnidad = gramosPorUnidad;
    }

    public String MostrarNombrePomadaPrecio(){

        return "Nombre del medicamento " + this.getNombre() +", Laboratorio " + this.getLab() + " Costo del medicamento " + this.getCostoMedicamento() + ", Precio al publico " + this.getCostoPublico() ;
    }
    public String formatoAmplioPomada(){
        return "Nombre del medicamento " + this.getNombre() + ", gramos por unidad " + gramosPorUnidad + ", costo del medicamento " + this.getCostoMedicamento() + ", Precio al publico " + this.getCostoPublico() + " fecha de fabricacion " + this.getFecha_publicacion() + ", fecha de caducidad " + this.getFecha_caducidad();
    }
}
