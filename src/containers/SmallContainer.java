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

public class SmallContainer extends Container{
	
	private int cost;
	public SmallContainer() {
		
		super.height_setter(2.59);
		super.lenght_setter(6.06);
		super.wide_setter(2.43);
		
		super.volume();
	}
	
	// setter
	
	public void cost_setter(double weight) {
		if(weight <= 500) {
			this.cost = 1000;
		}else {
			this.cost = 1200;
		}
	}
	
	// getter
	
	public int cost_getter() {
		return this.cost;
	}
	
	
	
	//methods
	
	public ArrayList <String>  printContainerInfo() {
		
		ArrayList <String> containerInfo = new ArrayList<String>();

		
		containerInfo.add("Container Cost weight lower than 500: "+ "1000 Euros");
		containerInfo.add("Container Cost weight higher than 500: "+ "1200 Euros");
		containerInfo.add("Container height: "+ Double.toString(super.height_getter()) + " m");
		containerInfo.add("Container lenght: "+ Double.toString(super.lenght_getter()) + " m");
		containerInfo.add("Container wide: "+ Double.toString(super.wide_getter()) + " m");
		containerInfo.add("container Volume: "+ String.format("%.2f", super.volume_getter()) + " m^3");
		
		return containerInfo;
		
	}

}
