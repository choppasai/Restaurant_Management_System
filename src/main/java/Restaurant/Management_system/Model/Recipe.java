package Restaurant.Management_system.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Recipe {
    private String recipeName;
    private String description;
    private List<Map<Ingredient,Gram>> solidIngredient;
    private List<Map<Ingredient,MilliLiter>> liquidIngredient;
}
