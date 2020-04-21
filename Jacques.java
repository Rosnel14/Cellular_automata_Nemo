package Cellular_automata_Nemo.Cellular_automata_Nemo;
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
		int currentSizeOfCreatureList = myWorld.getCreatureList().size();
		Location comparison;
		for (int i=0; i< currentSizeOfCreatureList; i++) {
			if (myWorld.getCreatureList().get(i).getMyColor() == Color.PINK) {
				comparison = myWorld.getCreatureList().get(i).getMyLocation();
				for(int k = 0; k<currentSizeOfCreatureList; k++) {	
					if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()+1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
<<<<<<< HEAD
						myWorld.getCreatureList().add( new Jacques(new Location(comparison.getX()-2,comparison.getY()-2), myWorld ));
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()-1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(comparison.getX()+2,comparison.getY()+2), myWorld ));
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()+1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(comparison.getX()-2,comparison.getY()), myWorld ));
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()-1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(comparison.getX()+2,comparison.getY()), myWorld ));
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()+1 && myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()+1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(comparison.getX()+2,comparison.getY()), myWorld ));
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()+1 && myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()-1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(comparison.getX(),6), myWorld ));
=======
						myWorld.getCreatureList().add( new Jacques(new Location(2,6), myWorld ));
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()-1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(2,6), myWorld ));
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()+1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(2,6), myWorld ));
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()-1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(2,6), myWorld ));
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()+1 && myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()+1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(2,6), myWorld ));
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()+1 && myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()-1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(2,6), myWorld ));
>>>>>>> b84c83777ab9421f43f4ad086121c07ef0f193f9
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()-1 && myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()+1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(2,6), myWorld ));
					}
					if(myWorld.getCreatureList().get(k).getMyLocation().getX() == comparison.getX()-1 && myWorld.getCreatureList().get(k).getMyLocation().getY() == comparison.getY()-1 && myWorld.getCreatureList().get(k).getMyColor() == Color.PINK) {
						myWorld.getCreatureList().add( new Jacques(new Location(2,6), myWorld ));
					}
				}
			}
		}
	}
}