package Cellular_automata_Nemo;

public class ApexPredator extends Animal{
	public ApexPredator(Location l, World w) {
		super(l,w);
		myLifeSpan = 5;
		//myColor = Color.blue;
	}
	
	public void reproduce() {
		// this is silly code really, but as an example
		int newX = (int)(Math.random()*10);
		int newY = (int)(Math.random()*10); 
		
		myWorld.getCreatureList().add(new ApexPredator(new Location(newX,newY), myWorld));
	}

}
