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
public abstract class Mammal extends Animal {
    protected double bodyTemp;//protected so that the subclasses can access it

    public double getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(double bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    @Override
    public String toString() {
        return "Mammal{" + "name=" + name + ", bodyTemp=" + bodyTemp + '}';
    }
    
}
