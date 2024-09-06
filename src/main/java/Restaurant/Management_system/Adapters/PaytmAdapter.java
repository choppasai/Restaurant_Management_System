package Restaurant.Management_system.Adapters;

import Restaurant.Management_system.Libraries.Paytm.PaytmApi;
import Restaurant.Management_system.Libraries.Paytm.PaytmPaymentResponse;
import Restaurant.Management_system.Model.Enums.BillStatus;
import Restaurant.Management_system.Model.Payment;

public class PaytmAdapter implements PaymentGatewayAdapter{

    private PaytmApi paytmApi;

    public PaytmAdapter(){
        init();
    }
    public void init(){
        paytmApi = new PaytmApi();
    }
    @Override
    public Payment makePayment(long billId, double amount) {
        PaytmPaymentResponse paymentResponse =  paytmApi.makePayment(billId, amount);
        Payment payment = new Payment();
        payment.setBillId(billId);
        payment.setTxnId(paymentResponse.getTxnId());
        System.out.println(payment.getTxnId());
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
