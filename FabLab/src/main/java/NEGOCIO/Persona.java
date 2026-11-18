/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

/**
 *
 * @author Asus
 */
public class Persona {

    private String identificacion;
    private String nombre;
    private String correo;
    private String telefono;
    private String vinculacion;
    private String rol; //Comunidad, externo, Instructor
    private String entidadProcedencia;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }
        Persona otra = (Persona) obj;
        return this.identificacion.equals(otra.identificacion);
    }

    @Override
    public int hashCode() {
        return this.identificacion.hashCode();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(String vinculacion) {
        this.vinculacion = vinculacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEntidadProcedencia() {
        return entidadProcedencia;
    }

    public void setEntidadProcedencia(String entidadProcedencia) {
        this.entidadProcedencia = entidadProcedencia;
    }

    public Persona(String identificacion, String nombre, String correo, String telefono, String vinculacion, String rol, String entidadProcedencia) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.vinculacion = vinculacion;
        this.rol = rol;
        this.entidadProcedencia = entidadProcedencia;
    }

}
