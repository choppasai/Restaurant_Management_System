package Restaurant.Management_system.Adapters;

import Restaurant.Management_system.Model.Payment;

public interface PaymentGatewayAdapter {

    Payment makePayment(long billId, double amount);
}
