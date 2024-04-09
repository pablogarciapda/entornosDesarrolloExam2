

package gestionColegio;

import java.util.ArrayList;
import java.util.List;

/**CHO
 *
 * @author Pablo Garcia
 */
public class Asignatura {

    private int codigo;
    private String nombre;
    private int horasAnuales;
    private Profesor profesor;
    private List<Alumno> alumnos;
    

    /**
     * Contructor para crear el objeto Asisnatura, donde le pasamos los siguientes parametros
     * 
     * @param codigo
     * @param nombre
     * @param horasAnualesco
     * @param profesor 
     */
    public Asignatura(int codigo, String nombre, int horasAnuales, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasAnuales = horasAnuales;
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasAnuales() {
        return horasAnuales;
    }

    public void setHorasAnuales(int horasAnuales) {
        this.horasAnuales = horasAnuales;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", horasAnuales=" + horasAnuales + ", profesor=" + profesor + ", alumnos=" + alumnos + '}';
    }
    
    
    
    
}
