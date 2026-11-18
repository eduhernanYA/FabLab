/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

/**
 *
 * @author Asus
 */
public class RecursoTecnologico {
    private String identificacion;
    private String descripcion;
    private String tipoRecurso;
    private double valorUnitario;
    private int cantidad;
  

    public RecursoTecnologico(String identificacion, String descripcion, String tipoRecurso, double valorUnitario, int cantidad) {
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.tipoRecurso = tipoRecurso;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
    }

    
    
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "RecursoTecnologico{" + "identificacion=" + identificacion + ", descripcion=" + descripcion + ", tipoRecurso=" + tipoRecurso + ", valorUnitario=" + valorUnitario + ", cantidad=" + cantidad + '}';
    }

    




    
    
    
    
    
    
    
    
}
