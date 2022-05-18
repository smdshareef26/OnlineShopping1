package com.app.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	int category_id;
	Date payment_date;
	long acc_numb;
	String Bankname;
	String IFSCcode;
	String Cardtype;
	int cardnumber;
	int expiredate;
	int	cvvno;
	int pincode;
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	public long getAcc_numb() {
		return acc_numb;
	}
	public void setAcc_numb(long acc_numb) {
		this.acc_numb = acc_numb;
	}
	public String getBankname() {
		return Bankname;
	}
	public void setBankname(String bankname) {
		Bankname = bankname;
	}
	public String getIFSCcode() {
		return IFSCcode;
	}
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	public String getCardtype() {
		return Cardtype;
	}
	public void setCardtype(String cardtype) {
		Cardtype = cardtype;
	}
	public int getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}
	public int getExpiredate() {
		return expiredate;
	}
	public void setExpiredate(int expiredate) {
		this.expiredate = expiredate;
	}
	public int getCvvno() {
		return cvvno;
	}
	public void setCvvno(int cvvno) {
		this.cvvno = cvvno;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Payment(int category_id, Date payment_date, long acc_numb, String bankname, String iFSCcode, String cardtype,
			int cardnumber, int expiredate, int cvvno, int pincode) {
		super();
		this.category_id = category_id;
		this.payment_date = payment_date;
		this.acc_numb = acc_numb;
		this.Bankname = bankname;
		this.IFSCcode = iFSCcode;
		this.Cardtype = cardtype;
		this.cardnumber = cardnumber;
		this.expiredate = expiredate;
		this.cvvno = cvvno;
		this.pincode = pincode;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

