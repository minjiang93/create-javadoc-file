import java.util.ArrayList;
import java.util.List;
/**
 * Jukebox is a class to play songs
 * <pre>
 *   Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", 
 *				"Thani Oruvan", "Cricket.mp3", "Mp3", 214);   
 *   tempSongList.add(song1);
 *   Jukebox j= new Jukebox(tempDB, -123);
 *   j.isValidCreditCard()
 *   j.play();
 *   j.play(2);
 * </pre>
 * @author Ming Jiang (jmdouby@gmail.com)
 * @version 0.1 3 February 2019
 */
public class Jukebox {
/**
 * db is songlist's data
 */
	Database db;
/**
 * creditCard is creditCard's number
 */
	int creditCard;
	public Jukebox(){
		
	}
	public Jukebox(Database db, int creditCard) {
		super();
		this.db = db;
		this.creditCard = creditCard;
	}
/**
 * @return data from database
 */	
	public Database getDb() {
		return db;
	}
/**
 * @param db is variable setted new data to database
 */
	public void setDb(Database db) {
		this.db = db;
	}
/**
 * @return CreditCard number
 */
	public int getCreditCard() {
		return creditCard;
	}
/**
 * @param creditCard is variable setted to input CreditCard number
 */
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}
/**
 * To determine does creditCard is valid or not
 * @return    true or false
 */
	public boolean isValidCreditCard(){
		if(creditCard>0)
			return true;
		else
			return false;
	}
/**
 * @param i is variable which setted as song's index in songlist
 * play songs by index number in the songlist
 */
	void play(int i) {
		   Song song=db.getSongList(i);
		   song.play();
	}
/**
 * play songlist's songs
 */
	void play() {
	   for (int index=0;index<db.getSongList().size();index++)
	   {
	      Song song=db.getSongList(index);
	      trace("Currently Playing :"+song.getName());
	      song.play();
	      
	   }
	}
	private void trace(String s){
		System.out.println(s);
	}
	

 /**
  * Add new songs to database
  * Check CreditCarc validation
  * Remove songs from database
  */
	//Driver
	public static void main(String[] args){
		Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", 
				"Thani Oruvan", "Cricket.mp3", "Mp3", 214);
		Song song2=new Song("Kannala Kannala", "Kaushik Krish", 
				"Thani Oruvan", "Kannala.mp3", "Mp3", 215);
		Song song3=new Song("Kadhal Cricket", "Kharesma Ravichandran",
				"Thani Oruvan", "D://Cricket.mp3", "Mp3", 214);
		List<Song> tempSongList= new ArrayList<Song>();
		tempSongList.add(song1);
		tempSongList.add(song2);
		tempSongList.add(song3);
		
		Database tempDB= new Database(tempSongList);
		Jukebox j= new Jukebox(tempDB, -123);
		
		//Validation of Credit Card
		System.out.println("Validity of CC : "+j.isValidCreditCard());
		j.getDb().toString();

		System.out.println("\nDeleting Song @ index 2");
		//Deleting Song @ index 2
		j.getDb().removeSong(2);
		j.getDb().toString();
		
		System.out.println("Playing the SongList");
		j.play();
		
		System.out.println("Playing Song @ index 2");
		j.play(2);
		
	}	
}
