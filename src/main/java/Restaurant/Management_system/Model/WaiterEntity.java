//package Restaurant.Management_system.Model;
//
//import Restaurant.Management_system.Model.Enums.WaiterLevel;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.List;
//import java.util.Map;
//@Getter
//@Setter
//@Entity
//@NoArgsConstructor
//public class WaiterEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer waiterID;
//    private String waiterName;
//    private String waiterEmail;
//    private String waiterPhoneNumber;
//    @Enumerated(EnumType.STRING)
//    private WaiterLevel waiterLevel;
//
//    private List<Map<Customer,Order>> orderCustomer;
//
//    @ManyToOne
//    @JoinColumn(name = "Restaurant_id")
//    private Restaurant restaurant;
//}
