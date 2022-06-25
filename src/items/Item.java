/**
 *	Made by :
 *
 *	- Miguel Ernesto Morales Molina
	- Karim Moluh Seidou
	- Hadi Mustafa
	- Rayan Bou Hassan
	- Arman Islam

 * 
 **/
package items;

import java.util.ArrayList;

// main item class
public abstract class Item {
	
	private String name; // variable to store item name
	private double weight;// variable to store item weight
	private double total_weight; // Variable to store total weight of one type of product
	private int quantity;// variable to store item quantity
	private double volume;// variable to store single item volume
	private double total_volume; // variable to store total volume of one kind of product
	
	public Item(String name, int quantity, double weight){
		
		this.name = name;
		
	
		this.quantity = quantity;
		
		
		this.weight = weight;
		
		this.total_weight = this.weight * this.quantity;
		
		//itemScan.close();
	}
	
	// setters 
	
	public void quantity_setter(int quantity) {
		this.quantity = quantity;
	}
	public void volume_setter(double volume) {
		this.volume = volume;
	}
	// getters
	
	public String name_getter() {
		return this.name;
	}
	
	public double weight_getter() {
		return this.weight;
	}
	
	public double total_weight_getter() {
		return this.total_weight;
	}
	
	public int quantity_getter() {
		return this.quantity;
	}
	
	public double volume_getter() {
		return this.volume;
	}
	
	public double total_volume_getter() {
		return this.total_volume;
	}
	
	//methods
	
	public abstract void volume();
	
	public abstract ArrayList<String> printItemInfo();
	
	public abstract String ItemShape();
	
	public void total_volume() {
		this.total_volume = this.volume*this.quantity;
	}
}
