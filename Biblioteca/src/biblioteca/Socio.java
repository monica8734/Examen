
package biblioteca;

/** Clase para establecer los atributos del socio. Hereda de la clase Persona
 * @author Mónica Mallén
 * @version 1.0
 */
public class Socio extends Persona{
    
   private int telefono;

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
