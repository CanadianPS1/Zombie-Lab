package zombyLab.model;
import java.util.Random;
public abstract class Zombie {
    protected int baseHP, speed;
    private final Random rand = new Random();
    protected int arms = rand.nextInt(0,3);
    protected int legs = rand.nextInt(0,3);
    public int role(int numDice, int numberOfSides){
        int num = 0;
        for(int i = 0; i < numDice; i++){
            num += rand.nextInt(1,numberOfSides + 1);
        }
        return num;
    }
    public abstract int attack(int attackRole);

    @Override
    public String toString(){
        return  "Zombie Type: Unknown \n" +
                "Arms: Unknown \n" +
                "Legs: Unknown \n" +
                "Base HP: Unknown \n" +
                "Speed: Unknown"; 
    }
}
