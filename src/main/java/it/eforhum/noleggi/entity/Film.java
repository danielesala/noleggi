package it.eforhum.noleggi.entity;

import java.time.LocalDate;
import java.time.temporal.TemporalAmount;

import it.eforhum.noleggi.util.Sequences;

public class Film extends BaseEntity{
	public Film() {
		super(Sequences.getSeqFilm());
	}

	private Genere genere;

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}
	
}
