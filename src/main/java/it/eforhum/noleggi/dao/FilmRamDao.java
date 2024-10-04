package it.eforhum.noleggi.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.eforhum.noleggi.entity.Film;

public class FilmRamDao implements FilmDao {

	Map<Integer,Film> films = new HashMap<>();
	
	@Override
	public boolean save(Film film) {
		films.put(null, film)
		return false;
	}

	@Override
	public Film findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(int id, Film film) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Film film) {
		// TODO Auto-generated method stub
		return false;
	}

}
