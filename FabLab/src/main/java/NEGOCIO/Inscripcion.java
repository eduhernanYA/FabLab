/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

/**
 *
 * @author Asus
 */
public class Inscripcion {
    private String numeroInscripcion;
    private String fecha;
    private Persona myParticipante;
    private Curso myCurso;
    private double porcentajeAsistencia;
    private double notaFinal;
    private String estado;
    private String certificacion;

    public Inscripcion(String numeroInscripcion, String fecha, Persona myParticipante, Curso myCurso, double porcentajeAsistencia, double notaFinal, String estado, String certificacion) {
        this.numeroInscripcion = numeroInscripcion;
        this.fecha = fecha;
        this.myParticipante = myParticipante;
        this.myCurso = myCurso;
        this.porcentajeAsistencia = porcentajeAsistencia;
        this.notaFinal = notaFinal;
        this.estado = estado;
        this.certificacion = certificacion;
    }

    
    
    public String getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(String numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Persona getMyParticipante() {
        return myParticipante;
    }

    public void setMyParticipante(Persona myParticipante) {
        this.myParticipante = myParticipante;
    }

    public Curso getMyCurso() {
        return myCurso;
    }

    public void setMyCurso(Curso myCurso) {
        this.myCurso = myCurso;
    }

    public double getPorcentajeAsistencia() {
        return porcentajeAsistencia;
    }

    public void setPorcentajeAsistencia(double porcentajeAsistencia) {
        this.porcentajeAsistencia = porcentajeAsistencia;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public void setCertificacion(String certificacion) {
        this.certificacion = certificacion;
    }
    
    
}
