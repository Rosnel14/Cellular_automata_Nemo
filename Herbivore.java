package Cellular_automata_Nemo;

public class Herbivore extends Animal {
	public Herbivore(Location l, World w) {
		super(l,w);
		myLifeSpan = 4;
		//myColor = Color.blue;
	}
	
	public void reproduce() {
		// this is silly code really, but as an example
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		
		myWorld.getCreatureList().add(new Herbivore(new Location(newX,newY), myWorld));
	}

}
