package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Enums.DishType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Dish extends Base{
    private String dishName;
    private String description;
    private double price;
    private DishType dishType;
    private Recipe recipe;
    public Dish (String dishName, String description, double price, DishType dishType) {
        this.dishName = dishName;
        this.description = description;
        this.price = price;
        this.dishType = dishType;

    }
 }
