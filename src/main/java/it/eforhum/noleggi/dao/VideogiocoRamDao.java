package it.eforhum.noleggi.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.eforhum.noleggi.entity.Videogioco;
import it.eforhum.noleggi.util.MockData;

public class VideogiocoRamDao implements VideogiocoDao{
	Logger log=LogManager.getLogger(FilmRamDao.class);
	
	Map<Integer, Videogioco> map= MockData.getVideogiochi();//new HashMap<>();
	
	private static VideogiocoRamDao INSTANCE = new VideogiocoRamDao();
	
	private VideogiocoRamDao() {
		
	}
	
	public static VideogiocoRamDao getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void save(Videogioco newVideogioco) {
		if(map.containsValue(newVideogioco)) {
			log.warn("Failed:gioco già presente");
			throw new RuntimeException("noleggio già presente");
		}
		map.put(newVideogioco.getId(), newVideogioco);
		log.info("Videogioco "+newVideogioco+" aggiunto");
	}

	@Override
	public boolean delete(Videogioco videogioco) {
		if(!map.containsValue(videogioco)) {
			log.warn("Failed:gioco non presente");
			return false;
		}
		map.remove(videogioco.getId(), videogioco);
		log.info("Elemento "+ videogioco+" rimosso");
		return true;
	}

	@Override
	public void update(int id, Videogioco videogioco) {
		if(findById(id).isEmpty()) {//key not present
			log.warn("Failed:Key non presente");
			throw new RuntimeException("impossibile aggiornare un elemento non esistente");
		}
		map.replace(id, map.get(id), videogioco);
		log.info("Videogioco con id "+id+" updated con "+videogioco);
	}

	@Override
	public boolean deleteById(int id) {
		if(findById(id).isEmpty()) {//key not present
			log.warn("Failed:Key non presente");
			return false;
		}
		map.remove(id);
		log.info("Elemento con id "+id+" rimosso dal dao");
		return true;
	}
	
	@Override
	public Optional<Videogioco> findById(int id) {
		return Optional.of(map.get(id));
	}

	@Override
	public List<Videogioco> findAll() {
		return (List<Videogioco>) map.values();
	}

	
	
}
