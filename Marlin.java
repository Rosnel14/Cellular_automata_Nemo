import java.awt.Color;


/*
 * Marlin is Nemo's dad and he is a clownfish 
 * that eats small crustaceons like Krill and plants 
 * 
 * OMNIVORE ONLY 
 */
public class Marlin extends Animal {

	public Marlin(Location loc, World w) {
		super(loc, w);
		// TODO Auto-generated constructor stub
		myColor = Color.ORANGE;
	}

	@Override
	public void reproduce() {
		// TODO Auto-generated method stub
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		
		myWorld.getCreatureList().add(new Marlin(new Location(newX,newY), myWorld));
	}



}
