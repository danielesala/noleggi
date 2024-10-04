package it.eforhum.noleggi.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import it.eforhum.noleggi.entity.Videogioco;

public class VideogiocoRamDao implements VideogiocoDao{
	Map<Integer, Videogioco> map=new HashMap<>();
	
	@Override
	public boolean save(Videogioco newVideogioco) {
		if(map.containsValue(newVideogioco)) {
			return false;//gioco già presente
		}
		map.put(newVideogioco.getId(), newVideogioco);
		return true;
	}

	@Override
	public boolean delete(Videogioco videogioco) {
		if(!map.containsValue(videogioco)) {
			return false;//videogioco non presente
		}
		map.remove(videogioco.getId(), videogioco);
		return true;
	}

	@Override
	public boolean update(int id, Videogioco videogioco) {
		if(findById(id).isEmpty()) {//key not present
			return false;
		}
		map.replace(id, map.get(id), videogioco);
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		if(findById(id).isEmpty()) {//key not present
			return false;
		}
		map.remove(id);
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
