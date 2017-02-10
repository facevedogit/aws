package ve.com.aws.seguromedico.persistencia;

public class SeguroMedicoMensaje {

	private final String fieldName;
	private final String message;

	public SeguroMedicoMensaje(String fieldName, String message) {
		this.fieldName = fieldName;
		this.message = message;
	}

	public String getFieldName() {
		return fieldName;
	}

	public String getMessage() {
		return message;
	}
}
