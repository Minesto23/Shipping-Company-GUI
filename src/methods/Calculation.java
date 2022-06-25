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
package methods;

import java.util.ArrayList;
import java.util.Scanner;

import containers.BigContainer;
import containers.SmallContainer;
import items.*;


public class Calculation {
	
	private ArrayList<Item> order = new ArrayList<Item>(); // arraylist to store the order
	
	public Calculation() {
	}

	
	//methods
	
	// methods to add items to the order arraylist
	public void add_item(Item item) {
		this.order.add(item);
	}
	
	// method to print the information about the order
	public ArrayList<String> printOrderInformation() {
		
		ArrayList<String> myorder = new ArrayList<String>();
		
		for(int i = 0; i<this.order.size(); i++ ) {
			
			myorder.add("id: "+ (i+1) +"  name: "+ this.order.get(i).name_getter() + " shape: " + this.order.get(i).ItemShape());
		}
		
		return myorder;
	}
	
	// method to print information about a define item
	public ArrayList <String> printItemInformation(int item) {
		
		ArrayList <String> itemdata = new ArrayList<>();
		itemdata = this.order.get(item).printItemInfo();
		
		return itemdata;
		
	}
	
	//method to calculate the total volume
	public double total_volume(ArrayList<Item> order) {
		
		double total_volume=0;
		
		for (Item i : order) {
			total_volume += i.total_volume_getter();
		}
		
		return total_volume;
	}
	
	// method to calculate the total weight
	public double total_weight(ArrayList<Item> order) {
		
		double total_weight=0;
		
		for (Item i : order) {
			total_weight += i.total_weight_getter();
		}
		
		return total_weight;
	}
	
	// method to calculate the price to pay for the shipping
	public int shipping_price(BigContainer bigcontainer, SmallContainer smallcontainer) {
		
		int shipping_price =0;
		
		shipping_price = bigcontainer.quantity_needed_getter()*bigcontainer.cost_getter() + smallcontainer.quantity_needed_getter()*smallcontainer.cost_getter();
		
		return shipping_price;
	}

	// method core of the app than calculate the best choice to shipping the items
	public ArrayList<String> best_shipping() {
		
		BigContainer bigcontainer = new BigContainer();
		SmallContainer smallcontainer = new SmallContainer();
		
		ArrayList<String> result = new ArrayList<>();
		
		double total_volume = this.total_volume(this.order);
		double total_weight = this.total_weight(this.order);
		
		
		if(total_volume<=smallcontainer.volume_getter()) {
			smallcontainer.quanity_needed_setter(1);
			smallcontainer.cost_setter(total_weight);
			
		}else if (total_volume>=smallcontainer.volume_getter() && total_volume<=bigcontainer.volume_getter()) {
			bigcontainer.quanity_needed_setter(1);
		}else {
			bigcontainer.quanity_needed_setter((int) (total_volume/bigcontainer.volume_getter()));
			
			if((total_volume%bigcontainer.volume_getter())<=smallcontainer.volume_getter()) {
				smallcontainer.quanity_needed_setter(1);
				smallcontainer.cost_setter(((total_volume%bigcontainer.volume_getter())/total_volume) * total_weight);
			}else {
				bigcontainer.quanity_needed_setter(1);
			}
		}
		
		
		result.add("\nnumber of big containers: " + bigcontainer.quantity_needed_getter());
		result.add("number of small containers: " + smallcontainer.quantity_needed_getter());
		result.add("number of items to ship: " + this.order.size());
		result.add("Total order Volume: " + total_volume + " m^3");
		result.add("Total order Weight: " + total_weight + " kg");
		
		result.add("Total price: " + this.shipping_price(bigcontainer, smallcontainer) + " Euros");
		
		return result;
		
	}
	
	public ArrayList<Item> order_getter(){
		return this.order;
	}

}
