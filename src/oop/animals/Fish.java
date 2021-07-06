package oop.animals;

import java.util.Locale;

public class Fish extends MarineAnimal{

    private boolean canSwim;
    private int length;
    private int finCount;
    private boolean isSaltWater;
    private String name;
    private boolean hasScales;

    public Fish(boolean canSwim, int length, int finCount, boolean isSaltWater, String name, boolean hasScales) {

        super(canSwim, length, finCount, isSaltWater, name);
        this.hasScales = hasScales;
    }

    public Fish(String name){
        super(name);
    }


    public boolean getHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

    public String getName(){
        return super.getName().toUpperCase();
    }
}
