package zombyLab.model;
import java.util.Random;
public class Runner extends Zombie{
    protected int baseHP, speed;
    private int climbSpeed;
    private Random rand = new Random();
    public Runner(){
        baseHP = rand.nextInt(10, 23);
        speed = rand.nextInt(15, 26);
        climbSpeed = speed/3;
    }
    @Override
    public int attack(int attackRole) {
        int damage = role(2, 8);
        if(damage == 19 || damage == 20) damage = damage* 2;
        else if(damage < 15) damage = 0;
        return damage;
    }
    @Override
    public String toString(){
        return  "Zombie Type: Runner \n" +
                "Arms: " + arms + "\n" +
                "Legs: " + legs + "\n" +
                "Base HP: " + baseHP + "\n" +
                "Speed: " + speed + "\n" +
                "Climb Speed: " + climbSpeed; 
    }
}
