package com.OrderTransaction.service;

import java.util.List;
import java.util.Optional;



import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.OrderTransaction.model.Transaction;
import com.OrderTransaction.repository.TransactionRepository;





@Service
@Transactional
public class TransactionService {
@Autowired
TransactionRepository tr;

public List<Transaction> transactionlist()
{
return tr.findAll();
}

public Optional<Transaction> findById(Long pid){



return tr.findById(pid);
}

public Transaction save(Transaction t){
return tr.save(t);
}

public void delete(Transaction t) {
tr.delete(t);
}
}