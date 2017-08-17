
public class SongInfo {
    String songName;
    String bandName;
    int YearRlease;


    public SongInfo(String newSongName, String newBandName , int newYearRlease){
        this.songName = newSongName;
        this.bandName = newBandName;
        this.YearRlease = newYearRlease;
    }

    public String getSongName(){
        return songName;
    }
    public String getBandName(){
        return bandName;
    }

    public int getYearRlease(){
        return  YearRlease;
    }
}
