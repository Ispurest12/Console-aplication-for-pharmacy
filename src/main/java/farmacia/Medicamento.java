package farmacia;

import java.time.LocalDate;

public class Medicamento {

    private final String nombre;
    private final String lab;
    private final Boolean tipo_medicamento;
    private final int codigo_barras;
    private final double costoMedicamento;
    private double costoPublico;
    private final LocalDate fecha_publicacion;
    private final LocalDate fecha_caducidad;

    public Medicamento(String nombre, String lab, Boolean tipo_medicamento, int codigo_barras, double costoMedicamento, double costoPublico, LocalDate fecha_publicacion, LocalDate fecha_caducidad) {
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

   /* public void setNombre(String nombre) {
        this.nombre = nombre;
    } */

    public String getLab() {
        return lab;
    }

    /*public void setLab(String lab) {
        this.lab = lab;
    }
*/

    public Boolean getTipo_medicamento() {
        return tipo_medicamento;
    }
/*
    public void setTipo_medicamento(Boolean tipo_medicamento) {
        this.tipo_medicamento = tipo_medicamento;
    }
*/
    public int getCodigo_barras() {
        return codigo_barras;
    }

  /*  public void setCodigo_barras(int codigo_barras) {
        this.codigo_barras = codigo_barras;
    }
*/
    public double getCostoMedicamento() {
        return costoMedicamento;
    }

  /*  public void setCostoMedicamento(double costoMedicamento) {
        this.costoMedicamento = costoMedicamento;
    }
*/
    public double getCostoPublico() {
        return costoPublico;
    }

    public void setCostoPublico(double costoPublico) {
        this.costoPublico = costoPublico;
    }

    public LocalDate getFecha_publicacion() {
        return fecha_publicacion;
    }


    /*public void setFecha_publicacion(LocalDate fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }*/

    public LocalDate getFecha_caducidad() {
        return fecha_caducidad;
    }

    /*public void setFecha_caducidad(LocalDate fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }*/

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' + ", Laboratorio='" + lab + '\'' + ", Tipo_medicamento=" + tipo_medicamento + ", Codigo_barras=" + codigo_barras + ", CostoMedicamento=" + costoMedicamento + ", CostoPublico=" + costoPublico;
    }





}



