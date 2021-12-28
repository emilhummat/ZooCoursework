import animal.Animal;

import java.util.ArrayList;

public class Enclosure extends Animal {

    ArrayList<Animal> listOfAnimals = new ArrayList<>();
    FoodStore enclosureFoodStore=new FoodStore();
    int waste;

    public Enclosure(int age, char gender, String[] eats, int health, int lifeExpectancy) {
        super(age, gender, eats, health, lifeExpectancy);
    }

    public void addAnimal(Animal animal) {
        if (listOfAnimals.size() < 20) {
            listOfAnimals.add(animal);
        }
    }

    public void removeAnimal(Animal animal) {
        listOfAnimals.remove(animal);
    }

    public void removeWaste(int cleanedWaste) {
        waste -= cleanedWaste;
    }

    public void addWaste(int addedWaste) {
        waste += addedWaste;
    }

    public int getWasteSize() {
        return waste;
    }

    public FoodStore getFoodStore(){
        return enclosureFoodStore;
    }

    public int size(){
        return listOfAnimals.size();
    }

    public boolean aMonthPasses(){
        return true;
    }


}
