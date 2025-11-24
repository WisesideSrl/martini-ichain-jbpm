package com.wiseside.martinidev.model;

import java.io.Serializable;
import java.time.LocalDate;

public class CicloAllevamento implements Serializable {
	private static final long serialVersionUID = -1;

	public String codiceCiclo;

	public LocalDate dataInizioPianificata;

	public Integer numeroMaschi;

	public Integer numeroFemmine;

	private java.util.List<com.wiseside.martinidev.model.Accasamento> accasamenti;

	public java.util.List<com.wiseside.martinidev.model.Accasamento> getAccasamenti() {
		return this.accasamenti;
	}

	public void setAccasamenti(
			java.util.List<com.wiseside.martinidev.model.Accasamento> accasamenti) {
		this.accasamenti = accasamenti;
	}

	public CicloAllevamento() {
	}

	public CicloAllevamento(
			java.lang.String codiceCiclo,
			java.time.LocalDate dataInizioPianificata,
			java.lang.Integer numeroMaschi,
			java.lang.Integer numeroFemmine,
			java.util.List<com.wiseside.martinidev.model.Accasamento> accasamenti) {
		this.codiceCiclo = codiceCiclo;
		this.dataInizioPianificata = dataInizioPianificata;
		this.numeroMaschi = numeroMaschi;
		this.numeroFemmine = numeroFemmine;
		this.accasamenti = accasamenti;
	}

}
