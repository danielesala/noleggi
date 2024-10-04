package it.eforhum.noleggi.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.eforhum.noleggi.dao.FilmDao;
import it.eforhum.noleggi.dao.FilmRamDao;
import it.eforhum.noleggi.dao.VideogiocoDao;
import it.eforhum.noleggi.dao.VideogiocoRamDao;
import it.eforhum.noleggi.entity.BaseEntity;
import it.eforhum.noleggi.entity.Film;
import it.eforhum.noleggi.entity.Videogioco;

public class ServiceImpl implements Service {
	Logger log=LogManager.getLogger(ServiceImpl.class);
	
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
			log.info("Film "+b.getTitolo()+" noleggiato");
		}else {
			videogiocoDao.save((Videogioco)b);
			log.info("Videogioco "+b.getTitolo()+" noleggiato");
		}
	}

	@Override
	public void elimina(BaseEntity b) {
		if(b instanceof Film) {
			filmDao.delete((Film)b);
			log.info("Film "+b.getTitolo()+" rimosso");
		}else {
			videogiocoDao.delete((Videogioco)b);
			log.info("Videogioco "+b.getTitolo()+" rimosso");
		}
	}

	@Override
	public double calcolaPrezzo(BaseEntity b) {
		long giorni = b.getDataFine().toEpochDay() - b.getDataInizio().toEpochDay();
		if(b instanceof Film) {
			log.info("Costo noleggio film "+b.getTitolo()+": "+2.5*giorni);
			return 2.5 * giorni;
		}else {
			log.info("Costo noleggio videogioco "+b.getTitolo()+": "+1*giorni);
			return giorni;
		}
	}
}
