package ve.com.aws.seguromedico.persistencia.excepcion;

import java.util.ArrayList;
import java.util.List;

import ve.com.aws.seguromedico.persistencia.SeguroMedicoMensaje;

public class SeguroMedicoException extends Exception {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<SeguroMedicoMensaje> seguroMedicoMensaje = new ArrayList<>();

	    public SeguroMedicoException(List<SeguroMedicoMensaje> seguroMedicoMensaje) {
	        this.seguroMedicoMensaje.addAll(seguroMedicoMensaje);
	    }

	    public SeguroMedicoException(SeguroMedicoMensaje seguroMedicoMensaje) {
	        this.seguroMedicoMensaje.add(seguroMedicoMensaje);
	    }

	    public List<SeguroMedicoMensaje> getSeguroMedicoMensajes() {
	        return seguroMedicoMensaje;
	    }
	    
	  
}
