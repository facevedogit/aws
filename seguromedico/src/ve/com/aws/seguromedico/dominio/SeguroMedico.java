package ve.com.aws.seguromedico.dominio;

import java.io.Serializable;

public class SeguroMedico implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idSeguro;
    private String rif;
    private String nombre;
    private String apellido;
    private int edad;
    private Sexo sexo;
    private boolean casado;
    private int numHijos;
    private boolean embarazada;
    private Cobertura Cobertura=new Cobertura();
    private Enfermedad Enfermedad=new Enfermedad();

    /**
     * @return the idSeguro
     */
    public int getIdSeguro() {
        return idSeguro;
    }

    /**
     * @param idSeguro the idSeguro to set
     */
    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    /**
     * @return the rif
     */
    public String getRif() {
        return rif;
    }

    /**
     * @param rif the rif to set
     */
    public void setRif(String rif) {
        this.rif = rif;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the casado
     */
    public boolean isCasado() {
        return casado;
    }

    /**
     * @param casado the casado to set
     */
    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    /**
     * @return the numHijos
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     * @param numHijos the numHijos to set
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    /**
     * @return the embarazada
     */
    public boolean isEmbarazada() {
        return embarazada;
    }

    /**
     * @param embarazada the embarazada to set
     */
    public void setEmbarazada(boolean embarazada) {
        this.embarazada = embarazada;
    }

    /**
     * @return the Cobertura
     */
    public Cobertura getCobertura() {
        return Cobertura;
    }

    /**
     * @param Cobertura the Cobertura to set
     */
    public void setCobertura(Cobertura Cobertura) {
        this.Cobertura = Cobertura;
    }

    /**
     * @return the Enfermedad
     */
    public Enfermedad getEnfermedad() {
        return Enfermedad;
    }

    /**
     * @param Enfermedad the Enfermedad to set
     */
    public void setEnfermedad(Enfermedad Enfermedad) {
        this.Enfermedad = Enfermedad;
    }
}
