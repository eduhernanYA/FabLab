/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Curso {
    private String nombre;
    private String areaTecnologia;
    private String fechaInicio;
    private String fechaFin;
    private String horarioInicio;
    private String horarioFinal;
    private int cupo;
    private String estado;
    private String poblacionObjetivo;
    private String entidadSolicitante;
    private String codigo;
    private Persona myInstructor;
    private ArrayList<Participante> myParticipantes;
    private Laboratorio myLaboratorio;

    public Curso(String nombre, String areaTecnologia, String fechaInicio, String fechaFin, String horarioInicio, String horarioFinal, int cupo, String estado,
            String poblacionObjetivo, String entidadSolicitante, String codigo, Persona myInstructor, ArrayList<Participante> myParticipantes, Laboratorio myLaboratorio) {
        this.nombre = nombre;
        this.areaTecnologia = areaTecnologia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horarioInicio = horarioInicio;
        this.horarioFinal = horarioFinal;
        this.cupo = cupo;
        this.estado = estado;
        this.poblacionObjetivo = poblacionObjetivo;
        this.entidadSolicitante = entidadSolicitante;
        this.codigo = codigo;
        this.myInstructor = myInstructor;
        this.myParticipantes = myParticipantes;
        this.myLaboratorio = myLaboratorio;
    }
    
    public int compareTo(Curso otro){
        return this.codigo.compareTo(((Curso)otro).getCodigo());
    }
    
    @Override
    public int hashCode(){
        return this.codigo.hashCode();
    }
    
    
    @Override
    public boolean equals(Object obj){
        return this.codigo.equals(((Curso)obj).getCodigo());
    }
    

    public Curso() {
    }

    public Laboratorio getMyLaboratorio() {
        return myLaboratorio;
    }

    public void setMyLaboratorio(Laboratorio myLaboratorio) {
        this.myLaboratorio = myLaboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaTecnologia() {
        return areaTecnologia;
    }

    public void setAreaTecnologia(String areaTecnologia) {
        this.areaTecnologia = areaTecnologia;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPoblacionObjetivo() {
        return poblacionObjetivo;
    }

    public void setPoblacionObjetivo(String poblacionObjetivo) {
        this.poblacionObjetivo = poblacionObjetivo;
    }

    public String getEntidadSolicitante() {
        return entidadSolicitante;
    }

    public void setEntidadSolicitante(String entidadSolicitante) {
        this.entidadSolicitante = entidadSolicitante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Persona getMyInstructor() {
        return myInstructor;
    }

    public void setMyInstructor(Persona myInstructor) {
        this.myInstructor = myInstructor;
    }

    public ArrayList<Participante> getMyParticipantes() {
        return myParticipantes;
    }

    public void setMyParticipantes(ArrayList<Participante> myParticipantes) {
        this.myParticipantes = myParticipantes;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", areaTecnologia=" + areaTecnologia + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", horarioInicio=" + horarioInicio + ", horarioFinal=" + horarioFinal + ", cupo=" + cupo + ", estado=" + estado + ", poblacionObjetivo=" + poblacionObjetivo + ", entidadSolicitante=" + entidadSolicitante + ", codigo=" + codigo + ", myInstructor=" + myInstructor + ", myParticipantes=" + myParticipantes + '}';
    }
    
    
}
