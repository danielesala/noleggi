package it.eforhum.noleggi.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.eforhum.noleggi.entity.Videogioco;

public class VideogiocoRamDao implements VideogiocoDao{
	Map<Long, Videogioco> map=new HashMap<>();
	
	@Override
	public boolean save(Videogioco newVideogioco) {
		map.containsValue(newVideogioco);
		
		return true;
		
	}

	@Override
	public boolean delete(Videogioco videogioco) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(long id, Videogioco videogioco) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
