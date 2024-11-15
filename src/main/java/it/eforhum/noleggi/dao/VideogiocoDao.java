package it.eforhum.noleggi.dao;

import java.util.List;
import java.util.Optional;

import it.eforhum.noleggi.entity.Videogioco;

public interface VideogiocoDao {
	
	void save(Videogioco newVideogioco);
	
	void update(int id,Videogioco videogioco);
	
	boolean delete(Videogioco videogioco);
	
	boolean deleteById(int id);
	
	Optional<Videogioco> findById(int id);
	
	List<Videogioco> findAll();
	
}
