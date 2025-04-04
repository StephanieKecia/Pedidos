package projeto.java.ordems.service;

import org.springframework.stereotype.Service;
import projeto.java.ordems.entity.OrderEntity;
import projeto.java.ordems.entity.OrderItem;
import projeto.java.ordems.listener.dto.OrderCreatedEvent;
import projeto.java.ordems.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void save(OrderCreatedEvent event) {

        var entity = new OrderEntity();
        entity.setOrderId(event.codigoPedido());
        entity.setCustomerId(event.codigoCliente());
        //entity.setTotalPrice();


        entity.setItems(getOrderItems(event));
    }

    private static List<OrderItem> getOrderItems(OrderCreatedEvent event) {
        return event.itens().stream()
                .map(i -> new OrderItem(i.produto(), i.quantidade(), i.preco()))
                .toList();
    }
}
