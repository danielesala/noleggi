package it.eforhum.noleggi.dao;

import java.util.List;

import it.eforhum.noleggi.entity.Film;

public interface FilmDao {
	
	boolean save(Film film);
	
	Film findById(int id);
	
	List<Film> findAll();
	
	boolean update(int id, Film film);
	
	boolean delete(int id);
	
	boolean delete(Film film);
}
