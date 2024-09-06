package Restaurant.Management_system.Adapters;

import Restaurant.Management_system.Libraries.Razorpay.RazorpayApi;
import Restaurant.Management_system.Libraries.Razorpay.RazorpayPaymentResponse;
import Restaurant.Management_system.Model.Enums.BillStatus;
import Restaurant.Management_system.Model.Payment;

public class RazorpayAdapter implements PaymentGatewayAdapter{
    private RazorpayApi razorpayApi;

    public RazorpayAdapter(){
        init();
    }
    public void init(){
        razorpayApi = new RazorpayApi();
    }

    @Override
    public Payment makePayment(long billId, double amount) {
        RazorpayPaymentResponse paymentResponse =  razorpayApi.processPayment(billId, amount);
        Payment payment = new Payment();
        payment.setBillId(billId);
        payment.setTxnId(paymentResponse.getOrderId());
        String status = paymentResponse.getPaymentStatus();
        switch(status){
            case "SUCCESS":
                payment.setBillStatus(BillStatus.SUCCESS);
            case "FAILURE":
                payment.setBillStatus(BillStatus.FAILURE);
        }
        return payment;
    }

}
