package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Enums.WaiterLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Waiter {
    private String waiterName;
    private String waiterEmail;
    private String waiterPhoneNumber;
    private WaiterLevel waiterLevel;
    private List<Map<Customer,Order>> orderCustomer;
    private Waiter(WaiterBuilder waiterBuilder){
        waiterName = waiterBuilder.waiterName;
        waiterEmail = waiterBuilder.waiterEmail;
        waiterLevel = waiterBuilder.waiterLevel;
        waiterPhoneNumber = waiterBuilder.waiterPhoneNumber;
    }
    public static WaiterBuilder getBuilder(){
        return new WaiterBuilder();
    }
    public static class WaiterBuilder{
        private String waiterName;
        private String waiterEmail;
        private String waiterPhoneNumber;
        private WaiterLevel waiterLevel;
        public Waiter build(){
            return new Waiter(this);
        }


        public String getWaiterName() {
            return waiterName;
        }

        public WaiterBuilder setWaiterName(String waiterName) {
            this.waiterName = waiterName;
            return this;
        }

        public String getWaiterEmail() {
            return waiterEmail;
        }

        public WaiterBuilder setWaiterEmail(String waiterEmail) {
            this.waiterEmail = waiterEmail;
            return this;
        }

        public String getWaiterPhoneNumber() {
            return waiterPhoneNumber;
        }

        public WaiterBuilder setWaiterPhoneNumber(String waiterPhoneNumber) {
            this.waiterPhoneNumber = waiterPhoneNumber;
            return this;
        }

        public WaiterLevel getWaiterLevel() {
            return waiterLevel;
        }

        public WaiterBuilder setWaiterLevel(WaiterLevel waiterLevel) {
            this.waiterLevel = waiterLevel;
            return this;
        }
    }
}
