package com.OrderTransaction.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;



import javax.validation.Valid;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.OrderTransaction.exception.ResourceNotFoundException;
import com.OrderTransaction.model.Order;
import com.OrderTransaction.service.OrderService;




@RestController
public class OrderController {
@Autowired
private OrderService os;

@GetMapping("/order")
public List<Order> orderlist()
{
return os.orderlist();
}
@GetMapping("/order/{id}")
public ResponseEntity<Optional<Order>> getOrderById(@PathVariable(value = "id") Long ordid)
throws ResourceNotFoundException {
Optional<Order> o= os.findById(ordid);
return ResponseEntity.ok().body(o);
}

@PostMapping("/order")
public Order createOrder( @Valid @RequestBody Order o) {
return os.save(o);
}

@PutMapping("/order/{id}")
public ResponseEntity<Order> updateOrder(@PathVariable(value = "id") Long ordid, @Valid @RequestBody Order orderDetails) throws ResourceNotFoundException {
Order o = os.findById(ordid)
.orElseThrow(() -> new ResourceNotFoundException("Order not found for this id :: " + ordid));



o.setOrdid(orderDetails.getOrdid());
o.setCusid(orderDetails.getCusid());
o.setOdate(orderDetails.getOdate());
final Order updatedOrder = os.save(o);
return ResponseEntity.ok(updatedOrder);

}

@DeleteMapping("/order/{id}")
public Map<String, Boolean> deleteOrder(@PathVariable(value = "id") Long ordid)
throws ResourceNotFoundException {
Order o= os.findById(ordid)
.orElseThrow(() -> new ResourceNotFoundException("Order not found for this id :: " + ordid));



os.delete(o);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return response;
}
}