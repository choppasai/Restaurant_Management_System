package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Enums.Cuisiens;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Restaurant {
    private String restaurantName;
    private String address;
    private Cuisiens cuisiens;
    private List<Menu> menu;
    private List<Waiter> waiters;
    private List<Chef> chefs;
}
