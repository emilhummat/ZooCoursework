import java.util.HashMap;

public class FoodStore {
    public HashMap<String, Integer> foodAndQuantity =new HashMap<>();
    public void addFood(String food,int quantity){
        foodAndQuantity.put(food,quantity);
    }
    public void takeFood(String food){
        foodAndQuantity.remove(food);
    }
}
