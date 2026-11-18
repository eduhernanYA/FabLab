/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

/**
 *
 * @author estudiantes
 */
public class Participante extends Persona {
    private String tipo;
    private boolean publica;
    private String nombreEntidad;

    public Participante(String tipo, boolean publica, String nombreEntidad, String identificacion, String nombre, String correo, String telefono, String vinculacion, String rol, String entidadProcedencia) {
        super(identificacion, nombre, correo, telefono, vinculacion, rol, entidadProcedencia);
        this.tipo = tipo;
        this.publica = publica;
        this.nombreEntidad = nombreEntidad;
    }
    
    public Participante(String identificacion, String nombre, String correo, String telefono, String vinculacion, String tipoPoblacion, String entidadProcedencia) {
        super(identificacion, nombre, correo, telefono, vinculacion, tipoPoblacion, entidadProcedencia);
    }
    
}
