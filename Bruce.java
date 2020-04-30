import java.awt.Color;

/*
 * Bruce is the great white shark 
 * in finding Nemo that 
 * gets hyped up when he smells blood 
 * 
 * CARNIVORE ONLY
 */

public class Bruce extends Animal {
	public Bruce(Location l, World w) {
		super(l, w);
		myLifeSpan = 15;
		myColor = Color.lightGray;
	}

	public void reproduce() {
		int currentSizeOfCreatureList = myWorld.getCreatureList().size();
		Location comparison;
		for (int i = 0; i < currentSizeOfCreatureList; i++) {
			if (myWorld.getCreatureList().get(i).getMyColor() == Color.lightGray) {
				comparison = myWorld.getCreatureList().get(i).getMyLocation();
				for (int k = 0; k < currentSizeOfCreatureList; k++) {
					if (myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX() + 1
							&& myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()
							&& myWorld.getCreatureList().get(k).getMyColor() == Color.lightGray) {
						myWorld.getCreatureList()
								.add(new Bruce(new Location(comparison.getX() - 2, comparison.getY() - 2), myWorld));
					}
					if (myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX() - 1
							&& myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()
							&& myWorld.getCreatureList().get(k).getMyColor() == Color.lightGray) {
						myWorld.getCreatureList()
								.add(new Bruce(new Location(comparison.getX() + 2, comparison.getY() + 2), myWorld));
					}
				}
			}
		}
	}
	public void move() {
		if (this.getMyLocation().getX() > 50 || this.getMyLocation().getY() > 50) {
			this.myLocation.setX(this.myLocation.getX()-5);
			this.myLocation.setY(this.myLocation.getY()+5);	
		} else if (this.getMyLocation().getX() < 0 || this.getMyLocation().getY() < 0) {
			this.myLocation.setX(this.myLocation.getX()+5);
		} else {
			this.myLocation.setX(this.myLocation.getX()+5);
			this.myLocation.setY(this.myLocation.getY()+5);
		}
		
		
	}

}