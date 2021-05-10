
package biblioteca;

/** Clase para establecer los atributos del trabajador. Hereda de la clase Persona
 * @author Mónica Mallén
 * @version 1.0
 */
public class Trabajador extends Persona {
    
    private double salario;

    /**Método getter  para acceder al salario del trabajador
     * 
     * @return salario Devuelve el salario del trabajador.
     */
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
