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
public class Ostrich extends Bird implements IWalk {

    public Ostrich(String name, int wingspan) {
        this.name = name;
        this.wingspan = wingspan;
    }
    
    @Override
    public void walk() {
        System.out.println("The ostrich is walking.");
    }

    @Override
    public void makeSound() {
        System.out.println("Sqwack");
    }

    @Override
    public String toString() {
        return "Ostrich{" + "name=" + name + ", wingspan=" + wingspan + '}';
    }
    
}
