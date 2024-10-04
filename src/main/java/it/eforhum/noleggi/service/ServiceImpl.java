package it.eforhum.noleggi.service;

import it.eforhum.noleggi.entity.BaseEntity;
import it.eforhum.noleggi.dao.*;

public class ServiceImpl implements Service {

	private static ServiceImpl INSTANCE = new ServiceImpl();
	
	private ServiceImpl() {
		
	}
	
	public static ServiceImpl getInstance() {
		return INSTANCE;
	}
	
	
	FilmDao filmDao = new FilmRamDao();
	VideogiocoDao videogiocoDao = VideogiocoRamDao.getInstance();
	@Override
	public void noleggia(BaseEntity b) {

	}

	@Override
	public void elimina(BaseEntity b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calcolaPrezzo(BaseEntity b) {
		// TODO Auto-generated method stub

	}

}
