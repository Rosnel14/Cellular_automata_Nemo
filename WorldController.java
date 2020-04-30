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
	public static final int APPLICATION_WIDTH = 1000;
	public static final int APPLICATION_HEIGHT = 1000;

	public void run() {
		setUpWorld();
		runWorld();
	}

	@SuppressWarnings("deprecation")
	public void init() {
		resize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}

	public void setUpWorld() {
		theWorld = new World(100, 100);
		theWorld.getCreatureList().add(new Phytoplankton(new Location(30, 20), theWorld));
		theWorld.getCreatureList().add(new Jacques(new Location(29, 20), theWorld));
		theWorld.getCreatureList().add(new Jacques(new Location(30, 15), theWorld));
		theWorld.getCreatureList().add(new Jacques(new Location(10, 30), theWorld));
		theWorld.getCreatureList().add(new Jacques(new Location(15, 45), theWorld));
		theWorld.getCreatureList().add(new Jacques(new Location(9, 3), theWorld));
		theWorld.getCreatureList().add(new Jacques(new Location(25, 30), theWorld));
		theWorld.getCreatureList().add(new Jacques(new Location(40, 30), theWorld));
		theWorld.getCreatureList().add(new Jacques(new Location(13, 20), theWorld));
		theWorld.getCreatureList().add(new Jacques(new Location(43, 33), theWorld));
		theWorld.getCreatureList().add(new Jacques(new Location(22, 9), theWorld));
		theWorld.getCreatureList().add(new Jacques(new Location(37, 19), theWorld));
		theWorld.getCreatureList().add(new Marlin(new Location(20, 20), theWorld));
		theWorld.getCreatureList().add(new Marlin(new Location(10, 48), theWorld));
		theWorld.getCreatureList().add(new Marlin(new Location(5, 25), theWorld));
		theWorld.getCreatureList().add(new Marlin(new Location(36, 10), theWorld));
		theWorld.getCreatureList().add(new Marlin(new Location(10, 5), theWorld));
		theWorld.getCreatureList().add(new Marlin(new Location(2, 30), theWorld));
		theWorld.getCreatureList().add(new Chum(new Location(16, 20), theWorld));
		theWorld.getCreatureList().add(new Chum(new Location(32, 32), theWorld));
		theWorld.getCreatureList().add(new Bruce(new Location(5, 5), theWorld));
		theWorld.getCreatureList().add(new Bruce(new Location(7, 30), theWorld));
		theWorld.getCreatureList().add(new Bruce(new Location(18, 22), theWorld));
		
		System.out.println("p1");
		theWorldCanvas = this.getGCanvas();
	}

	public void runWorld() {
		drawWorld();
		for (int i = 0; i < 20; i++) {
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