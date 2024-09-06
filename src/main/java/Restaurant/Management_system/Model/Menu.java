package Restaurant.Management_system.Model;

import Restaurant.Management_system.Model.Enums.Cuisiens;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor

@NoArgsConstructor
public class Menu extends Base{

    private Cuisiens menuName;
    private List<Section> sectionList;

//    @ManyToOne
//    @JoinColumn(name = "Restaurant_id")
//    private Restaurant restaurant;
}
