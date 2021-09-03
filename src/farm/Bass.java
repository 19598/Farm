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
public class Bass extends Fish implements ISwim {
    
    public Bass(String name, boolean isSaltWater) {
        this.name = name;
        this.isSaltWater = isSaltWater;
    }

    @Override
    public void swim() {
        System.out.println("The bass is swimming.");
    }

    @Override
    public void makeSound() {
        System.out.println("Splash");
    }

    @Override
    public String toString() {
        return "Bass{" + "name=" + name + ", isSaltWater=" + isSaltWater + '}';
    }
    
}
