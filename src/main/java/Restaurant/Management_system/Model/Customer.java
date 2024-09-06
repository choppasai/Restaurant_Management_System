package Restaurant.Management_system.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer extends Base{
    private Integer tableId;
    private String WaiterName;
    private Bill bill;
}
