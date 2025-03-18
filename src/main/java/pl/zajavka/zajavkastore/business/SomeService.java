package pl.zajavka.zajavkastore.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.zajavka.zajavkastore.infrastructure.database.jparepositories.*;

@Service
@AllArgsConstructor
public class SomeService {

    private final CustomerDatabaseRepository customerDatabaseRepository;
    private final OpinionDatabaseRepository opinionDatabaseRepository;
    private final ProducerDatabaseRepository producerDatabaseRepository;
    private final ProductDatabaseRepository productDatabaseRepository;
    private final PurchaseDatabaseRepository purchaseDatabaseRepository;

    public void call() {
        System.out.println("#Customer: " + customerDatabaseRepository.findById(52));
        System.out.println("#Opinion: " + opinionDatabaseRepository.findById(13));
        System.out.println("#Producer: " + producerDatabaseRepository.findById(2));
        System.out.println("#Product: " + productDatabaseRepository.findById(22));
        System.out.println("#Purchase: " + purchaseDatabaseRepository.findById(117));
    }
}
