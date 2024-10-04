package it.eforhum.noleggi.service;

import it.eforhum.noleggi.entity.*;
import it.eforhum.noleggi.dao.*;

public class ServiceImpl implements Service {

	private static ServiceImpl INSTANCE = new ServiceImpl();
	
	private ServiceImpl() {
		
	}
	
	public static ServiceImpl getInstance() {
		return INSTANCE;
	}
	
	FilmDao filmDao = FilmRamDao.getInstance();
	VideogiocoDao videogiocoDao = VideogiocoRamDao.getInstance();
	@Override
	public void noleggia(BaseEntity b) {
		if(b instanceof Film) {
			filmDao.save((Film)b);
		}else {
			videogiocoDao.save((Videogioco)b);
		}
	}

	@Override
	public void elimina(BaseEntity b) {
		if(b instanceof Film) {
			filmDao.delete((Film)b);
		}else {
			videogiocoDao.delete((Videogioco)b);
		}
	}

	@Override
	public double calcolaPrezzo(BaseEntity b) {
		long giorni = b.getDataFine().toEpochDay() - b.getDataInizio().toEpochDay();
		
		if(b instanceof Film) {
			return 2.5 * giorni;
		}else {
			return giorni;
		}
	}
}
