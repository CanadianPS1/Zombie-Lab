package zombyLab.model;
import java.util.Random;
public class Tank extends Zombie{
    protected int baseHP, speed;
    private int damageModifier;
    private Random rand = new Random();
    public Tank(){
        baseHP = rand.nextInt(45, 71);
        speed = rand.nextInt(4, 9);
        damageModifier = rand.nextInt(10, 21);
    }
    @Override
    public int attack(int attackRole) {
        int damage = role(3, 6);
        if(damage == 20) damage = damage * 3;
        else if(damage >= 10) damage += damageModifier;
        else damage = 0;
        return damage;
    }
    @Override
    public String toString(){
        return  "Zombie Type: Tank \n" +
                "Arms: " + arms + "\n" +
                "Legs: " + legs + "\n" +
                "Base HP: " + baseHP + "\n" +
                "Speed: " + speed + "\n" +
                "Damage Modifier: " + damageModifier; 
    }
}
