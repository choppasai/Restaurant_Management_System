package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Enums.ChefLevel;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Chef extends Base{
    private String chefName;
    private String chefEmail;
    private String chefPhoneNumber;
    private ChefLevel chefLevel;
    private List<Order> orders;
    private Chef(ChefBuilder chefBuilder){
        this.chefName = chefBuilder.chefName;
        this.chefEmail = chefBuilder.chefEmail;
        this.chefLevel = chefBuilder.chefLevel;
        this.chefPhoneNumber = chefBuilder.chefPhoneNumber;
    }
    public static ChefBuilder getBuilder(){
        return new ChefBuilder();
    }
    public static class ChefBuilder{
        private String chefName;
        private String chefEmail;
        private String chefPhoneNumber;
        private ChefLevel chefLevel;
        public Chef build(){
            return new Chef(this);
        }


        public String getChefName() {
            return chefName;
        }

        public ChefBuilder setChefName(String chefName) {
            this.chefName = chefName;
            return this;
        }

        public String getChefEmail() {
            return chefEmail;
        }

        public ChefBuilder setChefEmail(String chefEmail) {
            this.chefEmail = chefEmail;
            return this;
        }

        public String getChefPhoneNumber() {
            return chefPhoneNumber;
        }

        public ChefBuilder setChefPhoneNumber(String chefPhoneNumber) {
            this.chefPhoneNumber = chefPhoneNumber;
            return this;
        }

        public ChefLevel getChefLevel() {
            return chefLevel;
        }

        public ChefBuilder setChefLevel(ChefLevel chefLevel) {
            this.chefLevel = chefLevel;
            return this;
        }
    }
}
