package it.eforhum.noleggi.dao;

import it.eforhum.noleggi.entity.Videogioco;

public interface VideogiocoDao {
	
	boolean save(Videogioco newVideogioco);
	
	boolean update(long id,Videogioco videogioco);
	
	boolean delete(Videogioco videogioco);
	
	
	
}
