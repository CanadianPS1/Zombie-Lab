package zombyLab.controller;

import zombyLab.model.*;
import zombyLab.view.View;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class ZombieGenerator{
    @SuppressWarnings("unchecked")
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        Random rand = new Random();
        String userInput;
        int zombieCount;
        boolean looping= true;
        ArrayList<Zombie> zombies = new ArrayList<>();
        do{
            new View().desplayMainMenu();
            userInput = read.nextLine().toLowerCase();
            if(userInput.equals("1")){
                zombies = zombieMaker(zombies, rand.nextInt(1,4));
            }else if(userInput.equals("2")){
                zombieCount = rand.nextInt(1,11);
                for(int i = 0; i < zombieCount; i++){
                    zombies = zombieMaker(zombies, rand.nextInt(1,4));
                }
            }else if(userInput.equals("3")){
                new View().promptForZombieCount();
                zombieCount = read.nextInt();
                for(int i = 0; i < zombieCount; i++){
                    zombies = zombieMaker(zombies, rand.nextInt(1,4));
                }
            }else if(userInput.equals("4")){
                new View().desplayZombies(zombies);
            }else if(userInput.equals("exit")){
                looping = false;
                System.exit(0);
            }else{
                new View().showErrorMessage();
            }
        }while(looping);


        read.close();

    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static ArrayList zombieMaker(ArrayList zombies, int zombieType){
        if(zombieType == 1){
            Zombie zombie = new Runner();
            zombies.add(zombie);
        }else if(zombieType == 2){
            Zombie zombie = new Tank();
            zombies.add(zombie);
        }else if(zombieType == 3){
            Zombie zombie = new Walker();
            zombies.add(zombie);
        }

        return zombies;
    }
    
}