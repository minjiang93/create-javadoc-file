import java.io.File;
import java.io.FileInputStream;

//import javax.media.*;

import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javazoom.jl.player.Player;

/**
 * Song is a class includes songs' information 
 * <pre>
 *   Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
 *   song1.isLong();
 *   song1.display();
 * </pre>
 * @author Ming Jiang (jmdouby@gmail.com)
 * @version 0.1 3 February 2019
 */

public class Song {
/**
 * name is the song's name
 */
	String name;
/**
 * artist is the song's artist
 */
	String artist;
/**
 * album is the song's album
 */
	String album;
/**
 * url is the song's link address
 */
	String url;
/**
 * format is the song's format
 */
	String format;
	// Duration of Song in seconds
/**
 * duration is the song's length
 */
	int duration;
	public Song(){
		
	}
	public Song(String name, String artist, String album, String url,
			String format, int duration) {
		super();
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.url = url;
		this.format = format;
		this.duration = duration;
	}
/**
 * @return  song's Name
 */
	public String getName() {
		return name;
	}
/**
 * @param name is the variable set as song's name
 */
	public void setName(String name) {
		this.name = name;
	}
/**
 * @return song's Artist
 */
	public String getArtist() {
		return artist;
	}
/**
 * @param artist is variable setted as song's Artist
 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
/**
 * @return song's  Album
 */
	public String getAlbum() {
		return album;
	}
/**
 * @param  album is variable setted as song's album
 */
	public void setAlbum(String album) {
		this.album = album;
	}
/**
 * @return song's  link
 */
	public String getUrl() {
		return url;
	}
/**
 * @param url is variable setted as song's link
 */
	public void setUrl(String url) {
		this.url = url;
	}
/**
 * @return song's  Format
 */
	public String getFormat() {
		return format;
	}
/**
 * @param format is variable setted as song's Format
 */
	public void setFormat(String format) {
		this.format = format;
	}
/**
 * @return song's  length
 */
	public int getDuration() {
		return duration;
	}
/**
 * @param duration is variable setted as song's length
 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
/**
 * To determine does the song is long or not
 * @return    ture or false
 */
	public boolean isLong() {
		return duration>50;
	}
	@Override
	public String toString() {
	   return "Name: " + this.getName() + "\t" +
	          "Artist:" + this.getArtist() + "\t" + 
	          "Album:" + this.getAlbum() + "\t" +
	          "Format:" + this.getFormat() + "\t" +
	          "Duration:" + this.getDuration();
	}
	
 /**
  * To play selected songs
  *
  * play songs or print error message
  */
	
	public void play(){
		try{
			FileInputStream fis = new FileInputStream(this.getUrl());
			Player playMP3 = new javazoom.jl.player.Player(fis);
			playMP3.play();
		}catch(Exception e){
	    	System.out.println(e);
	    }
	}
		//Driver
		public static void main(String[] args){
			System.out.println("Creating Song Object");
			Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", 
					"Thani Oruvan", "Cricket.mp3", "Mp3", 214);
			System.out.println("Playing Song");
			song1.play();
			
		}	
}
