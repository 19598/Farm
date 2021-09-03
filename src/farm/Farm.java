/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farm;

import java.util.*;

/**
 *
 * @author bdegryse
 */
public class Farm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create instances of all types of animals and calls their toString method
        //the names are random and the variable names are the initial of the animal in front of the animals name
        Ostrich OsLarry = new Ostrich("Larry", 55);
        System.out.println(OsLarry.toString());
        Penguin PGeorge = new Penguin("George", 23);
        System.out.println(PGeorge.toString());
        Eagle ELydia = new Eagle("Lydia", 40);
        System.out.println(ELydia.toString());
        Dolphin DStephanie = new Dolphin("Stephanie", 86);
        System.out.println(DStephanie.toString());
        Lion LDave = new Lion("Dave", 87);
        System.out.println(LDave.toString());
        Bat BAlex = new Bat("Alex", 89);
        System.out.println(BAlex.toString());
        Shark SSteve = new Shark("Steve", true);
        System.out.println(SSteve.toString());
        Bass BaOwen = new Bass("Owen", false);
        System.out.println(BaOwen.toString());
        FlyingFish FfJulie = new FlyingFish("Julie", true);
        System.out.println(FfJulie.toString());
        
        //creates the lists
        List<Animal> Animals = new ArrayList<>();
        List<Bird> Birds = new ArrayList<>();
        List<Mammal> Mammals = new ArrayList<>();
        List<Fish> Fishes = new ArrayList<>();
        List<IFly> Flyers = new ArrayList<>();
        List<IWalk> Walkers = new ArrayList<>();
        List<ISwim> Swimmers = new ArrayList<>();
        List<IMakeSound> SoundMakers = new ArrayList<>();
        
        //Puts all the animals into their respective lists
        Birds.add(PGeorge);
        Birds.add(ELydia);
        Birds.add(OsLarry);
        Mammals.add(DStephanie);
        Mammals.add(LDave);
        Mammals.add(BAlex);
        Fishes.add(SSteve);
        Fishes.add(BaOwen);
        Fishes.add(FfJulie);
        Animals.addAll(Birds);
        Animals.addAll(Mammals);
        Animals.addAll(Fishes);
        SoundMakers.addAll(Animals);
        Flyers.add(ELydia);
        Flyers.add(BAlex);
        Flyers.add(FfJulie);
        Walkers.add(OsLarry);
        Walkers.add(PGeorge);
        Walkers.add(LDave);
        Swimmers.add(PGeorge);
        Swimmers.add(DStephanie);
        Swimmers.add(SSteve);
        Swimmers.add(BaOwen);
        Swimmers.add(FfJulie);
        
        //calls toString of all animals
        System.out.println("\nAnimals: ");
        for (int i = 0; i < Animals.size(); i++) {
            System.out.println(Animals.get(i).toString() + "\n");
        }
        
        //calls toString of all birds
        System.out.println("\nBirds:");
        for (int i = 0; i < Birds.size(); i++) {
            System.out.println(Animals.get(i).toString() + "\n");
        }
        
        //calls toString of all mammals
        System.out.println("\nMammals:");
        for (int i = 0; i < Mammals.size(); i++) {
            System.out.println(Mammals.get(i).toString() + "\n");
        }
        
        //calls toString of all fish
        System.out.println("\nFishes:");
        for (int i = 0; i < Fishes.size(); i++) {
            System.out.println(Fishes.get(i).toString() + "\n");
        }
        
        //calls toString of all flyers and calls their fly method
        System.out.println("\nFlyers:");
        for (int i = 0; i < Flyers.size(); i++) {
            Flyers.get(i).fly();
            System.out.println(Flyers.get(i).toString() + "\n");
        }
        
        //calls toString of all walkers and calls their walk method
        System.out.println("\nWalkers:");
        for (int i = 0; i < Walkers.size(); i++) {
            Walkers.get(i).walk();
            System.out.println(Walkers.get(i).toString() + "\n");
        }
        
        //calls toString of all swimmers and calls their swim method
        System.out.println("\nSwimmers:");
        for (int i = 0; i < Swimmers.size(); i++) {
            Swimmers.get(i).swim();
            System.out.println(Swimmers.get(i).toString() + "\n");
        }
        
        //calls toString of all soundmakers and calls their makeSound method
        System.out.println("\nSoundMakers:");
        for (int i = 0; i < SoundMakers.size(); i++) {
            SoundMakers.get(i).makeSound();
            System.out.println(SoundMakers.get(i).toString() + "\n");
        }
    }
    
}
