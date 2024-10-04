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
	
	public Console getConsole() {
		return console;
	}
	
	public void setConsole(Console console) {
		this.console = console;
	}
}
