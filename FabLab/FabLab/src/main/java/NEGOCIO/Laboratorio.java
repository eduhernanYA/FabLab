/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

/**
 *
 * @author Asus
 */
public class Laboratorio {
    private RecursoTecnologico[] myRecursos;
    private String codigo;
    private String nombre;
    private String tipo;
    private int capacidadMaxima;
    private String estado;
    private Curso[] myCursos;

    public RecursoTecnologico[] getMyRecursos() {
        return myRecursos;
    }

    public void setMyRecursos(RecursoTecnologico[] myRecursos) {
        this.myRecursos = myRecursos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Curso[] getMyCursos() {
        return myCursos;
    }

    public void setMyCursos(Curso[] myCursos) {
        this.myCursos = myCursos;
    }
    
    public Laboratorio(String codigo, String nombre, String tipo, int capacidadMaxima){
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidadMaxima = capacidadMaxima;
        
        this.estado = "DISPONIBLE";
        this.myRecursos = new RecursoTecnologico[10];
        this.myCursos = new Curso[20];
    }
    
        @Override
        public String toString(){
            String cad = "Laboratorio: " + this.nombre + "\n" +
                         "Capacidad: " + this.capacidadMaxima + " Estado: " + this.estado + "\n" +
                         "RECURSOS" + "\n";
                    
        for (int i = 0; i < this.myRecursos.length; i++) {
        if (this.myRecursos[i] != null) {
            cad = cad + this.myRecursos[i] + "\n";
        }
    }
        return cad;
  }
}
