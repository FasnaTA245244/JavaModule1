package oopsday1.setgetconstructors;

public class Car {
	//properties data members instance variables
	private String color;
	private double price;
	private String brand;
	private String model;
	public String getColor() {
	return color;
	}
	public Car(String color, double price, String brand, String model) {
	
		this.color = color;
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "I am Fasna";
	}
		
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

}
