package projeto.java.ordems.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import projeto.java.ordems.controller.dto.ApiResponse;
import projeto.java.ordems.controller.dto.OrderResponse;
import projeto.java.ordems.service.OrderService;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/customers/{customerId}/orders")
    public ResponseEntity<ApiResponse<OrderResponse>> listOrders(@PathVariable("customerId") Long customerId,]
                                                                 @RequestParam(name="page", defaultValue = "0") Integer page,
                                                                 @RequestParam(name="pageSize", defaultValue = "10") Integer pageSizer){

        

    return ResponseEntity.ok(null);
    }
}
