package it.eforhum.noleggi.dao;

import java.util.List;
import java.util.Optional;

import it.eforhum.noleggi.entity.Film;

public interface FilmDao {
	
	void save(Film film);
	
	Optional<Film> findById(int id);
	
	List<Film> findAll();
	
	void update(int id, Film film);
	
	boolean delete(int id);
	
	boolean delete(Film film);
}
