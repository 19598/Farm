/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farm;

/**
 *
 * @author bdegryse
 */
public class FlyingFish extends Fish implements ISwim, IFly {
    
    public FlyingFish(String name, boolean isSaltWater) {
        this.name = name;
        this.isSaltWater = isSaltWater;
    }

    @Override
    public void swim() {
        System.out.println("The flying fish makes swimming noises.");
    }

    @Override
    public void makeSound() {
        System.out.println("The flying fish makes a breaching sound.");
    }

    @Override
    public void fly() {
        System.out.println("The flying fish is flying.");
    }

    @Override
    public String toString() {
        return "Flying Fish{" + "name=" + name + ", isSaltWater=" + isSaltWater + '}';
    }
    
}
