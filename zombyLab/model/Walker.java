package zombyLab.model;
import java.util.Random;
public class Walker extends Zombie{
    protected int baseHP, speed;
    private Random rand = new Random();
    public Walker(){
        baseHP = rand.nextInt(15, 31);
        speed = rand.nextInt(6, 11);
    }
    @Override
    public int attack(int attackRole) {
        int damage = role(3, 6);
        if(damage == 20) damage = damage * 2;
        else if(damage < 8) damage = 0;
        return damage;
    }
    @Override
    public String toString(){
        return  "Zombie Type: Walker \n" +
                "Arms: " + arms + "\n" +
                "Legs: " + legs + "\n" +
                "Base HP: " + baseHP + "\n" +
                "Speed: " + speed + "\n"; 
    }
}