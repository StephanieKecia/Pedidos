package projeto.java.ordems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import projeto.java.ordems.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}
