package it.eforhum.noleggi.entity;

import java.time.LocalDate;
import java.time.Period;

public class Videogioco extends BaseEntity{
	Console console;

	public Videogioco(int id, String codice, String titolo, LocalDate dataInizio, LocalDate dataFine) {
		this.id = id;
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

	@Override
	public double getPrezzo() {
		long period=super.dataFine.toEpochDay()-super.dataInizio.toEpochDay();
		return 1*(period);
	}
	
}
