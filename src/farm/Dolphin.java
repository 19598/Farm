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
public class Dolphin extends Mammal implements ISwim {
    
    public Dolphin(String name, int bodyTemp) {
        this.name = name;
        this.bodyTemp = bodyTemp;
    }

    @Override
    public void makeSound() {
        System.out.println("Blub Blub");
    }

    @Override
    public void swim() {
        System.out.println("The dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Dolphin{" + "name=" + name + ", bodyTemp=" + bodyTemp + '}';
    }
    
}
