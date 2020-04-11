import java.util.ArrayList;

//This is the grass class basically 
//MEANT TO BE EATEN 
public class Phytoplankton extends Plant {
	
	public Phytoplankton(Location l, World w) {
		super(l,w);
		myLifeSpan = 3;
	}
	
	public void reproduce() {
		// this is silly code really, but as an example
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		
		myWorld.getCreatureList().add(new Phytoplankton(new Location(newX,newY), myWorld));
	}


}
