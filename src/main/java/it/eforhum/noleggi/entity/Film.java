package it.eforhum.noleggi.entity;

import java.time.LocalDate;
import java.time.temporal.TemporalAmount;

public class Film extends BaseEntity{
	private Genere genere;

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}

	@Override
	public double getPrezzo() {
		long giorni = super.dataFine.toEpochDay() - super.dataInizio.toEpochDay();
		return 2.5 * giorni;
	}
	
}
