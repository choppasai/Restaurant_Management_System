package Restaurant.Management_system.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Order {
    private String customerName;
    private String waiterName;
    private List<Dish> dishes;
}
