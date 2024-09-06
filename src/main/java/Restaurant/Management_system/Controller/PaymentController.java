package Restaurant.Management_system.Controller;

import Restaurant.Management_system.DTOs.MakePaymentRequestDto;
import Restaurant.Management_system.DTOs.MakePaymentResponseDto;
import Restaurant.Management_system.DTOs.ResponseStatus1;
import Restaurant.Management_system.Exception.InvalidBillException;
import Restaurant.Management_system.Model.Payment;
import Restaurant.Management_system.Service.PaymentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public MakePaymentResponseDto makePayment(MakePaymentRequestDto makePaymentRequestDto) throws InvalidBillException {
        Payment payment = null;
        MakePaymentResponseDto makePaymentResponseDto = new MakePaymentResponseDto();
        try{
            payment = paymentService.makePayment(makePaymentRequestDto.getBillId());
            makePaymentResponseDto.setTxnId(payment.getTxnId());
            makePaymentResponseDto.setBillStatus(payment.getBillStatus());
            makePaymentResponseDto.setResponseStatus(ResponseStatus1.SUCCESS);
        }
        catch(InvalidBillException e){
            makePaymentResponseDto.setResponseStatus(ResponseStatus1.FAILURE);
        }

        return makePaymentResponseDto;
    }
}
