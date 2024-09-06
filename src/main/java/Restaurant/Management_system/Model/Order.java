package Restaurant.Management_system.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Order extends Base{
    private Integer tableId;
    private String waiterName;
    private List<Dish> dishes;
}
