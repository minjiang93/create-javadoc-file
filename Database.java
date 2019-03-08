import java.util.ArrayList;
import java.util.List;

/**
 * Database is a class to store song list
 * <pre>
 * List<Song> tempSongList= new ArrayList<Song>();
 * tempSongList.add(song2);
 * Database tempDB= new Database(tempSongList);
 *   tempDB.addSong(song3);
 *   tempDB.play();
 * </pre>
 * @author Ming Jiang (jmdouby@gmail.com)
 * @version 0.1 3 February 2019
 */
public class Database {
/**
 * songList shows all selected in the list
 */
private List<Song> songList;
	
	Database(){
		this.songList=new ArrayList<Song>();
	}
	Database(List<Song> songList){
		this.songList=songList;
	}
/**
 * @return song from songlist
 */
	public List<Song> getSongList() {
		return songList;
	}
/**
 * @param index is number for song sequence in songlist
 * @return song from songlist via searching by song's index 
 */
	public Song getSongList(int index) {
		if(songList.size()>=index)
			return songList.get(index);
		else
			return null;
	}
/**
 * songlist is variable add song to songlist
 */
	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}
/**
 * To determine does songlist is empty or not
 * @return ture or false
 */
	public boolean isEmpty(){
		return this.songList.isEmpty();
	}
/**
 * @param song is variable setetd to add new song
 */
	public void addSong(Song song){
		songList.add(song);
	}
/**
 * @param song is existing data which can be remove via input song's infomation
 */
	public void removeSong(Song song){
		if(songList.contains(song)){
			songList.remove(song);
		}
	}
/**
 * @param index is setted as song's number which in songlist
 * remove song via song's index in the songlist
 */
	public void removeSong(int index){
			songList.remove(index);
	}
	private void trace(String s){
		System.out.println(s);
	}
	public String toString(){	
		System.out.println("Song List:\n================");
		for(int i=0;i<songList.size();i++){
			trace(i+":\t"+songList.get(i).toString());
		}
		return "";
	}
/**
 * @param index is setted as song's number which in songlist
 * To play song via song's index in the songlist
 * print song's information and play song
 */
	public void play(int index){
		System.out.println("Playing Song : "+ songList.get(index).toString());
		songList.get(index).play();
	}
/**
 * To play all songs in the songlist
 */
	public void play(){
		for(int index=0;index<songList.size();index++)
			play(index);
	}
		//Driver
		public static void main(String[] args){
			Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", 
					"Thani Oruvan", "Cricket.mp3", "Mp3", 214);
			Song song2=new Song("Kannala Kannala", "Kaushik Krish", 
					"Thani Oruvan", "Kannala.mp3", "Mp3", 215);
			Song song3=new Song("Kadhal Cricket", "Kharesma Ravichandran",
					"Thani Oruvan", "D://Cricket.mp3", "Mp3", 214);
			List<Song> tempSongList= new ArrayList<Song>();
			tempSongList.add(song2);
			tempSongList.add(song1);
			
			Database tempDB= new Database(tempSongList);
			tempDB.toString();
			System.out.println("\nAdding Song ");
			tempDB.addSong(song3);
			tempDB.toString();
			System.out.println("Playing Complete SongList");
			tempDB.play();
			
			System.out.println("Playing Song @ index 2");
			tempDB.play(2);
			
		}	
	
}
