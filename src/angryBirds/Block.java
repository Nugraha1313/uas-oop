package angryBirds;

/** @author Nugraha1313 May 17, 2022 2:51:46 AM **/

public class Block extends Obstacle{

	public Block(String name, String color, double width, double height, boolean garisKoordinat, double x, double y, int life) {
		super(name, color, width, height, x, y, life);
		// Jika garisKoordinat true,maka block yang digenerate akan horizontal
		if(garisKoordinat)
			System.out.println(getName() + " is Generated Horizontally at (" + getX() + ", " + getY() + ")");
		// Jika tidak, maka block yang digenerate akan vertikal
		else
			System.out.println(getName() + " is Generated Vertically at (" + getX() + ", " + getY() + ")");
			
	}

}
