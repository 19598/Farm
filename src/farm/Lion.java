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
public class Lion extends Mammal implements IWalk {
    
    public Lion(String name, int bodyTemp) {
        this.name = name;
        this.bodyTemp = bodyTemp;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void walk() {
        System.out.println("The lion is walking.");
    }

    @Override
    public String toString() {
        return "Lion{" + "name=" + name + ", bodyTemp=" + bodyTemp + '}';
    }
    
}
