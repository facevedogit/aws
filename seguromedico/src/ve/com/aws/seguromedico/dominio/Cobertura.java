package ve.com.aws.seguromedico.dominio;

import java.io.Serializable;

public class Cobertura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean oftalmologia;
	private boolean dental;
	private boolean fecundacionInVitro;

	public Cobertura() {
	}

	public Cobertura(boolean oftalmologia, boolean dental, boolean fecundacionInVitro) {
		this.oftalmologia = oftalmologia;
		this.dental = dental;
		this.fecundacionInVitro = fecundacionInVitro;
	}

	/**
	 * @return the oftalmologia
	 */
	public boolean isOftalmologia() {
		return oftalmologia;
	}

	/**
	 * @param oftalmologia
	 *            the oftalmologia to set
	 */
	public void setOftalmologia(boolean oftalmologia) {
		this.oftalmologia = oftalmologia;
	}

	/**
	 * @return the dental
	 */
	public boolean isDental() {
		return dental;
	}

	/**
	 * @param dental
	 *            the dental to set
	 */
	public void setDental(boolean dental) {
		this.dental = dental;
	}

	/**
	 * @return the fecundacionInVitro
	 */
	public boolean isFecundacionInVitro() {
		return fecundacionInVitro;
	}

	/**
	 * @param fecundacionInVitro
	 *            the fecundacionInVitro to set
	 */
	public void setFecundacionInVitro(boolean fecundacionInVitro) {
		this.fecundacionInVitro = fecundacionInVitro;
	}
}
