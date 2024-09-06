package Restaurant.Management_system.Controller;

import Restaurant.Management_system.DTOs.DishDTO;
import Restaurant.Management_system.DTOs.OrderDTO;
import Restaurant.Management_system.Model.*;
import Restaurant.Management_system.Model.Enums.Cuisiens;
import Restaurant.Management_system.Service.RestaurantService;
import Restaurant.Management_system.Service.WaiterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {
    private final RestaurantService restaurantService;
    private final  WaiterService waiterService;
    public RestaurantController(RestaurantService restaurantService, WaiterService waiterService){
        this.restaurantService = restaurantService;
        this.waiterService = waiterService;
    }

    public Restaurant createRestaurant(){
        return restaurantService.restaurantCreation();
    }
    public Order giveOrder(OrderDTO orderDTO){
        List<DishDTO> dishes = orderDTO.getDishes();
        List<Dish> dishList = dishes.stream().map(dishDTO -> new Dish(dishDTO.getDishName(),dishDTO.getDescription(),dishDTO.getPrice(),dishDTO.getDishType())).toList();
        return waiterService.takeOrder(orderDTO.getWaiterName(),orderDTO.getTableId(),dishList);
    }

}
