package com.javaex.oop;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public Song(String artist, String title , String album, int year ,
			String track, String composer) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
		
		
		
		public String getTitle() {
			return title;
					
		}
		 public void setTitle(String title) {
		    	this.title = title;
		 }
		 public String getArtist() {
		    	return artist;
		    	
		    }
		    public void setArtist(String artist) {
		    	this.artist = artist;
		    	
		    }
		    public String getAlbum() {
		    	return album;
		    	
		    }
		    public void setAlbum(String album) {
		    	this.album = album;
		    	
		    }
		    public String getComposer() {
		    	return composer;
		    	
		    }
		    public void setComposer(String composer) {
		    	this.composer = composer;
		    	
		    }
		    public int getYear() {
		    	return year;
		    	
		    }
		    public void setYear(int year) {
		    	this.year = year;
		    	
		    }	
		    public String getTrack() {
		    	return track;
		    	
		    }
		    public void setTrack(String track) {
		    	this.track = track;
		    	
		    }
		    public void showInfo() {
		    	System.out.print(artist + ", ");
		    	System.out.print(title + " (");
		    	System.out.print(album + ", ");
		    	System.out.print(year + ", ");
		    	System.out.print(track + ", ");
		    	System.out.print(composer + " 작곡)");
		    	
		    }
		    
}

	
	
	
	


	


