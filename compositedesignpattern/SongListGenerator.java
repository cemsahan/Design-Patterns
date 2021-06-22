public class SongListGenerator {

    public static void main(String[] args) {
        
        SongComponent industrialMusic = new SongGroup("Industrial","asdf");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal","fsdf sdfsd");
        SongComponent dubstepMusic = new SongGroup("Industrial","asdf");

        SongComponent everySong = new SongGroup("Song List" , "Every Song Available");

        everySong.add(industrialMusic);
        
        industrialMusic.add(new Song("Head Like a hole" , "NIN" , 1990));
        industrialMusic.add(new Song("Headhunter" , "Front 242" , 1990));
        
        industrialMusic.add(dubstepMusic);

        dubstepMusic.add(new Song("Centipede","Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris","Doctor P", 2011));

        everySong.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("War Pigs","Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades","Motorhead", 1980));

        DiscJockey crazyLarry = new DiscJockey(everySong);

       //crazyLarry.getSongList();

       heavyMetalMusic.displaySongInfo();

       

    }




}

