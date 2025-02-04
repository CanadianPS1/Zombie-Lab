package zombyLab.view;
import java.util.ArrayList;
public class View {
    public void desplayMainMenu(){
        System.out.println("What would you like to do? \n (1) Spawn one Zombie \n (2) Spawn Some Zombies \n (3) Generate Any Number of Zombies \n (4) Desplay Zombies \n EXIT");
    }
    public void showErrorMessage(){
        System.err.println("ERROR, you entered wrong input, try typing 1, 2, 3, or exit");
    }
    public void promptForZombieCount(){
        System.out.print("How many Zombies would you like to spawn? : ");
    }
    public void desplayZombies(@SuppressWarnings("rawtypes") ArrayList zombies){
        for(int i = 0; i < zombies.size(); i++){
            System.out.println(zombies.get(i).toString());
        }
    }
}
