package it.eforhum.noleggi.entity;

import java.time.LocalDate;

public class Film extends BaseEntity{
	Genere genere;

	@Override
	public double getPrezzo() {
		
//		film - 2.5 * numero di giorni calcolati come differenza tra la data fine e la data inizio
		return 2.5*
	}
	
}
