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

public class CylinderItem extends Item{
	
	private double radius;
	private double height;
	
	public CylinderItem(String name, int quantity, double weight, double radius, double height){
		super(name, quantity, weight);
		
		// input cylinder's dimentions
		
		this.radius = radius;
		
		this.height = height;
		
		this.volume();
		
		
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		super.volume_setter(Math.PI*Math.pow(this.radius, 2)*this.height);
		super.total_volume();
		
	}

	@Override
	public ArrayList<String> printItemInfo() {
		ArrayList<String> itemdata = new ArrayList();
		
		itemdata.add(super.name_getter());
		itemdata.add("Item Shape: Cylinder");
		itemdata.add("Item quantity: " + Integer.toString(super.quantity_getter()));
		itemdata.add("Item Weight: " + Double.toString(super.weight_getter()) );
		itemdata.add("Item Total Weight: " + Double.toString(super.total_weight_getter()));
		itemdata.add("Item Volume: "+ Double.toString(super.volume_getter()));
		itemdata.add("Item Total Volume: " + Double.toString(super.total_volume_getter()));
		
		
		return itemdata;	
	}
	
	public String ItemShape() {
		String shape = "cylinder";
		
		return shape;
	}

}
