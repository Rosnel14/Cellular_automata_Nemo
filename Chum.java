import java.awt.Color;

/* 
 * Chum is a blue mako shark that eats all animals 
 * except for the apex predator, i.e. Bruce 
 * 
 * 
 * CARNIVORE ONLY 
 */
public class Chum extends Animal{

	public Chum(Location loc, World w) {
		super(loc, w);
		// TODO Auto-generated constructor stub
		myColor = Color.blue;
	}

	@Override
	public void reproduce() {
		// TODO Auto-generated method stub
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		
		myWorld.getCreatureList().add(new Chum(new Location(newX,newY), myWorld));
	}


}
