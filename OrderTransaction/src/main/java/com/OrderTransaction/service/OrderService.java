package com.OrderTransaction.service;

import java.util.List;
import java.util.Optional;



import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.OrderTransaction.model.Order;
import com.OrderTransaction.repository.OrderRepository;




@Service
@Transactional
public class OrderService {
@Autowired
OrderRepository or;

public List<Order> orderlist()
{
return or.findAll();
}

public Optional<Order> findById(Long oid){



return or.findById(oid);
}

public Order save(Order o){
return or.save(o);
}

public void delete(Order o) {
or.delete(o);
}
}