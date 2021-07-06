package oop.animals;

public class SomethingFishy {
    public static void main(String[] args){
        MarineAnimal marineAnimal = new AquaMammal("Blue Whale");

        ((AquaMammal)marineAnimal).setMaxTimeSubmerged(30);
        System.out.println(((AquaMammal) marineAnimal).getMaxTimeSubmerged());
        System.out.println(marineAnimal.getName());
    }
}
