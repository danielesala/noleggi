package it.eforhum.noleggi.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.eforhum.noleggi.entity.Film;

public class FilmRamDao implements FilmDao {
	Logger log=LogManager.getLogger(FilmRamDao.class);
	
	
	Map<Integer,Film> films = new HashMap<>();
	private static FilmRamDao INSTANCE=new FilmRamDao();
	
	private FilmRamDao() {
		
	}
	public static FilmRamDao getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void save(Film film) {
		if(films.containsKey(film.getId())) {
			log.warn("Failed:film già presente!!!");
			throw new RuntimeException("noleggio già presente");
		}
		films.put(film.getId(),film);
		log.info("Film "+film+" aggiunto");
	}

	@Override
	public Optional<Film> findById(int id) {
		log.info("Ricerca film con id "+id);
		return Optional.of(films.get(id));
	}

	@Override
	public List<Film> findAll() {
		return new ArrayList<>(films.values());
	}

	@Override
	public void update(int id, Film film) {
		if(findById(id).isEmpty()) {
			log.warn("Failed:Film non trovato!!!");
			throw new RuntimeException("impossibile aggiornare un elemento non esistente");
		}
		films.put(id, film);
		log.info("Film "+film+" inserito in "+id);
	}

	@Override
	public boolean delete(int id) {
		if(findById(id).isEmpty()) {
			log.warn("Failed:Key non presente!!!");
			return false;
		}
		films.remove(id);
		log.info("Film con id "+id+" rimosso");
		return true;
	}

	@Override
	public boolean delete(Film film) {
		if(findById(film.getId()).isEmpty()) {
			log.warn("Failed:Key non presente!!!");
			return false;
		}
		films.remove(film.getId());
		log.info("Film "+film+" rimosso");
		return true;
	}
}
