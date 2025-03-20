package pl.zajavka.zajavkastore.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.zajavka.zajavkastore.infrastructure.database.entity.Stars;
import pl.zajavka.zajavkastore.infrastructure.database.jparepositories.*;

import java.util.Set;

@Service
@AllArgsConstructor
public class SomeService {

    private final CustomerDatabaseRepository customerDatabaseRepository;
    private final OpinionDatabaseRepository opinionDatabaseRepository;
    private final ProducerDatabaseRepository producerDatabaseRepository;
    private final ProductDatabaseRepository productDatabaseRepository;
    private final PurchaseDatabaseRepository purchaseDatabaseRepository;

    @Transactional
    public void call() {
        System.out.println(opinionDatabaseRepository.countMaxStars());
    }
}
