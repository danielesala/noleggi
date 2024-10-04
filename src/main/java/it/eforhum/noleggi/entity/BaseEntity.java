package it.eforhum.noleggi.entity;

import java.time.LocalDate;

public abstract class BaseEntity {
	
	protected int id;
	protected String codice;
	protected String titolo;
	protected LocalDate dataInizio;
	protected LocalDate dataFine;
	
	public BaseEntity(int id) {
		this.id = id;
	}
	
	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}

	public int getId() {
		return id;
	}
	
	public double getPrezzo() {
		return 0;
	}
}

//ESERCITAZIONE IN AUTONOMIA/GRUPPO
//Scrivere un'applicazione standalone Java, in grado di simulare un sistema di noleggio giochi e film.
//
//Sia i giochi che i film hanno le seguenti caratteristiche
//- identificativo numerico univoco (es. 1)
//- codice alfanumerico (es. PS5-GT7)
//- titolo alfanumerico (es. Mamma ho perso l'aereo)
//- data inizio noleggio (es. 10/12/2020)
//- data fine noleggio (es. 12/12/2020)
//- prezzo noleggio calcolato dal sistema
//
//I giochi hanno come attributi non comuni
//- console di riferimento (valori ammissibili PC/PS4/PS5/XBOX-ONE-S/XBOX-ONE-X)
//
//I film hanno come attributi non comuni
//- genere (valori ammissibili ANIMAZIONE/AZIONE/COMMEDIA/DRAMMATICO/FAMIGLIA)

//Il prezzo di noleggio e' cosi' calcolato
//giochi - 1 * numero di giorni calcolati come differenza tra la data fine e la data inizio
//film - 2.5 * numero di giorni calcolati come differenza tra la data fine e la data inizio

//Implementare i metodi per calcolare il noleggio sia per i giochi che per i film
//implementare anche i metodi per aggiungere togliere ecc....