package pl.zajavka.zajavkastore.infrastructure.database.jparepositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zajavka.zajavkastore.infrastructure.database.entity.CustomerEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerDatabaseRepository extends JpaRepository<CustomerEntity, Integer> {

    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "purchaseEntities",
                    "purchaseEntities.opinionEntity"
            }
    )
    CustomerEntity findByEmail(String email);

    Optional<CustomerEntity> findByCustomerId(Integer integer);

    List<CustomerEntity> findByNameOrEmail(String name, String email);

    List<CustomerEntity> findByNameAndEmail(String name, String email);

    CustomerEntity findDistinctByEmail(String email);


    List<CustomerEntity> findAllCustomers();

    CustomerEntity findCustomerByEmail(String email);

    List<CustomerEntity> findAllCustomersNNQ();

    CustomerEntity findCustomerByEmailNNQ(String email);

    List<CustomerEntity> findByEmailContaining(String com);
}
