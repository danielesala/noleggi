package it.eforhum.noleggi.util;

import java.time.LocalDate;

import it.eforhum.noleggi.entity.*;

public class MockData {
	static {
		Film film1 = new Film();
		film1.setCodice("xx-20");
		film1.setTitolo("cars");
		film1.setDataInizio(LocalDate.of(2020, 01, 15));
		film1.setDataFine(LocalDate.of(2020, 01, 25));
		film1.setGenere(Genere.FAMIGLIA);
		
		Film film2 = new Film();
		film2.setCodice("xx-21");
		film2.setTitolo("Toy Story");
		film2.setDataInizio(LocalDate.of(2021, 3, 5));
		film2.setDataFine(LocalDate.of(2021, 3, 15));
		film2.setGenere(Genere.ANIMAZIONE);

		Film film3 = new Film();
		film3.setCodice("xx-22");
		film3.setTitolo("Avengers: Endgame");
		film3.setDataInizio(LocalDate.of(2021, 4, 10));
		film3.setDataFine(LocalDate.of(2021, 4, 20));
		film3.setGenere(Genere.AZIONE);

		Film film4 = new Film();
		film4.setCodice("xx-23");
		film4.setTitolo("Il grande Lebowski");
		film4.setDataInizio(LocalDate.of(2021, 5, 1));
		film4.setDataFine(LocalDate.of(2021, 5, 10));
		film4.setGenere(Genere.COMMEDIA);

		Film film5 = new Film();
		film5.setCodice("xx-24");
		film5.setTitolo("La vita è bella");
		film5.setDataInizio(LocalDate.of(2021, 6, 15));
		film5.setDataFine(LocalDate.of(2021, 6, 25));
		film5.setGenere(Genere.DRAMMATICO);

		Film film6 = new Film();
		film6.setCodice("xx-25");
		film6.setTitolo("Paddington");
		film6.setDataInizio(LocalDate.of(2021, 7, 20));
		film6.setDataFine(LocalDate.of(2021, 7, 30));
		film6.setGenere(Genere.FAMIGLIA);

		Film film7 = new Film();
		film7.setCodice("xx-26");
		film7.setTitolo("Spider-Man: Into the Spider-Verse");
		film7.setDataInizio(LocalDate.of(2021, 8, 5));
		film7.setDataFine(LocalDate.of(2021, 8, 15));
		film7.setGenere(Genere.ANIMAZIONE);

		Film film8 = new Film();
		film8.setCodice("xx-27");
		film8.setTitolo("Mad Max: Fury Road");
		film8.setDataInizio(LocalDate.of(2021, 9, 10));
		film8.setDataFine(LocalDate.of(2021, 9, 20));
		film8.setGenere(Genere.AZIONE);

		Film film9 = new Film();
		film9.setCodice("xx-28");
		film9.setTitolo("Little Miss Sunshine");
		film9.setDataInizio(LocalDate.of(2021, 10, 1));
		film9.setDataFine(LocalDate.of(2021, 10, 10));
		film9.setGenere(Genere.COMMEDIA);

		Film film10 = new Film();
		film10.setCodice("xx-29");
		film10.setTitolo("The Shawshank Redemption");
		film10.setDataInizio(LocalDate.of(2021, 11, 15));
		film10.setDataFine(LocalDate.of(2021, 11, 25));
		film10.setGenere(Genere.DRAMMATICO);

		Film film11 = new Film();
		film11.setCodice("xx-30");
		film11.setTitolo("Finding Nemo");
		film11.setDataInizio(LocalDate.of(2021, 12, 5));
		film11.setDataFine(LocalDate.of(2021, 12, 15));
		film11.setGenere(Genere.FAMIGLIA);

		Videogioco videogioco1 = new Videogioco("xy-45", "minecraft", 
				LocalDate.of(2015, 4, 9), LocalDate.of(2016, 5,22));
		videogioco1.setConsole(Console.PS4);
		
		Videogioco videogioco2 = new Videogioco("xy-46", "The Witcher 3", 
                LocalDate.of(2015, 5, 19), LocalDate.of(2016, 6, 25));
		videogioco2.setConsole(Console.PC);
		
		Videogioco videogioco3 = new Videogioco("xy-47", "God of War", 
		                LocalDate.of(2018, 4, 20), LocalDate.of(2019, 5, 15));
		videogioco3.setConsole(Console.PS4);
		
		Videogioco videogioco4 = new Videogioco("xy-48", "Demon's Souls", 
		                LocalDate.of(2020, 11, 12), LocalDate.of(2021, 1, 10));
		videogioco4.setConsole(Console.PS5);
		
		Videogioco videogioco5 = new Videogioco("xy-49", "Halo Infinite", 
		                LocalDate.of(2021, 12, 8), LocalDate.of(2022, 3, 30));
		videogioco5.setConsole(Console.XBOX_ONE_X);
		
		Videogioco videogioco6 = new Videogioco("xy-50", "Cyberpunk 2077", 
		                LocalDate.of(2020, 12, 10), LocalDate.of(2021, 2, 15));
		videogioco6.setConsole(Console.PC);
		
		Videogioco videogioco7 = new Videogioco("xy-51", "Spider-Man: Miles Morales", 
		                LocalDate.of(2020, 11, 12), LocalDate.of(2021, 1, 5));
		videogioco7.setConsole(Console.PS5);
		
		Videogioco videogioco8 = new Videogioco("xy-52", "Forza Horizon 4", 
		                LocalDate.of(2018, 10, 2), LocalDate.of(2019, 11, 20));
		videogioco8.setConsole(Console.XBOX_ONE_S);
		
		Videogioco videogioco9 = new Videogioco("xy-53", "Stardew Valley", 
		                LocalDate.of(2016, 2, 26), LocalDate.of(2017, 6, 30));
		videogioco9.setConsole(Console.PC);
		
		Videogioco videogioco10 = new Videogioco("xy-54", "Final Fantasy VII Remake", 
		                LocalDate.of(2020, 4, 10), LocalDate.of(2021, 3, 31));
		videogioco10.setConsole(Console.PS4);	
	}
	
	public static void getFilms() {
		
	}
	
	public static void getVideogiochi() {
		
	}
}
