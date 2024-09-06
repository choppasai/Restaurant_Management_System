package Restaurant.Management_system.DTOs;

import Restaurant.Management_system.Model.Enums.BillStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
public class MakePaymentResponseDto {
    private ResponseStatus1 responseStatus;
    private String txnId;
    private BillStatus billStatus;

//    public void setResponseStatus(Restaurant.Management_system.DTOs.ResponseStatus responseStatus) {
//    }
}
