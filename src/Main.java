import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class Main {

    SongsOf70s songs70s = new SongsOf70s();
    SongsOf80s songs80s = new SongsOf80s();
    SongsOf90s songs90s = new SongsOf90s();

    RadioStationIterator iter70songs = new SongsOf70s();
    RadioStationIterator iter80songs = new SongsOf80s();
    RadioStationIterator iter90songs = new SongsOf90s();




    //the way we are not using Iterator
    //using arraylist
    /* public void showTheSongs(){

        ArrayList al70songs = songs70s.getBestSongs();
        System.out.println("Songs of the 70s\n");

        for (int i = 0; i < al70songs.size(); i++) {
            SongInfo bestSongs = (SongInfo) al70songs.get(i);

            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearRlease());
        }


        //using array

        SongInfo[] ar80songs =  songs80s.getBestSongs();
        System.out.println("Songs of the 80s\n");

        for(int i =0; i< ar80songs.length; i++){
            SongInfo bestSongs = ar80songs[i];
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearRlease());

        }

        Hashtable<Integer, SongInfo> hs90songs = songs90s.getBestSongs();
        System.out.println("Songs of the 90s\n");

        for(Enumeration<Integer> e = hs90songs.keys(); e.hasMoreElements();){

            SongInfo bestSongs = hs90songs.get(e.nextElement() );


            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearRlease());

        }

    } */

   public void showTheSongs2(){
       Iterator songs70s = iter70songs.createIterator();
       Iterator songs80s = iter80songs.createIterator();
       Iterator songs90s = iter90songs.createIterator();

       System.out.println("Songs of 70s\n");
       printTheIteratorStack(songs70s);
       printTheIteratorStack(songs80s);
       printTheIteratorStack(songs90s);

   }

   public void printTheIteratorStack(Iterator iterator){

       while (iterator.hasNext()){

           SongInfo songInfo = (SongInfo) iterator.next();

           System.out.println(songInfo.getSongName());
           System.out.println(songInfo.getBandName());
           System.out.println(songInfo.getYearRlease());

       }

   }


    }

