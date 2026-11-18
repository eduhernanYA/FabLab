/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Asus
 */
public class Laboratorio {
    private ArrayList<RecursoTecnologico> myRecursos;
    private String codigo;
    private String tipo;
    private int capacidadMaxima;
    private String estado;

    public Laboratorio(ArrayList<RecursoTecnologico> myRecursos, String codigo, String tipo, String estado, int capacidadMaxima) {
        this.myRecursos = myRecursos;
        this.codigo = codigo;
        this.tipo = tipo;
        this.capacidadMaxima = capacidadMaxima;
        this.estado = estado;
    }

    

    public ArrayList<RecursoTecnologico> getMyRecursos() {
        return myRecursos;
    }

    public void setMyRecursos(ArrayList<RecursoTecnologico> myRecursos) {
        this.myRecursos = myRecursos;
    }

    
    
    public boolean agregarRecursos(RecursoTecnologico recurso){
        if(recurso == null){
            return false;
        }
        
        for(RecursoTecnologico r : myRecursos){
            if(r.getIdentificacion().equals(recurso.getIdentificacion())){
                return false;
            }
        }
        myRecursos.add(recurso);
        return true;
    }
    public void darBajaRecurso(){
        
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    
   /* 
    public Laboratorio(String codigo, String tipo, int capacidadMaxima){
        this.codigo = codigo;
        this.tipo = tipo;
        this.capacidadMaxima = capacidadMaxima;
        
        this.estado = "DISPONIBLE";
        this.myRecursos = new ArrayList<>();
        this.myCursos = new Curso[20];
    }
    */
        @Override
        public String toString(){
            String cad = "Laboratorio: " + this.tipo + "\n" +
                         "Capacidad: " + this.capacidadMaxima + " Estado: " + this.estado + "\n" +
                         "RECURSOS" + "\n";
                    
        for (int i = 0; i < this.myRecursos.size(); i++) {
        if (this.myRecursos != null) {
            cad = cad + this.myRecursos + "\n";
        }
    }
        return cad;
  }
}
