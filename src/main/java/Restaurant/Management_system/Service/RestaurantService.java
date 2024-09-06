package Restaurant.Management_system.Service;

import Restaurant.Management_system.Controller.RestaurantController;
import Restaurant.Management_system.Model.*;
import Restaurant.Management_system.Model.Enums.ChefLevel;
import Restaurant.Management_system.Model.Enums.Cuisiens;
import Restaurant.Management_system.Model.Enums.DishType;
import Restaurant.Management_system.Model.Enums.WaiterLevel;

import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    public Restaurant restaurantCreation(){
        List<Cuisiens> cuisiensList = List.of(Cuisiens.CHINESE,Cuisiens.INDIAN,Cuisiens.ITALIAN,Cuisiens.CONTINENTAL,Cuisiens.FRENCH,Cuisiens.JAPANESES);

        Waiter waiter = Waiter.getBuilder().setWaiterName("Ramu").setWaiterEmail("ramu@gmail.com")
                .setWaiterLevel(WaiterLevel.JUNIOR).setWaiterPhoneNumber("9949925353").build();
        Waiter waiter2 = Waiter.getBuilder().setWaiterName("Ravi").setWaiterEmail("Ravi@gmail.com")
                .setWaiterLevel(WaiterLevel.MANAGER).setWaiterPhoneNumber("9749925553").build();
        Waiter waiter3 = Waiter.getBuilder().setWaiterName("Mahesh").setWaiterEmail("Mahesh@gmail.com")
                .setWaiterLevel(WaiterLevel.SENIOR).setWaiterPhoneNumber("9849924353").build();

        List<Waiter> waiterList = new ArrayList<>();
        waiterList.add(waiter);
        waiterList.add(waiter2);
        waiterList.add(waiter3);

        List<Chef> chefList = new ArrayList<>();
        Chef chef = Chef.getBuilder().setChefName("Sai").setChefEmail("sai@gmail.com").setChefPhoneNumber("9959926533").setChefLevel(ChefLevel.HEAD_CHEF).build();
        Chef chef2 = Chef.getBuilder().setChefName("Manikanta").setChefEmail("Manikanta@gmail.com").setChefPhoneNumber("9954326533").setChefLevel(ChefLevel.COMMIS_CHEF).build();
        Chef chef3 = Chef.getBuilder().setChefName("Praveen").setChefEmail("praveen@gmail.com").setChefPhoneNumber("9459926533").setChefLevel(ChefLevel.EXECUTIVE_CHEF).build();
        chefList.add(chef);
        chefList.add(chef2);
        chefList.add(chef3);

        List<Menu> menuList = new ArrayList<>();
        List<Dish> dishList = new ArrayList<>();
        Recipe recipe = new Recipe();
        Dish dish1 = new Dish("chicken Biryani","Hyderbadhi style",200.0, DishType.NON_VEG,recipe);
        Dish dish2 = new Dish("Mutton Biryani","Hyderbadhi style",400.0, DishType.NON_VEG,recipe);
        Dish dish3 = new Dish("veg Biryani","Andhra style",200.0, DishType.VEG,recipe);
        dishList.add(dish1);
        dishList.add(dish2);
        dishList.add(dish3);

        Section section1 = new Section("Biryani",dishList);
        List<Section> sectionList = new ArrayList<>();
        sectionList.add(section1);
        Menu menu1 = new Menu(Cuisiens.INDIAN,sectionList);
        menuList.add(menu1);

        return new Restaurant("Sai's restaurant","Kadapa,Andhra Pradesh",cuisiensList,menuList,waiterList,chefList
        );
    }
}
