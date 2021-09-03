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
public abstract class Fish extends Animal {
    protected boolean isSaltWater;//protected so that the subclasses can access it

    public boolean isIsSaltWater() {
        return isSaltWater;
    }

    public void setIsSaltWater(boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }

    @Override
    public String toString() {
        return "Fish{" + "name=" + name + ", isSaltWater=" + isSaltWater + '}';
    }
    
}
