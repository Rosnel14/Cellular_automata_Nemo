package Cellular_automata_Nemo;
import java.awt.Color;

public abstract class Animal extends LifeForm {
	
	public Animal(Location loc, World w) {
		super(loc, w);
		myColor = Color.black;
	}

}
