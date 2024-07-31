package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Ingredient;
import Restaurant.Management_system.Model.MilliLiter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LiquidIngredient extends Ingredient {
    private MilliLiter quantity;
    
    public LiquidIngredient(String name, MilliLiter quantity){
        super(name);
        this.quantity = quantity;
    }
}
