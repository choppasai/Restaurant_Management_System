package Restaurant.Management_system.Service;

import Restaurant.Management_system.Adapters.PaymentGatewayAdapter;
import Restaurant.Management_system.Exception.InvalidBillException;
import Restaurant.Management_system.Model.Bill;
import Restaurant.Management_system.Model.Payment;
import Restaurant.Management_system.Repository.BillRepository;
import Restaurant.Management_system.Repository.BillRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PaymentServiceImpl implements PaymentService{

    private final PaymentGatewayAdapter paymentGatewayAdapter;
    private final BillRepository billRepository;

    public PaymentServiceImpl(PaymentGatewayAdapter paymentGatewayAdapter, BillRepositoryImpl billRepository){
        this.paymentGatewayAdapter = paymentGatewayAdapter;
        this.billRepository = billRepository;
    }

    @Override
    public Payment makePayment(long billId) throws InvalidBillException {
        Optional<Bill> bill = billRepository.findById(billId);
        if(bill.isEmpty())
            throw new InvalidBillException("Invalid bill id");
        Bill ActualBill = bill.get();
        double amount = ActualBill.getTotalAmount();

        return paymentGatewayAdapter.makePayment(billId, amount);
    }

}
