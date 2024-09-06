package Restaurant.Management_system.Repository;

import Restaurant.Management_system.Model.Bill;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Getter
@Repository
public class BillRepositoryImpl implements BillRepository{
    private Map<Long, Bill> bills = new HashMap<>();

    @Override
    public Bill save(Bill bill) {
        Long id = bill.getId();
        if(id == 0){
            bill.setId((long) (bills.size()+1));
        }
        bills.put(bill.getId(),bill);
        return bill;
    }

    @Override
    public Optional<Bill> findById(long billId) {
        return Optional.ofNullable(bills.get(billId));
    }
}
