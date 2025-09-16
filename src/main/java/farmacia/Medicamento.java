package farmacia;
public class Medicamento {

    private String nombre;
    private String lab;
    private Boolean tipo_medicamento;
    private int codigo_barras;
    private double costoMedicamento;
    double costoPublico;
    private String fecha_publicacion;
    private String fecha_caducidad;

    public Medicamento(String nombre, String lab, Boolean tipo_medicamento, int codigo_barras, double costoMedicamento, double costoPublico, String fecha_publicacion, String fecha_caducidad) {
        this.nombre = nombre;
        this.lab = lab;
        this.tipo_medicamento = tipo_medicamento;
        this.codigo_barras = codigo_barras;
        this.costoMedicamento = costoMedicamento;
        this.costoPublico = costoPublico;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_caducidad = fecha_caducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public Boolean getTipo_medicamento() {
        return tipo_medicamento;
    }

    public void setTipo_medicamento(Boolean tipo_medicamento) {
        this.tipo_medicamento = tipo_medicamento;
    }

    public int getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(int codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public double getCostoMedicamento() {
        return costoMedicamento;
    }

    public void setCostoMedicamento(double costoMedicamento) {
        this.costoMedicamento = costoMedicamento;
    }

    public double getCostoPublico() {
        return costoPublico;
    }

    public void setCostoPublico(double costoPublico) {
        this.costoPublico = costoPublico;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' + ", Laboratorio='" + lab + '\'' + ", Tipo_medicamento=" + tipo_medicamento + ", Codigo_barras=" + codigo_barras + ", CostoMedicamento=" + costoMedicamento + ", CostoPublico=" + costoPublico;
    }





}



