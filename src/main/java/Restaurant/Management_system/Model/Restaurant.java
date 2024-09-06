package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Enums.Cuisiens;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
//@Entity
@NoArgsConstructor
public class Restaurant {

    private String restaurantName;
    private String address;
//    @ElementCollection
//    @Enumerated(EnumType.STRING)
    private List<Cuisiens> cuisiens;

//    @OneToMany(mappedBy = "restaurant")
    private List<Menu> menu;

//    @OneToMany(mappedBy = "restaurant")
    private List<Waiter> waiters;

//    @OneToMany(mappedBy = "restaurant")
    private List<Chef> chefs;
}
