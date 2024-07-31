package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Enums.DishType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dish {
    private String dishName;
    private String description;
    private long price;
    private DishType dishType;
    private Recipe recipe;
 }
