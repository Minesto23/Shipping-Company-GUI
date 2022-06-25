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

package containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BigContainer extends Container{

	private int cost;
	
	public BigContainer() {
		
		super.height_setter(2.59);
		super.lenght_setter(12.01);
		super.wide_setter(2.43);
		this.cost = 1800;
		
		super.volume();
	}
	
	// getters
	
	public int cost_getter() {
		return this.cost;
	}
	
	
	//methods
	
	public ArrayList <String>  printContainerInfo() {
		
		ArrayList <String> containerInfo = new ArrayList<String>();

		
		containerInfo.add("Container Cost: "+ Integer.toString(this.cost) + " Euros");
		containerInfo.add("Container height: "+ Double.toString(super.height_getter()) + " m");
		containerInfo.add("Container lenght: "+ Double.toString(super.lenght_getter()) + " m");
		containerInfo.add("Container wide: "+ Double.toString(super.wide_getter()) + " m");
		containerInfo.add("container Volume: "+ String.format("%.2f", super.volume_getter()) + " m^3");
		
		return containerInfo;
		
		
	}
}
