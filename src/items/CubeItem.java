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

public class CubeItem extends Item{

	private double side;
	
	public CubeItem(String name, int quantity, double weight,double side){
		super(name, quantity, weight);
		// input cube's side value
		this.side = side;
		
		this.volume();
		
		//cubeScan.close();
	}
	
	public void volume() {
		
		super.volume_setter(this.side*3);
		super.total_volume();
	}
	
	public ArrayList<String> printItemInfo() {
		ArrayList<String> itemdata = new ArrayList();
		
		itemdata.add(super.name_getter());
		itemdata.add("Item Shape: Cube");
		itemdata.add("Item quantity: " + Integer.toString(super.quantity_getter()));
		itemdata.add("Item Weight: " + Double.toString(super.weight_getter()) );
		itemdata.add("Item Total Weight: " + Double.toString(super.total_weight_getter()));
		itemdata.add("Item Volume: "+ Double.toString(super.volume_getter()));
		itemdata.add("Item Total Volume: " + Double.toString(super.total_volume_getter()));
		
		
		return itemdata;	
	}
	
	public String ItemShape() {
		String shape = "cube";
		
		return shape;
	}
}
