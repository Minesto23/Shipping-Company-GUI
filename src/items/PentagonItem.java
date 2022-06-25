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

public class PentagonItem extends Item{

	private double side;
	private double height;
	
	public PentagonItem(String name, int quantity, double weight, double side, double height){
		super(name, quantity, weight);
		
		// input pentgon's dimensions
		
		this.side = side;
		
		
		this.height = height;
		
		this.volume();
		
		
	}
	
	public void volume() {
		
		super.volume_setter((0.25)*(Math.sqrt(5*(5+2*Math.sqrt(5)))*(Math.pow(this.side, 2))*this.height));
		super.total_volume();
	}
	
	public ArrayList<String> printItemInfo() {
		ArrayList<String> itemdata = new ArrayList();
		
		itemdata.add(super.name_getter());
		itemdata.add("Item Shape: Pentagon");
		itemdata.add("Item quantity: " + Integer.toString(super.quantity_getter()));
		itemdata.add("Item Weight: " + Double.toString(super.weight_getter()) );
		itemdata.add("Item Total Weight: " + Double.toString(super.total_weight_getter()));
		itemdata.add("Item Volume: "+ Double.toString(super.volume_getter()));
		itemdata.add("Item Total Volume: " + Double.toString(super.total_volume_getter()));
		
		
		return itemdata;	
	}
	
	public String ItemShape() {
		String shape = "Pentagon";
		
		return shape;
	}
}
