
package biblioteca;

/** Clase para establecer los atributos genéricos de las personas.
 * @author Mónica Mallén
 * @version 1.0
 */
public class Persona {
    private String nombre;
    private int edad;
    
    /**Método constructor de la persona
     * 
     * @param nombre Pasamos por parámetro el nombre de la persona.
     * @param edad Pasamos por parámetro la edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    

    /**Método getter  para acceder al nombre de la persona
     * 
     * @return nombre Devuelve el nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
    /**Método setter para establecer el nombre de la persona
     * 
     * @param nombre Pasamos por parámetro el nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**Método getter  para acceder a la edad de la persona
     * 
     * @return edad Devuelve la edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**Método setter para establecer la edad de la persona
     * 
     * @param edad Pasamos por parámetro la edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
