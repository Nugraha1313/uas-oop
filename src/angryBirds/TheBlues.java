package angryBirds;

/** @author Nugraha1313 May 16, 2022 8:21:12 PM **/

public class TheBlues extends Bird{
	
	public TheBlues() {
		super("The Blues", "Biru", 1, 1);
	}

	@Override
	public void attack(Obstacle target) {
		if(!target.isDie() && !isAttacking()) {
			System.out.println(getName() + " Attacking " + target.getName());
			target.setLife(target.getLife() - 1);
			setAttacking(true);
			target.checkStatus();
		}
		else if(target.isDie())
			System.out.println("Cannot Attacking, " + target.getName() + " is Already Die");
		else if(isAttacking())
			System.out.println("Cannot Attacking, The Bird Already Attacking");
	}

	@Override
	public void specialMove(Obstacle target) {
		if(!target.isDie() && isAttacking()) {
			System.out.println("The Blues Casting Special Move to " + target.getName());
			target.setLife(target.getLife() - 1);
			target.checkStatus();
		}
		else if(!isAttacking())
			System.out.println("Cannot Casting Special Move, The Bird must Attacking first");
		else if(target.isDie())
			System.out.println("Cannot Casting Special Move, " + target.getName() + " is Already Die");
		
	}
}
