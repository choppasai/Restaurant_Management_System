package Restaurant.Management_system.Model;

import lombok.Getter;

@Getter

public class Ingredient {
    String ingredientName;
    public Ingredient(String name){
        ingredientName = name;
    }
}
