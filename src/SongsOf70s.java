import java.util.ArrayList;
import java.util.Iterator;

//using arraylist
public class SongsOf70s implements RadioStationIterator{

    ArrayList<SongInfo> bestSongs;

    public SongsOf70s(){

        bestSongs = new ArrayList<SongInfo>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);

    }

  public void addSong(String songName, String bandName, int releaseYear ){

       SongInfo songInfo = new SongInfo(songName,  bandName,  releaseYear);

       bestSongs.add(songInfo);
  }

  /* public ArrayList<SongInfo>   (){
      return bestSongs;
    }*/

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
