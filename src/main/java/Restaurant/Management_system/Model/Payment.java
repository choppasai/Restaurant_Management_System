package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Enums.BillStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {

    private String txnId;
    private BillStatus billStatus;
    private long billId;


}
