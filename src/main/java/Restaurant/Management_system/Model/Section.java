package Restaurant.Management_system.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Section {
    private String sectionName;
    private List<Dish> dishes;
}
