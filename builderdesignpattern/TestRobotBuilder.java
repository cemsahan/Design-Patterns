public class TestRobotBuilder{


    public static void main(String[] args) {

        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Build ");

        System.out.println("Robot Head Type:  " + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type:  " + firstRobot.getRobotTorso());
        System.out.println("Robot Arms Type:  " + firstRobot.getRobotArms());
        System.out.println("Robot Legs Type:  " + firstRobot.getRobotLegs());




    }




}