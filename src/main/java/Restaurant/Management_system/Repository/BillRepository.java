package Restaurant.Management_system.Repository;

import Restaurant.Management_system.Model.Bill;

import java.util.Optional;

public interface BillRepository {
    Bill save(Bill bill);
    Optional<Bill> findById(long billId);
}
