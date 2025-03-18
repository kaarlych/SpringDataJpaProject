package pl.zajavka.zajavkastore.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.zajavka.zajavkastore.infrastructure.database.entity.CustomerEntity;
import pl.zajavka.zajavkastore.infrastructure.database.jparepositories.CustomerDatabaseRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class NamedQueryService {

    private final CustomerDatabaseRepository customerDatabaseRepository;

    public void call() {
        List<CustomerEntity> allCustomers = customerDatabaseRepository.findAllCustomersNNQ();
        System.out.println("###ALL: " + allCustomers);

        CustomerEntity customerByEmail = customerDatabaseRepository.findCustomerByEmailNNQ("amulligan2m@odnoklassniki.ru");
        System.out.println("###CUSTOMER BY EMAIL: " + customerByEmail);
    }
}
