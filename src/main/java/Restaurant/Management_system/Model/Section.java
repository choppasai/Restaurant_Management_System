package Restaurant.Management_system.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Section {
    private String sectionName;
    private List<Dish> dishes;
}
