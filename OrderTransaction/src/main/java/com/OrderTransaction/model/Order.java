package com.OrderTransaction.model;

import java.sql.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "orderlist")
public class Order {
private long ordid;
private long cusid;
private Date odate;
public Order() {

}

public Order(long ordid, long cusid, Date odate) {
super();
this.ordid = ordid;
this.cusid = cusid;
this.odate = odate;
}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public long getOrdid() {
return ordid;
}



public void setOrdid(long ordid) {
this.ordid = ordid;
}
@Column(name = "customerId", nullable = false)
public long getCusid() {
return cusid;
}



public void setCusid(long cusid) {
this.cusid = cusid;
}
@Column(name = "orderDate", nullable = false)
public Date getOdate() {
return odate;
}



public void setOdate(Date odate) {
this.odate = odate;
}



@Override
public String toString() {
return "Order [ordid=" + ordid + ", cusid=" + cusid + ", odate=" + odate + "]";
}




}