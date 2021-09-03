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
public class Penguin extends Bird implements IWalk, ISwim {

    public Penguin(String name, int wingspan) {
        this.name = name;
        this.wingspan = wingspan;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Screech");
    }

    @Override
    public void walk() {
        System.out.println("The penguin is walking.");
    }

    @Override
    public void swim() {
        System.out.println("The penguin is swimming.");
    }

    @Override
    public String toString() {
        return "Penguin{" + "name=" + name + ", wingspan=" + wingspan + '}';
    }
    
}
