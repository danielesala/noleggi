package it.eforhum.noleggi.service;

import it.eforhum.noleggi.entity.*;

public interface Service {

	void noleggia(BaseEntity b);
	
	void elimina(BaseEntity b);
	
	void calcolaPrezzo(BaseEntity b);
	
}
