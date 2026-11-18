/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

/**
 *
 * @author Asus
 */
public class EntregaRecursos {
    private int cantEntregada;
    private int cantBuenEstado;
    private int cantDañada;
    private int cantPerdida;
    private RecursoTecnologico myRecurso;
    private Curso myCurso;

    public int getCantEntregada() {
        return cantEntregada;
    }

    public void setCantEntregada(int cantEntregada) {
        this.cantEntregada = cantEntregada;
    }

    public int getCantBuenEstado() {
        return cantBuenEstado;
    }

    public void setCantBuenEstado(int cantBuenEstado) {
        this.cantBuenEstado = cantBuenEstado;
    }

    public int getCantDañada() {
        return cantDañada;
    }

    public void setCantDañada(int cantDañada) {
        this.cantDañada = cantDañada;
    }

    public int getCantPerdida() {
        return cantPerdida;
    }

    public void setCantPerdida(int cantPerdida) {
        this.cantPerdida = cantPerdida;
    }

    public RecursoTecnologico getMyRecurso() {
        return myRecurso;
    }

    public void setMyRecurso(RecursoTecnologico myRecurso) {
        this.myRecurso = myRecurso;
    }

    public Curso getMyCurso() {
        return myCurso;
    }

    public void setMyCurso(Curso myCurso) {
        this.myCurso = myCurso;
    }
    
    public EntregaRecursos(RecursoTecnologico myRecurso, Curso myCurso, int cantEntregada){
        this.myRecurso = myRecurso;
        this.myCurso = myCurso;
        this.cantEntregada = cantEntregada;
        
        this.cantBuenEstado = 0;
        this.cantDañada = 0;
        this.cantPerdida = 0;
    }
    
    @Override
    public String toString() {
    return "Recurso: " + this.myRecurso + "\n" +
           "Cantidad entregada: " + this.cantEntregada + "\n" +
           "Cantidad en buen estado: " + this.cantBuenEstado + "\n" +
           "Cantidad dañada: " + this.cantDañada + "\n" +
           "Cantidad perdida: " + this.cantPerdida;
}
}
