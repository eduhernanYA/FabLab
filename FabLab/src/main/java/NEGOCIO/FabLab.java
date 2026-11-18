/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;


/*
 * ==================================================================
 *  CALIFICACIÓN PRIMER AVANCE (ESTRUCTURA) - POO 2026-2 - FABLAB UFPS
 * ==================================================================
 *  Estudiantes (códigos): 1152706, 1152711
 *
 *  RÚBRICA (escala 0.0 - 5.0):
 *   C1. Clase contenedora FabLab: colecciones y firmas de servicios RF1-RF7: 0.30 / 0.7
 *        Tiene arreglos de laboratorios, entregas, personas e inscripciones, pero no se crean en el
 *        constructor y no hay arreglo de cursos. Las firmas de RF están, pero sin parámetros.
 *   C2. Clases del negocio y atributos según el enunciado: 1.30 / 1.5
 *        Laboratorio (0.3) y Recurso (0.3) completos. Persona tiene los datos pero mezcla los roles
 *        (0.2). Curso (0.25) e Inscripción (0.25) tienen sus atributos pero no tienen constructor.
 *   C3. Relaciones OO: herencia, todo/parte, clases de asociación, asociaciones: 0.75 / 1.2
 *        No hay herencia (0). Todo/parte Laboratorio-Recurso (0.3). Inscripción (0.1).
 *        EntregaRecursos une curso y recurso con cantidades, pero solo la guarda FabLab y Curso no
 *        conoce ni sus entregas ni su laboratorio (0.15). Curso-Instructor sí; Curso-Laboratorio
 *        solo desde Laboratorio (0.2).
 *   C4. Encapsulamiento, constructores y buenas prácticas: 0.25 / 0.6
 *        Curso e Inscripción no tienen constructor ni getters/setters. Los setters de arreglos
 *        exponen la estructura interna.
 *   C5. Capa de presentación (Swing) con estructura visual y conectada al negocio sin lógica: 0.10 / 1.0
 *        Solo hay un menú con 6 botones de los RF, sin acciones, y un panel vacío (0.1). No hay
 *        ningún formulario con campos y FabLab no está conectado.
 *
 *  NOTA FINAL: 2.7 / 5.0
 *
 *  OBSERVACIONES / POR MEJORAR:
 *   - HERENCIA: no existe. Persona tiene vinculación, tipoPoblacion y entidadProcedencia, que son
 *     datos del participante. Por qué está mal: cuando se cree un instructor, esos atributos quedan
 *     vacíos o sin sentido. Además, Curso.myInstructor es de tipo Persona, así que se podría
 *     asignar un participante como instructor. Y la regla 'el instructor no puede tener dos cursos
 *     a la misma hora' no tiene una clase donde vivir. Cómo debe ser: Persona (id, nombre, correo,
 *     teléfono) como padre, Participante extends Persona (vinculación, población, entidad) e
 *     Instructor extends Persona.
 *   - RECURSOS ASIGNADOS AL CURSO: EntregaRecursos tiene la idea correcta (curso, recurso,
 *     cantidades), pero solo se guarda en un arreglo de FabLab, y Curso no conoce ni sus entregas
 *     ni su laboratorio. Por qué está mal: para iniciar un curso hay que tomar los recursos del
 *     laboratorio DE ESE CURSO, pero desde el Curso no se puede llegar a su laboratorio. Para
 *     cerrar el curso hay que buscar sus entregas recorriendo todas las entregas del sistema. Cómo
 *     debe ser: Curso con referencia a su Laboratorio y con su propio arreglo de EntregaRecursos.
 *   - CURSO E INSCRIPCIÓN: solo declaran atributos, sin constructor ni getters/setters. Por qué
 *     está mal: no se puede crear un curso con sus datos ni leerlos desde otra clase, así que
 *     FabLab no podría trabajar con ellos.
 *   - FABLAB: los arreglos se declaran pero no se crean en el constructor (quedan en null y
 *     fallarían al usarlos), y no hay arreglo de cursos. Las firmas de RF no tienen parámetros (ej.
 *     programarCurso()): cada servicio debe declarar qué datos recibe (código, nombre, laboratorio,
 *     instructor, etc.).
 *   - ENCAPSULAMIENTO: setMyRecursos() y setMyCursos() permiten reemplazar el arreglo completo del
 *     laboratorio desde afuera.
 *   - VENTANAS: solo hay un menú con botones que no hacen nada y un panel vacío. Faltan los
 *     formularios de cada RF con su estructura visual (etiquetas, campos, listas, botones,
 *     JTextArea para informes), y la ventana principal debe crear FabLab.
 *   - ANOTACIÓN (no afecta la nota): el proyecto está duplicado (FabLab/ y FabLab/FabLab/FabLab/)
 *     con versiones diferentes. Se calificó la interna, que es la más completa.
 *   - ANOTACIÓN (no afecta la nota): hay un comentario informal dentro de FabLab ('eduar trate de
 *     no tocar...').
 * ==================================================================
 * 
 */
/**
 *
 * @author Asus
 */
public class FabLab {

    private Laboratorio[] myLaboratorio;
    private TreeSet<Curso> myCursos;
    private HashSet<Persona> myPersonas;
    private ArrayList<RecursoTecnologico> myInventario;

    // private Inscripcion[] myInscripciones; 
    /*
    *RF1: Iniciar FABLAB
    *RF2. Programar un curso de formación
    *RF3. Gestionar la inscripción de participantes
    *RF4. Preparar e iniciar un curso mediante entrega de recursos
    *RF5. Cerrar el curso y conciliar los recursos utilizados
    *RF6. Finalizar la formación y determinar la certificación
    *RF7. Consultas e informes de control
     */
    public FabLab() {
        this.myLaboratorio = new Laboratorio[5];
        this.myCursos = new TreeSet<>();
        this.myInventario = new ArrayList<>();
        this.myPersonas = new HashSet<>();
        this.iniciarRecursos();

    }

    private void iniciarRecursos() {
        this.recursosIniciales();
        this.crearLaboratorios();
    }

    //RF1
    private void crearLaboratorios() {
        ArrayList<RecursoTecnologico> recursosDrones = new ArrayList<>(this.myInventario.subList(0, 3));
        ArrayList<RecursoTecnologico> recursosRealidad = new ArrayList<>(this.myInventario.subList(3, 5));
        ArrayList<RecursoTecnologico> recursosImpresion = new ArrayList<>(this.myInventario.subList(5, 7));
        ArrayList<RecursoTecnologico> recursosInternet = new ArrayList<>(this.myInventario.subList(7, 10));
        ArrayList<RecursoTecnologico> recursosContenido = new ArrayList<>(this.myInventario.subList(10, 15));
        this.myLaboratorio[0] = new Laboratorio(recursosDrones, "LO1", "Drones", "DISPONIBLE", 20);
        this.myLaboratorio[1] = new Laboratorio(recursosRealidad, "LO2", "Realidad aumentada", "DISPONIBLE", 18);
        this.myLaboratorio[2] = new Laboratorio(recursosImpresion, "LO3", "Impresion 3d", "DISPONIBLE", 15);
        this.myLaboratorio[3] = new Laboratorio(recursosInternet, "LO4", "Internet de las cosas", "DISPONIBLE", 24);
        this.myLaboratorio[4] = new Laboratorio(recursosContenido, "LO5", "Contenidos digitales", "DISPONIBLE", 20);
    }

    private void recursosIniciales() {

        this.myInventario.add(new RecursoTecnologico("DR-01", "Dron de formacion", "Equipo", 1500000, 6));
        this.myInventario.add(new RecursoTecnologico("DR-02", "Control remoto", "Equipo", 450000, 6));
        this.myInventario.add(new RecursoTecnologico("DR-03", "Bateria recargable", "Equipo", 350000, 12));
        this.myInventario.add(new RecursoTecnologico("RA-01", "Visor de realidad aumentada", "Equipo", 1800000, 10));
        this.myInventario.add(new RecursoTecnologico("RA-02", "Tablet de apoyo", "Equipo", 900000, 10));
        this.myInventario.add(new RecursoTecnologico("I3-01", "Impresora 3D", "Equipo", 2800000, 6));
        this.myInventario.add(new RecursoTecnologico("I3-02", "Filamento PLA", "Material", 90000, 20));
        this.myInventario.add(new RecursoTecnologico("IO-01", "Kit arduino", "Equipo", 180000, 20));
        this.myInventario.add(new RecursoTecnologico("IO-02", "Kit de sensores", "Equipo", 120000, 20));
        this.myInventario.add(new RecursoTecnologico("IO-03", "Protoboard", "Equipo", 30000, 20));
        this.myInventario.add(new RecursoTecnologico("CD-01", "Camara digital", "Equipo", 3200000, 6));
        this.myInventario.add(new RecursoTecnologico("CD-02", "Microfono inalambrico", "Equipo", 650000, 8));
        this.myInventario.add(new RecursoTecnologico("CD-03", "Kit de iluminacion LED", "Equipo", 750000, 8));
        this.myInventario.add(new RecursoTecnologico("CD-04", "Tripode para camara", "Equipo", 280000, 6));
        this.myInventario.add(new RecursoTecnologico("CD-05", "Tableta digitalizadora", "Equipo", 550000, 10));
    }

    public String programarCurso(String codigo, String nombre, String area, String fechaInicio, String fechaFin,
            String horaInicio, String horaFin, int cupo, String poblacion, String entidad, String idInstructor, String codLab) {
        if (this.buscarCurso(codigo) != null) {
            return "Ya existe un curso con ese codigo";
        }
        
        String resultado = this.validarLaboratorio(codLab, area, cupo);
        if(!resultado.equals("OK")){
            return resultado;
        }
        
        if (this.buscarPersona(idInstructor) == null) {
            return "El instructor no existe";
        }
        return "Su curso ha sido registrado exitosamente";

    }

    public Laboratorio buscarLaboratorio(String codigo) {
        if (this.myLaboratorio != null) {
            for (int i = 0; i < this.myLaboratorio.length; i++) {
                if (this.myLaboratorio[i].getCodigo().equals(codigo)) {
                    return this.myLaboratorio[i];
                }
            }
        }
        return null;
    }

    public Curso buscarCurso(String codigo) {
        for (Curso c : this.myCursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public Persona buscarPersona(String cedula) {
        for (Persona p : this.myPersonas) {
            if (p.getIdentificacion().equals(cedula)) {
                return p;
            }
        }
        return null;
    }

    public String validarLaboratorio(String codigo, String area, int cupo) {
        Laboratorio l = this.buscarLaboratorio(codigo);

        if (l == null) {
            return "El laboratorio no existe";
        }
        if (!l.getEstado().equals("DISPONIBLE")) {
            return "El laboratorio no esta disponible";
        }
        if (!l.getTipo().equals(area)) {
            return "El laboratorio no corresponde al area";
        }
        if (l.getCapacidadMaxima() < cupo) {
            return "El cupo supera la capacidad";
        }
        return "OK";
    }

    /*
    private void asignarRecursosIniciales(){
        this.myLaboratorio[0].agregarRecursos(this.myInventario.get(0));
        this.myLaboratorio[0].agregarRecursos(this.myInventario.get(1));
        this.myLaboratorio[0].agregarRecursos(this.myInventario.get(2));
        this.myLaboratorio[1].agregarRecursos(this.myInventario.get(3));
        this.myLaboratorio[1].agregarRecursos(this.myInventario.get(4));
        this.myLaboratorio[2].agregarRecursos(this.myInventario.get(5));
        this.myLaboratorio[2].agregarRecursos(this.myInventario.get(6));
        this.myLaboratorio[3].agregarRecursos(this.myInventario.get(7));
        this.myLaboratorio[3].agregarRecursos(this.myInventario.get(8));
        this.myLaboratorio[3].agregarRecursos(this.myInventario.get(9));
        this.myLaboratorio[4].agregarRecursos(this.myInventario.get(10));
        this.myLaboratorio[4].agregarRecursos(this.myInventario.get(11));
        this.myLaboratorio[4].agregarRecursos(this.myInventario.get(12));
        this.myLaboratorio[4].agregarRecursos(this.myInventario.get(13));
        this.myLaboratorio[4].agregarRecursos(this.myInventario.get(14));
    }
     */
    public String listarRecursos() {
        String cad = "";
        for (RecursoTecnologico r : this.myInventario) {
            //  cad += r.getIdentificacion()+"\n"+r.getDescripcion()+"\n"+r.getTipoRecurso()+"\n"+r.getCantidad()+"\n"+r.getValorUnitario()+"\n"+"-----------------------------"+"\n";
            cad += r.toString() + "\n" + "-------------------------------------------------" + "\n";
        }
        return cad;
    }
    
    public String listarLaboratorios(){
        String cad = "";
        for(Laboratorio l: this.myLaboratorio){
            cad += l.getCodigo()+" "+l.getTipo()+"/";
        }
        return cad;
    }
    
    public String listarArea(){
        String cad = "";
        for(Laboratorio l: this.myLaboratorio){
            cad += l.getTipo()+"/";
        }
        return cad;
    }
    
    public String listarInstructor(int horaInicio, int horaFinal, String fechaInicio, String fechaFinal){
        String cad = "";
        for(Persona p: this.myPersonas){
            if(p.getRol().equals("Instructor")){
                if(disponibilidadInstructor(p, horaInicio, horaFinal)){
                    cad+= p.getIdentificacion() +" "+p.getNombre();
                }
            }
        }
        return cad;
    }
    
    private boolean disponibilidadInstructor(Persona p, int horaInicio, int horaFinal){
        if(myCursos!=null){
            for(Curso c: this.myCursos){
                
            }
        }
        return false;
    }
}