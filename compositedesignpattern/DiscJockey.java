
public class DiscJockey {

    private SongComponent songList;

    public DiscJockey(SongComponent newSongList){

        songList = newSongList;

    }

    public void getSongList(){

        songList.displaySongInfo();

    }





}