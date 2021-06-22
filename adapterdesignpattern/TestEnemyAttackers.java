public class TestEnemyAttackers
{
    public static void main(String[] args) {
        
        EnemyTank rx7Tank=new EnemyTank();

        EnemyRobot fredTheRobot= new EnemyRobot();

        EnemyAttacker robotAdapter=new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");
        
        fredTheRobot.reachToHuman("Paul");
        fredTheRobot.walksForward();
        fredTheRobot.smashWithHands();

        System.out.println("The Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}