package Restaurant.Management_system.Model.Enums;

import lombok.Getter;


public enum PaymentMode {
    CASH(null),
    ONLINE_UPI(OnlinePaymentMethod.UPI),
    ONLINE_DEBIT_CARD(OnlinePaymentMethod.DEBIT_CARD),
    ONLINE_CREDIT_CARD(OnlinePaymentMethod.CREDIT_CARD);
    private OnlinePaymentMethod paymentMethod;
    PaymentMode(OnlinePaymentMethod method){
        this.paymentMethod = method;
    }
}
