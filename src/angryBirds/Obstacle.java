package angryBirds;

/** @author Nugraha1313 May 17, 2022 2:39:27 AM **/

public class Obstacle extends GameObject{
	private int life;
	private double x,y;
	
	public Obstacle(String name, String color, double width, double height, double x, double y, int life) {
		super(name, color, width, height);
		setX(x);
		setY(y);
		setLife(life);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	public boolean isDie() {
		return life <= 0;
	}
	
	public void checkStatus() {
		if(isDie())
			System.out.println(getName() + " is Die");
	}
	
}
