package Restaurant.Management_system.Service;

import Restaurant.Management_system.Model.Dish;
import Restaurant.Management_system.Model.Order;

import java.util.List;

public class WaiterService {
    public Order takeOrder(String waiterName, Integer tableId, List<Dish> dishList){
        return new Order(tableId,waiterName,dishList);
    }

}
