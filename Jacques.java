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
		super(l, w);
		myLifeSpan = 7;
		myColor = Color.PINK;
	}

	public void reproduce() {
		int currentSizeOfCreatureList = myWorld.getCreatureList().size();
		Location comparison;
		for (int i = 0; i < currentSizeOfCreatureList; i++) {
			if (myWorld.getCreatureList().get(i).getMyColor() == Color.PINK) {
				comparison = myWorld.getCreatureList().get(i).getMyLocation();
				for (int k = 0; k < currentSizeOfCreatureList; k++) {
					if (myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX() + 1
							&& myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()
							&& myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList()
								.add(new Jacques(new Location(comparison.getX() - 2, comparison.getY() - 2), myWorld));
					}
					if (myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX() - 1
							&& myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()
							&& myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList()
								.add(new Jacques(new Location(comparison.getX() + 2, comparison.getY() + 2), myWorld));
					}
				}
			}
		}
	}
	public void move() {
		if (this.getMyLocation().getX() >= 50 || this.getMyLocation().getY() >= 50) {
			this.myLocation.setX(this.myLocation.getX()-1);
			this.myLocation.setY(this.myLocation.getY()+1);	
		} else if (this.getMyLocation().getX() <= 0 || this.getMyLocation().getY() <= 0) {
			this.myLocation.setX(this.myLocation.getX()+1);
		} else {
			this.myLocation.setX(this.myLocation.getX()+1);
			this.myLocation.setY(this.myLocation.getY()-1);
		}
	}
}