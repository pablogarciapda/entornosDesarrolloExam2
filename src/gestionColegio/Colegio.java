

package gestionColegio;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**CHO
 *
 * @author Pablo Garcia
 * @version 1.0
 */
public class Colegio {
    
    /**
     * Atributos de la clase Colegio estan formados por
     * un arrayList de Asignatura y de Persona
     */

    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Persona> personas;

    
    /**
     * Genera un objeto de la clase Colegio que genera dos listas
     * una para asignaturas que es del tipo {@code Asignatura}
     * y otra para personas del tipo {@code Persona}
     * Metodo sin parametros
     *  
     * 
     */
    public Colegio() {
        asignaturas = new ArrayList<>();
        personas = new ArrayList<>();
    }
    
    /**
     * metodo que nos guarda los datos del programa en un fichero
     * {@code Asignatura} lista de asignaturas
     * {@code Persona} lista de Personas
     * 
     * 
     */    
    public void guardarDatos() {
        
     
    }
    
    /**
     * metodo que recupera los datos del programa de un fichero
     * {@code Asignatura} guarda en lista de asignaturas
     * {@code Persona}  guarda en lista de Personas
     * 
     * 
     */
    public void cargarDatos(){
        
    }
    
    /**
     * medodo que imprime la lista de profesores 
     */
    public void listarProfesores(){
        
    }
    

    /**
     * medodo que imprime la lista de Alumnos 
     */
    public void listarAlumnos(){
        
    }
    
    /**
     * Metodo que nos da de alta un profesor
     * 
     * @param departamento
     * @param dni
     * @param nombre 
     */
    public void altaProfesor(String departamento, String dni, String nombre){
        
    }
    
    /**
     * Metodo que no da de lata un alumno;
     * 
     * @param fechaMatriculacion
     * @param nacionalidad
     * @param dni
     * @param nombre 
     */
    public void altaAlumno(String fechaMatriculacion, String nacionalidad, String dni, String nombre){
        
    }
    /**
     * Metodo que nos da de alta una asignatura
     * 
     * @param codigo
     * @param nombre
     * @param horasAnuales
     * @param profesor 
     */
    public void altaAsignatura(int codigo, String nombre, int horasAnuales, Profesor profesor){
        
    }
    
    /**
     * Metodo que nos da de alta a un alumno en la asignatura que le pasamos por parametro
     * tambien le pasamos el dni del alumno el cual los buscamos en la lista de alumnos y si existe nos
     * los agrega en la lista de alumnos en dicha asignatura
     * @param codAsignatura
     * @param dniAlumo 
     */
    public void altaAlumnoAsignatura(int codAsignatura, int dniAlumo){
        
    }
    
    /**
     * metodo que nos lista la cantidad de asignaturas del profesor que le pasamos por dni
     * Buscaremos el profesor en la lista de profesores y si existe contamos las asignaturas que tiene
     * @param dniProfesor
     * 
     * @return nos devuelve una datos de tipo int
     */
    public int cantidadAsignaturaProfesor(String dniProfesor){
        int numeroAsignaturas = 0; 
        
        return numeroAsignaturas;
    }
    
    /**
     * 
     * metodo que nos devuelve un int con el numero de asignaturas del alumno que mas tiene
     * 
     * @return nos devuelve un objeto del tipo Asignatura el cual se corresponde con el alumno que mas asignatura tiene
     */
    public Asignatura asignaturaConMasAlumnos(){
        Asignatura asignatura = null;
        
        return asignatura;
    }
            
    
    
   
    
    
}
