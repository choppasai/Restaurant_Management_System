package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Enums.WaiterLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Waiter {
    private String waiterName;
    private String waiterEmail;
    private String waiterPhoneNumber;
    private WaiterLevel waiterLevel;
    private List<Map<Customer,Order>> orderCustomer;
}
