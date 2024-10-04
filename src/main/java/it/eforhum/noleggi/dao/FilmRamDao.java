package it.eforhum.noleggi.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import it.eforhum.noleggi.entity.Film;

public class FilmRamDao implements FilmDao {

	Map<Integer,Film> films = new HashMap<>();
	
	@Override
	public void save(Film film) {
		if(films.get(film.getId())!=null) {
			throw new RuntimeException("noleggio già presente");
		}
		films.put(film.getId(),film);
	}

	@Override
	public Optional<Film> findById(int id) {
		return Optional.of(films.get(id));
	}

	@Override
	public List<Film> findAll() {
		return new ArrayList<>(films.values());
	}

	@Override
	public void update(int id, Film film) {
		if(findById(id).isEmpty()) {
			throw new RuntimeException("impossibile aggiornare un elemento non esistente");
		}
		films.put(id, film);
	}

	@Override
	public boolean delete(int id) {
		if(findById(id).isEmpty()) {
			return false;
		}
		films.remove(id);
		return true;
	}

	@Override
	public boolean delete(Film film) {
		if(findById(film.getId()).isEmpty()) {
			return false;
		}
		films.remove(film.getId());
		return true;
	}
}
