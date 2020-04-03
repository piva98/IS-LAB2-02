package solution;

/**
 *
 * @author Josué Pivaral
 */
public class Servicio {
    
    
    private Persistencia persistencia;
	
	public void ServicioPersona(Persistencia persistencia) {
		this.persistencia = persistencia;
	}

	public void guardarPersona(Persona persona) {
		persistencia.guardar(persona);
	}
    
    
}
