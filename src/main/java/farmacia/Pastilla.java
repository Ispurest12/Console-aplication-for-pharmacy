package farmacia;

public class Pastilla extends Medicamento{
    private String numero_de_pastillas_en_caja;
    private String miligramos_por_pastilla;



    public Pastilla(String nombre, String lab, Boolean tipo_medicamento, int codigo_barras, double costoMedicamento, double costoPublico, String fecha_publicacion, String fecha_caducidad, String numero_de_pastillas_en_caja, String miligramos_por_pastilla) {
        super(nombre, lab, tipo_medicamento, codigo_barras, costoMedicamento, costoPublico, fecha_publicacion, fecha_caducidad);
        this.numero_de_pastillas_en_caja = numero_de_pastillas_en_caja;
        this.miligramos_por_pastilla = miligramos_por_pastilla;
    }

    public void setNumero_de_pastillas_en_caja(String numero_de_pastillas_en_caja) {
        this.numero_de_pastillas_en_caja = numero_de_pastillas_en_caja;
    }

    public String getMiligramos_por_pastilla() {
        return miligramos_por_pastilla;
    }

    public void setMiligramos_por_pastilla(String miligramos_por_pastilla) {
        this.miligramos_por_pastilla = miligramos_por_pastilla;
    }


    public String MostrarNombrePastillaPrecio(){

        return "Nombre del medicamento " + this.getNombre() + ", Pastillas del medicamento " + numero_de_pastillas_en_caja + ", Costo del medicamento " + this.getCostoMedicamento() + ", Precio al publico " + this.getCostoPublico() ;
    }

    public String FormatoAmplio(){
        return "Nombre del medicamento " + this.getNombre() + ", pastilla del medicamento " + numero_de_pastillas_en_caja + ", costo del medicamento " + this.getCostoMedicamento() + ", Precio al publico " + this.getCostoPublico() + " fecha de fabricacion " + this.getFecha_publicacion() + ", fecha de caducidad " + this.getFecha_caducidad();
    }

}
