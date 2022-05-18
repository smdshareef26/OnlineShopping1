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
import com.OrderTransaction.model.Transaction;
import com.OrderTransaction.service.TransactionService;





@RestController
public class TransactionController {
@Autowired
private TransactionService ts;

@GetMapping("/transaction")
public List<Transaction> transactionlist()
{
return ts.transactionlist();
}
@GetMapping("/transaction/{id}")
public ResponseEntity<Optional<Transaction>> getTransactionById(@PathVariable(value = "id") Long pid)
throws ResourceNotFoundException {
Optional<Transaction> t= ts.findById(pid);
return ResponseEntity.ok().body(t);
}

@PostMapping("/transaction")
public Transaction createTransaction( @Valid @RequestBody Transaction t) {
return ts.save(t);
}

@PutMapping("/transaction/{id}")
public ResponseEntity<Transaction> updateTransaction(@PathVariable(value = "id") Long pid, @Valid @RequestBody Transaction transactionDetails) throws ResourceNotFoundException {
Transaction t = ts.findById(pid)
.orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + pid));



t.setPid(transactionDetails.getPid());
t.setRid(transactionDetails.getRid());
t.setPayid(transactionDetails.getPayid());
final Transaction updatedTransaction = ts.save(t);
return ResponseEntity.ok(updatedTransaction);

}

@DeleteMapping("/transaction/{id}")
public Map<String, Boolean> deleteTransaction(@PathVariable(value = "id") Long pid)
throws ResourceNotFoundException {
Transaction t= ts.findById(pid)
.orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + pid));



ts.delete(t);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return response;
}
}