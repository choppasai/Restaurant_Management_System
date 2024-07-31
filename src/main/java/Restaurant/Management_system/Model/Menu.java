package Restaurant.Management_system.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Menu {
    private String menuName;
    private List<Section> sectionList;
}
