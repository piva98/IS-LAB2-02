
package problem;

/**
 *
 * @author Josué Pivaral
 */
public class Servicio {
    public void guardarPersona(Persona persona) {
		MySQL mysql = new MySQL();
		mysql.guardarPersona(persona);
	}
}
