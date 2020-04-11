import java.awt.Color;

/*
 * Bruce is the great white shark 
 * in finding Nemo that 
 * gets hyped up when he smells blood 
 * 
 * CARNIVORE ONLY
 */

public class Bruce extends Animal{
	public Bruce(Location l, World w) {
		super(l,w);
		myLifeSpan = 5;
		myColor = Color.lightGray;
	}
	
	public void reproduce() {
		// this is silly code really, but as an example
		int newX = (int)(Math.random()*10);
		int newY = (int)(Math.random()*10); 
		
		myWorld.getCreatureList().add(new Bruce(new Location(newX,newY), myWorld));
	}

	
}
