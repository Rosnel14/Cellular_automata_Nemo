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
		myLifeSpan = 9;
	}

	@Override
	public void reproduce() {
		int currentSizeOfCreatureList = myWorld.getCreatureList().size();
		Location comparison;
		for (int i=0; i< currentSizeOfCreatureList; i++) {
			if (myWorld.getCreatureList().get(i).getMyColor() == Color.ORANGE) {
				comparison = myWorld.getCreatureList().get(i).getMyLocation();
				for(int k = 0; k<currentSizeOfCreatureList; k++) {	
					if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()+1 && myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY() && myWorld.getCreatureList().get(k).getMyColor() == Color.ORANGE) {
						myWorld.getCreatureList().add( new Marlin(new Location(comparison.getX()-2,comparison.getY()-2), myWorld ));
					}
						if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()-1 && myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY() && myWorld.getCreatureList().get(k).getMyColor() == Color.ORANGE) {
							myWorld.getCreatureList().add( new Marlin(new Location(comparison.getX()+2,comparison.getY()+2), myWorld ));
						}
				}
			}
		}
	}
	public void move() {
		if (this.getMyLocation().getX() >= 50 || this.getMyLocation().getY() >= 50) {
			this.myLocation.setX(this.myLocation.getX()-3);
			this.myLocation.setY(this.myLocation.getY()+3);	
		} else if (this.getMyLocation().getX() <= 0 || this.getMyLocation().getY() <= 0) {
			this.myLocation.setX(this.myLocation.getX()+3);
		} else {
			this.myLocation.setX(this.myLocation.getX()+3);
			this.myLocation.setY(this.myLocation.getY()+3);
		}
	}

}