import java.awt.Color;

/* 
 * Chum is a blue mako shark that eats all animals 
 * except for the apex predator, i.e. Bruce 
 * 
 * 
 * CARNIVORE ONLY 
 */
public class Chum extends Animal {

	public Chum(Location loc, World w) {
		super(loc, w);
		// TODO Auto-generated constructor stub
		myColor = Color.blue;
		myLifeSpan = 7;
	}

	@Override
	public void reproduce() {
		int currentSizeOfCreatureList = myWorld.getCreatureList().size();
		Location comparison;
		for (int i=0; i< currentSizeOfCreatureList; i++) {
			if (myWorld.getCreatureList().get(i).getMyColor() == Color.blue) {
				comparison = myWorld.getCreatureList().get(i).getMyLocation();
				for(int k = 0; k<currentSizeOfCreatureList; k++) {	
					if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()+1 && myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY() && myWorld.getCreatureList().get(k).getMyColor() == Color.blue) {
						myWorld.getCreatureList().add( new Chum(new Location(comparison.getX()-2,comparison.getY()-2), myWorld ));
					}
						if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()-1 && myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY() && myWorld.getCreatureList().get(k).getMyColor() == Color.blue) {
							myWorld.getCreatureList().add( new Chum(new Location(comparison.getX()+2,comparison.getY()+2), myWorld ));
						}
				}
			}
		}
	}

}
