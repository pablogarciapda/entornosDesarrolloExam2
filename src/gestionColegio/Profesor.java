

package gestionColegio;

/**CHO
 *
 * @author Pablo Garcia
 */
public class Profesor extends Persona {

    private String departamento;

    /**
     * constructor para crear un objeto Profesor
     * @param departamento
     * @param dni
     * @param nombre 
     */
    public Profesor(String departamento, String dni, String nombre) {
        super(dni, nombre);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamento=" + departamento + '}';
    }
    
    
    
    
}
