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

public class RectanguleItem extends Item{
	
	private double lenght;
	private double width;
	private double height;
	
	public RectanguleItem(String name, int quantity, double weight,double lenght, double width, double height){
		super(name, quantity, weight);
		
		// input rectangule's dimension value
		
		this.lenght = lenght;
		
		
		this.width = width;
		
		
		this.height = height;
		
		this.volume();
		
		
	}
	
	public void volume() {
		
		super.volume_setter(this.lenght*this.height*this.width);
		super.total_volume();
	}
	
	public ArrayList<String> printItemInfo() {
		ArrayList<String> itemdata = new ArrayList();
		
		itemdata.add(super.name_getter());
		itemdata.add("Item Shape: Rectangule");
		itemdata.add("Item quantity: " + Integer.toString(super.quantity_getter()));
		itemdata.add("Item Weight: " + Double.toString(super.weight_getter()) );
		itemdata.add("Item Total Weight: " + Double.toString(super.total_weight_getter()));
		itemdata.add("Item Volume: "+ Double.toString(super.volume_getter()));
		itemdata.add("Item Total Volume: " + Double.toString(super.total_volume_getter()));
		
		
		return itemdata;	
	}
	
	public String ItemShape() {
		String shape = "rectangule";
		
		return shape;
	}

}
