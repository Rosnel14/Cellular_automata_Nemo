import java.awt.Color;

//This is the grass class basically 
//MEANT TO BE EATEN 
public class Phytoplankton extends Plant {

	public Phytoplankton(Location l, World w) {
		super(l, w);
		myLifeSpan = 3;
		myColor = Color.green;
	}

	public void reproduce() {
		int newX = (int) (Math.random() * 100);
		int newY = (int) (Math.random() * 100);

		myWorld.getCreatureList().add(new Phytoplankton(new Location(newX, newY), myWorld));
	}
	public void move() {
		
	}
}