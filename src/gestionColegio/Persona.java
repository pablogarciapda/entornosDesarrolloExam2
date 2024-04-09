

package gestionColegio;

/**CHO
 *
 * @author Pablo Garcia
 */
public class Persona {

    private String dni;
    private String nombre;

    /**
     * Constructor para el objeto Persona
     * @param dni
     * @param nombre 
     */
    public Persona(String dni, String nombre) {
        super();
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
