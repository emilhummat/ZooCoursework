import java.util.HashMap;

public class FoodStore {
    public HashMap<String, Integer>food=new HashMap<>();
    public void addFood(String str,int num){
        food.put(str,num);
    }
    public void takeFood(String str){
        food.remove(str);
    }
}
