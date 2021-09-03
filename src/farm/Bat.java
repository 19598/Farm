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
public class Bat extends Mammal implements IFly {
    
    public Bat(String name, int bodyTemp) {
        this.name = name;
        this.bodyTemp = bodyTemp;
    }

    @Override
    public void makeSound() {
        System.out.println("The bat makes a noise that you can't hear.");
    }

    @Override
    public void fly() {
        System.out.println("The bat is flying.");
    }

    @Override
    public String toString() {
        return "Bat{" + "name=" + name + ", bodyTemp=" + bodyTemp + '}';
    }
    
}
