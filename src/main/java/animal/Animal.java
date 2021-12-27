package animal;

import java.util.Arrays;

public abstract class Animal {
    private int age;
    private char gender;
    private String[] eats;
    private int health;
    private int lifeExpectancy;

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public boolean canEat(String food) {
        boolean flag = false;
        for (String eat : eats) {
            if (eat.equals(food)) {
                flag = true;
                break;
            }
            break;
        }
        return flag;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void eat(){}

    public void decreaseHealth(){}

    public void treat(){}

    public abstract boolean aMonthPasses();



    public Animal(int age, char gender, String[] eats, int health, int lifeExpectancy) {
        this.age = age;
        this.gender = gender;
        this.eats = eats;
        this.health = health;
        this.lifeExpectancy = lifeExpectancy;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender=" + gender +
                ", eats=" + Arrays.toString(eats) +
                ", health=" + health +
                ", lifeExpectancy=" + lifeExpectancy +
                '}';
    }
}
