package Restaurant.Management_system.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class OrderDTO {
    private Integer tableId;
    private String waiterName;
    private List<DishDTO> dishes;
}
