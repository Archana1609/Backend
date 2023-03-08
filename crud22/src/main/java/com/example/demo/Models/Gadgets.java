package com.example.demo.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Gadgets {
	@Id 
	private int model_no;
	private String gadget;
	private String brand_name;
	private int price;
	private String warranty;
	public Gadgets(int model_no, String gadget, String brand_name, int price, String warranty) {
		super();
		this.model_no = model_no;
		this.gadget = gadget;
		this.brand_name = brand_name;
		this.price = price;
		this.warranty = warranty;
	}
	public Gadgets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getModel_no() {
		return model_no;
	}
	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}
	public String getGadget() {
		return gadget;
	}
	public void setGadget(String gadget) {
		this.gadget = gadget;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
}
