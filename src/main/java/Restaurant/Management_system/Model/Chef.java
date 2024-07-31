package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Enums.ChefLevel;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Chef {
    private String chefName;
    private String chefEmail;
    private String chefPhoneNumber;
    private ChefLevel chefLevel;
    private List<Order> orders;
}
