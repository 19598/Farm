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
public abstract class Bird extends Animal {
    protected double wingspan;//protected so that the subclasses can access it

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "Bird{" + "name=" + name + ", wingspan=" + wingspan + '}';
    }
    
}
