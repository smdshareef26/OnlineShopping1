package com.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Products")
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	int prod_code;
	public Products(int prod_code, String name, int price, int category_id) {
		super();
		this.prod_code = prod_code;
		this.name = name;
		this.price = price;
		this.category_id = category_id;
	}
	public int getProd_code() {
		return prod_code;
	}
	public void setProd_code(int prod_code) {
		this.prod_code = prod_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	String name;
	int price;
	int category_id;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
