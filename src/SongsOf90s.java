import java.util.Hashtable;
import java.util.Iterator;

//90s using hashTable
public class SongsOf90s implements RadioStationIterator{

    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<>();
    int hashKey =0;

    public SongsOf90s(){

        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);

    }

     public void addSong(String songName, String bandName, int releaseYear){

        SongInfo songInfo = new SongInfo(songName,  bandName,  releaseYear);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
     }

     /*public Hashtable<Integer, SongInfo> getBestSongs(){
         return bestSongs;
     }*/

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
