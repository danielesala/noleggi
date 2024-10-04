package noleggi;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import it.eforhum.noleggi.entity.*;
import it.eforhum.noleggi.service.Service;
import it.eforhum.noleggi.service.ServiceImpl;
import it.eforhum.noleggi.util.MockData;

@TestInstance(Lifecycle.PER_CLASS)
public class TestNoleggio {
	Service service;
	
	
	@BeforeAll
	private void init() {
		service= ServiceImpl.getInstance();
		
	}
	@Test
	public void testFilm() {
		assertDoesNotThrow(()->{
			service.noleggia(new Film());
		});
		assertThrows(RuntimeException.class, ()->{
			service.noleggia(MockData.getFilms().get(1));
		});
		
	}
	@Test
	public void testVideogioco() {
		assertDoesNotThrow(()->{
			service.noleggia(new Videogioco("asdfs","askjkdb",LocalDate.of(2024,12,12),LocalDate.of(2024,12,20)));
		});
		assertThrows(RuntimeException.class, ()->{
			service.noleggia(MockData.getVideogiochi().get(1));
		});
		
	}
	
	
}
