package Restaurant.Management_system;

import Restaurant.Management_system.Controller.PaymentController;
import Restaurant.Management_system.Controller.RestaurantController;
import Restaurant.Management_system.DTOs.MakePaymentRequestDto;
import Restaurant.Management_system.DTOs.MakePaymentResponseDto;
import Restaurant.Management_system.Exception.InvalidBillException;
import Restaurant.Management_system.Model.*;
import Restaurant.Management_system.Model.Enums.ChefLevel;
import Restaurant.Management_system.Model.Enums.Cuisiens;
import Restaurant.Management_system.Model.Enums.DishType;
import Restaurant.Management_system.Model.Enums.WaiterLevel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ManagementSystemApplication {
	private static RestaurantController restaurantController;
	private static PaymentController paymentController;

	ManagementSystemApplication(RestaurantController restaurantController, PaymentController paymentController){
		ManagementSystemApplication.restaurantController = restaurantController;
        ManagementSystemApplication.paymentController = paymentController;
    }

	public static void main(String[] args)  {
//		SpringApplication.run(ManagementSystemApplication.class, args);

//		Restaurant restaurant = restaurantController.createRestaurant();

//		restaurantController.giveOrder();

		MakePaymentResponseDto responseDto = null;
		try{
			responseDto = paymentController.makePayment(new MakePaymentRequestDto(0));
		}
		catch (InvalidBillException e){
			System.out.println(e.getMessage());
		}
		System.out.println(responseDto.getTxnId());
	}

}
