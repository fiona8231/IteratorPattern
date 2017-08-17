import java.util.Arrays;
import java.util.Iterator;

//80s using array
public class SongsOf80s implements RadioStationIterator {

    SongInfo[] bestSongs;
    int arrayValue = 0;

    public SongsOf80s(){


       bestSongs = new SongInfo[3];


        addSong("Roam", "B 52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);

    }

    public void addSong(String songName, String bandName, int releaseYear){

        SongInfo songInfo = new SongInfo(songName,  bandName,  releaseYear);

        bestSongs[arrayValue] = songInfo;
        arrayValue++;

    }

   /* public SongInfo[] getBestSongs(){
        return bestSongs;
    }*/

    @Override
    public Iterator createIterator() {
         return Arrays.asList(bestSongs).iterator();
    }
}
