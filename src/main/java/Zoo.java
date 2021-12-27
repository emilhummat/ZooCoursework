import animal.Animal;

public class Zoo extends Animal {

    @Override
    public boolean aMonthPasses() {
        return false;
    }

    public Zoo(int age, char gender, String[] eats, int health, int lifeExpectancy) {
        super(age, gender, eats, health, lifeExpectancy);
    }

    public static void main(String[] args) {
        String [] food=new String[]{"carrot","cucumber"};
        Zoo zoo=new Zoo(12,'m',food,8,24);
        System.out.println(zoo);
    }

}
