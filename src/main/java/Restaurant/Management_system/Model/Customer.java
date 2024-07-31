package Restaurant.Management_system.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private String customerName;
    private String WaiterName;
    private Bill bill;
}
