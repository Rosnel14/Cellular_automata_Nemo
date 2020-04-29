import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class WorldController extends GraphicsProgram {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private World theWorld;
	private GCanvas theWorldCanvas;
	public static final int APPLICATION_WIDTH = 500;
	public static final int APPLICATION_HEIGHT = 500;

	public void run() {
		setUpWorld();
		runWorld();
	}

	@SuppressWarnings("deprecation")
	public void init() {
		resize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}

	public void setUpWorld() {
		theWorld = new World(50, 50);
//		theWorld.getCreatureList().add(new Bruce(new Location(8, 2), theWorld));
//		System.out.println("b1");
//		theWorld.getCreatureList().add(new Bruce(new Location(7, 2), theWorld));
//		System.out.println("b2");
//		theWorld.getCreatureList().add(new Bruce(new Location(3, 5), theWorld));
//		System.out.println("b3");
//		theWorld.getCreatureList().add(new Marlin(new Location(4, 5), theWorld));
//		System.out.println("m1");
//		theWorld.getCreatureList().add(new Phytoplankton(new Location(5, 5), theWorld));
//		System.out.println("p1");
//		theWorld.getCreatureList().add(new Phytoplankton(new Location(3, 3), theWorld));
//		System.out.println("p1");
//		theWorld.getCreatureList().add(new Jacques(new Location(2, 1), theWorld));
//		System.out.println("j1");
//		theWorld.getCreatureList().add(new Jacques(new Location(3, 9), theWorld));
//		System.out.println("j1");
//		theWorld.getCreatureList().add(new Jacques(new Location(13, 12), theWorld));
//		System.out.println("j1");
////		theWorld.getCreatureList().add( new Jacques(new Location(4,2), theWorld ));
////		System.out.println("j1");
		theWorld.getCreatureList().add(new Chum(new Location(5, 13), theWorld));
		System.out.println("c1");
//		theWorld.getCreatureList().add( new Chum(new Location(10,3), theWorld ));
//		System.out.println("c1");
//		
		theWorldCanvas = this.getGCanvas();
	}

	public void runWorld() {
		drawWorld();
		for (int i = 0; i < 10; i++) {
			theWorld.letTimePass();
			pause(500);
			System.out.print(System.currentTimeMillis());
			drawWorld();
		}
	}

	public void drawWorld() {
		drawBlankWorld();
		drawCreatures();
	}

	public void drawBlankWorld() {
		for (int row = 0; row < theWorld.getWidth(); row++)
			for (int col = 0; col < theWorld.getHeight(); col++) {
				GRect r = new GRect(row * 10, col * 10, 10, 10);
				r.setFillColor(Color.CYAN);
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
	}

	public void drawCreatures() {
		for (LifeForm x : theWorld.getCreatureList()) {
			GRect r = new GRect(x.getMyLocation().getX() * 10, x.getMyLocation().getY() * 10, 10, 10);
			r.setFillColor(x.getMyColor());
			r.setFilled(true);
			theWorldCanvas.add(r);
		}
	}
}