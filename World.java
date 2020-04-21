import java.awt.Color;
import java.util.ArrayList;

public class World {
	
	private int width;
	private int height;
	private ArrayList<LifeForm> creatureList;
	
	public World(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.creatureList = new ArrayList<LifeForm>();
	}
	
	public void letTimePass(){
		
		makeNewCreatures();
		eatThings();
		//creaturesGetOlder();
		//purgeTheDead();		
	}
	public void eatThings() {
		
		
		int currentSizeOfCreatureList = creatureList.size();
		Location comparison;
		for (int i=currentSizeOfCreatureList-1; i > 0; i--) {
			System.out.println(creatureList.get(i).getMyColor());
			if (creatureList.get(i).getMyColor() == Color.PINK) {
				comparison = creatureList.get(i).getMyLocation();
				for(int k=currentSizeOfCreatureList-1; k > 0; k--) {	
					if(creatureList.get(k).getMyLocation().getX() == comparison.getX()+1 && creatureList.get(k).getMyLocation().getY() == comparison.getY() && creatureList.get(k).getMyColor() == Color.green) {
						this.creatureList.remove(creatureList.get(k));
					}
				}
			}
		}
//					}
//					if(creatureList.get(k).getMyLocation().getX() == comparison.getX()-1 && creatureList.get(k).getMyColor() == Color.green) {
//						creatureList.remove(k);
//					}
//					if(creatureList.get(k).getMyLocation().getY() == comparison.getY()+1 && creatureList.get(k).getMyColor() == Color.green) {
//						creatureList.remove(k);
//					}
//					if(creatureList.get(k).getMyLocation().getY() == comparison.getY()-1 && creatureList.get(k).getMyColor() == Color.green) {
//						creatureList.remove(k);
//					}
//					if(creatureList.get(k).getMyLocation().getX() == comparison.getX()+1 && creatureList.get(k).getMyLocation().getY() == comparison.getY()+1 && creatureList.get(k).getMyColor() == Color.green) {
//						creatureList.remove(k);
//					}
//					if(creatureList.get(k).getMyLocation().getX() == comparison.getX()+1 && creatureList.get(k).getMyLocation().getY() == comparison.getY()-1 && creatureList.get(k).getMyColor() == Color.green) {
//						creatureList.remove(k);
//					}
//					if(creatureList.get(k).getMyLocation().getX() == comparison.getX()-1 && creatureList.get(k).getMyLocation().getY() == comparison.getY()+1 && creatureList.get(k).getMyColor() == Color.green) {
//						creatureList.remove(k);
//					}
//					if(creatureList.get(k).getMyLocation().getX() == comparison.getX()-1 && creatureList.get(k).getMyLocation().getY() == comparison.getY()-1 && creatureList.get(k).getMyColor() == Color.green) {
//						creatureList.remove(k);
//					}
//				}
//			}
//		}
	}
	
	public void makeNewCreatures() {
		
		int currentSizeOfCreatureList = creatureList.size();
		System.out.println("size of list is "+currentSizeOfCreatureList);
		for(int i=0; i< currentSizeOfCreatureList; i++) {
			creatureList.get(i).reproduce();
		}
		System.out.println("End of reproduce");
	}
	
	public void purgeTheDead(){
		int i=0;
		while(i<creatureList.size()){
			if(creatureList.get(i).isDead())
				creatureList.remove(i);
			else
				i++;
		}	
	}
	
	public void creaturesGetOlder(){
		for( LifeForm l:creatureList){
			l.age(1);
		}
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public ArrayList<LifeForm> getCreatureList() {
		return creatureList;
	}
	public void setCreatureList(ArrayList<LifeForm> creatureList) {
		this.creatureList = creatureList;
	}

	@Override
	public String toString() {
		return "World [width=" + width + ", height=" + height
				+ ", creatureList=" + creatureList + "]";
	}
}
