import java.util.ArrayList;
import java.util.Iterator;


public class SongGroup extends SongComponent {


    ArrayList songComponent = new ArrayList();

    String groupName;
    String groupDescription;

    public SongGroup(String newGroupName,String newGroupDescription) {

        groupName = newGroupName;
        groupDescription = newGroupDescription;



    }

    public String getGroupName() {
        return groupName;
    }

   
    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(SongComponent newSongComponent){

        songComponent.add(newSongComponent);

    }
    
    public void remove(SongComponent newSongComponent){

        songComponent.remove(newSongComponent);

    }

    public SongComponent getComponent(int componentIndex){

        return (SongComponent)songComponent.get(componentIndex);

    }

    public void displaySongInfo(){

        System.out.println(getGroupName()+" "+getGroupDescription()+" \n");

        Iterator songIterator = songComponent.iterator();

        while(songIterator.hasNext()){

            SongComponent songInfo=(SongComponent)songIterator.next();
            songInfo.displaySongInfo();


        }



    }



}
