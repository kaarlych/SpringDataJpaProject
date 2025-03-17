package pl.zajavka.zajavkastore.infrastructure.database;

import org.springframework.stereotype.Repository;
import pl.zajavka.zajavkastore.business.PurchaseDAO;
import pl.zajavka.zajavkastore.infrastructure.database.entity.PurchaseEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class PurchaseDatabaseRepository implements PurchaseDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public PurchaseEntity getPurchase(final Integer purchaseId) {
        return entityManager.find(PurchaseEntity.class, purchaseId);
    }

    @Override
    public void savePurchase(final PurchaseEntity purchaseEntity) {
        entityManager.persist(purchaseEntity);
    }

    @Override
    public void deletePurchase(final Integer purchaseId) {
        entityManager.remove(entityManager.find(PurchaseEntity.class, purchaseId));
    }
}
