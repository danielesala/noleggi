package it.eforhum.noleggi.entity;

import java.time.LocalDate;
import java.time.Period;

import it.eforhum.noleggi.util.Sequences;

public class Videogioco extends BaseEntity{
	Console console;

	
	
	public Videogioco(String codice, String titolo, LocalDate dataInizio, LocalDate dataFine) {
		super(Sequences.getSeqGioco());
		this.codice = codice;
		this.titolo = titolo;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

	@Override
	public double getPrezzo() {
		long period=super.dataFine.toEpochDay()-super.dataInizio.toEpochDay();
		return 1*(period);
	}
	
}
