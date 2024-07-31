package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Ingredient;

public class SolidIngredient extends Ingredient {
    private Gram quantity;
    public SolidIngredient(String name,Gram quantity){
        super(name);
        this.quantity = quantity;
    }
}
