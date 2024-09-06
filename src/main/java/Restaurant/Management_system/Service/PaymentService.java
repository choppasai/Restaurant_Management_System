package Restaurant.Management_system.Service;

import Restaurant.Management_system.Exception.InvalidBillException;
import Restaurant.Management_system.Model.Payment;

public interface PaymentService {
    Payment makePayment(long billId) throws InvalidBillException;
}
