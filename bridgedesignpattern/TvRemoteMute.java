public class TvRemoteMute extends RemoteButton {

    public TvRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);

    }

    @Override
    public void buttonNinePressed() {

        System.out.println("Tv was muted");
        
    }







}