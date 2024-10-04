package it.eforhum.noleggi.dao;

import java.util.List;

import it.eforhum.noleggi.entity.Film;

public interface FilmDao {
	
	void save(Film film);
	
	Optional<> findById(int id);
	
	List<Film> findAll();
	
	boolean update(int id, Film film);
	
	boolean delete(int id);
	
	boolean delete(Film film);
}
