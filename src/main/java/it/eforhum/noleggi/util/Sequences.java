package it.eforhum.noleggi.util;

public class Sequences {
	private static int SEQ_FILM = 1;
	private static int SEQ_GIOCO = 1;
	
	public static int getSeqFilm() {
		return SEQ_FILM++;
	}
	public static int getSeqGioco() {
		return SEQ_GIOCO++;
	}
}
