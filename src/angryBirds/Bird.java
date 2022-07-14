package angryBirds;

/** @author Nugraha1313 May 16, 2022 8:20:15 PM **/

public abstract class Bird extends GameObject{
	
	private boolean attacking = false, specialMoving = false;
	
	
	public Bird(String name, String color, double width, double height) {
		super(name, color, width, height);
	}
	
	public boolean isAttacking() {
		return attacking;
	}
	
	public void setAttacking(boolean attacking) {
		this.attacking = attacking;
	}
	
	
//	public String getSize() {
//		return getWidth() + ", " + getHeight();
//	}
	
	public boolean isSpecialMoving() {
		return specialMoving;
	}

	public void setSpecialMoving(boolean specialMoving) {
		this.specialMoving = specialMoving;
	}

	public abstract void attack(Obstacle target);
	public abstract void specialMove(Obstacle target);
}
