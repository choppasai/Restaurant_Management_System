package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Enums.BillStatus;
import Restaurant.Management_system.Model.Enums.PaymentMode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Bill {
    private int tableNumber;
    private String customerName;
    private List<Dish> orderList;
    private String ReferenceId;
    private PaymentMode mode;
    private BillStatus billStatus;
    public Bill generateBill(){

        return new Bill();
    }
}
