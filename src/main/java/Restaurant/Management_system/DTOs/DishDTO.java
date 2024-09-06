package Restaurant.Management_system.DTOs;

import Restaurant.Management_system.Model.Enums.DishType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DishDTO {
    private String dishName;
    private String description;
    private double price;
    private DishType dishType;
}
