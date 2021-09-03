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
public class Shark extends Fish implements ISwim {
    
    public Shark(String name, boolean isSaltWater) {
        this.name = name;
        this.isSaltWater = isSaltWater;
    }

    @Override
    public void swim() {
        System.out.println("The shark is swimming.");
    }

    @Override
    public void makeSound() {
        System.out.println("*Low Rumble");
    }

    @Override
    public String toString() {
        return "Shark{" + "name=" + name + ", isSaltWater=" + isSaltWater + '}';
    }
    
}
