import java.awt.Color;


/* 
 * Jacques is the krill guy in Finding Nemo,
 * he only eats gunk and other plant stuff 
 * which includes phytoplankton
 * 
 * 
 * HERBIVORE ONLY 
 */
public class Jacques extends Animal {
	public Jacques(Location l, World w) {
		super(l,w);
		myLifeSpan = 4;
		myColor = Color.PINK;
	}
	
	public void reproduce() {
		// this is silly code really, but as an example
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		
		myWorld.getCreatureList().add(new Jacques(new Location(newX,newY), myWorld));
	}
}
