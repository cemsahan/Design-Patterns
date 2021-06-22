public class TestTheRemote {


    public static void main(String[] args) {
        
        RemoteButton theTv = new TvRemoteMute(new TvDevice(1,200));

        RemoteButton theTv2 = new TvRemotePause(new TvDevice(1,200));

        System.out.println("Test Tv with mute");

        theTv.buttonFivePressed();
        theTv.buttonSixPressed();
        theTv.buttonNinePressed();

        System.out.println("\n Test TV with Pause");

        theTv2.buttonFivePressed();
        theTv2.buttonSixPressed(); 
        theTv2.buttonSixPressed(); 
        theTv2.buttonSixPressed(); 
        theTv2.buttonSixPressed(); 
        theTv2.buttonSixPressed();
        theTv2.buttonNinePressed();
        theTv2.deviceFeedback(); 
        
        




    }





}