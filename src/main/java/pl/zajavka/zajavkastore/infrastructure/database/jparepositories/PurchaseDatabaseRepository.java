package pl.zajavka.zajavkastore.infrastructure.database.jparepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zajavka.zajavkastore.infrastructure.database.entity.PurchaseEntity;

@Repository
public interface PurchaseDatabaseRepository extends JpaRepository<PurchaseEntity, Integer> {

   
}
