package Restaurant.Management_system.Model;

import lombok.Getter;

@Getter

public class Ingredient extends Base{
    String ingredientName;
    public Ingredient(String name){
        ingredientName = name;
    }
}
