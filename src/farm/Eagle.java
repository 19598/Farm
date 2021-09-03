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
public class Eagle extends Bird implements IFly {

    public Eagle(String name, int wingspan) {
        this.name = name;
        this.wingspan = wingspan;
    }

    @Override
    public void makeSound() {
        System.out.println("Caw");
    }

    @Override
    public void fly() {
        System.out.println("The eagle is flying.");
    }

    @Override
    public String toString() {
        return "Eagle{" + "name=" + name + ", wingspan=" + wingspan + '}';
    }
    
}
