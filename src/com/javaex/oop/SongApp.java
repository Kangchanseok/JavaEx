package com.javaex.oop;

public class SongApp {

	public static void main(String[] args) {
		
		Song a = new Song("아이유", "좋은날", "Real", 2010, "3번 track", "이민수 ");
		
		
		a.setArtist("아이유");
		a.setTitle("좋은날");
		a.setAlbum("Real");
		a.setYear(2010);
		a.setTrack("3번 track");
		a.setComposer("이민수");
		
		a.showInfo();
		
	}

}
