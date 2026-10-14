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
    private int cantTotal;
    private int cantDanada;
    private int cantDisponible;
    private int cantPerdida;
    private String estado;

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

    public int getCantTotal() {
        return cantTotal;
    }

    public void setCantTotal(int cantTotal) {
        this.cantTotal = cantTotal;
    }

    public int getCantDanada() {
        return cantDanada;
    }

    public void setCantDanada(int cantDanada) {
        this.cantDanada = cantDanada;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    public int getCantPerdida() {
        return cantPerdida;
    }

    public void setCantPerdida(int cantPerdida) {
        this.cantPerdida = cantPerdida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    public int getCantEnUso(){
        return cantTotal - cantDanada - cantDisponible - cantPerdida;
    }
    
    public RecursoTecnologico(String identificacion, String descripcion, String tipoRecurso, int cantTotal, double valorUnitario){
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.tipoRecurso = tipoRecurso;
        this.cantTotal = cantTotal;
        this.valorUnitario = valorUnitario;
        
        this.cantDisponible = cantTotal;
        this.cantDanada = 0;
        this.cantPerdida = 0;
        this.estado = "Disponible";
    }
    
    @Override
    public String toString(){
        return this.identificacion + " | " + this.descripcion + " | Total: " + this.cantTotal + " | Disponibles: " + this.cantDisponible;
    }
    
    public String mostrarInventario() {
    return this.identificacion + " | " + this.descripcion + " | Disponible: " + this.cantDisponible + " | En uso: " + this.getCantEnUso() + " | Dañados: " + this.cantDanada;
}
    
    
    
    
    
    
    
    
    
}
