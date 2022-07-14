package angryBirds;

/** @author Nugraha1313 May 16, 2022 8:21:03 PM **/

public class Red extends Bird{

	public Red() {
		super("Red", "Merah", 2, 2);
	}

	@Override
	public void attack(Obstacle target) {
		if(!target.isDie() && !isAttacking()) {
			target.setLife(target.getLife() - 1);
			System.out.println(getName() + " Attacking " + target.getName() + " (Life = " + target.getLife() + ")");
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
		System.out.println("Red Doesn't Have Special Move");
	}

}
