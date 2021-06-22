public class TurnTVUp implements Command {

    ElectronicDevice theDevice;

    public TurnTVUp(ElectronicDevice newDevice){

        theDevice=newDevice;


    }

    @Override
    public void undo() {

        theDevice.volumeDown();
    }

    @Override
    public void execute() {
        
        theDevice.volumeUp();
        
    }

}