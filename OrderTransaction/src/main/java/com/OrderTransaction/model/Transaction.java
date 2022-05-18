package com.OrderTransaction.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "transaction")
public class Transaction {
private long rid;
private long pid;
private long payid;
public Transaction() {

}

public Transaction(long rid, long pid, long payid) {
super();
this.rid = rid;
this.pid = pid;
this.payid = payid;
}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

public long getPid() {
return pid;
}



public void setPid(long pid) {
this.pid = pid;
}
@Column(name = "reportId", nullable = false)
public long getRid() {
return rid;
}



public void setRid(long rid) {
this.rid = rid;
}
@Column(name = "paymentId", nullable = false)
public long getPayid() {
return payid;
}



public void setPayid(long payid) {
this.payid = payid;
}



@Override
public String toString() {
return "Transaction [rid=" + rid + ", pid=" + pid + ", payid=" + payid + "]";
}




}