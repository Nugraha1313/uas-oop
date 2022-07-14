package angryBirds;

/** @author Nugraha1313 May 16, 2022 8:21:20 PM **/

public class Chuck extends Bird{
	
	public Chuck() {
		super("Chuck", "Kuning", 2, 1.5);
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
		if(!target.isDie() && isAttacking() && !isSpecialMoving()) {
			System.out.println(getName() + " Casting Special Move to " + target.getName());
			setSpecialMoving(true);
			target.setLife(target.getLife() - 2);
			target.checkStatus();
		}
		else if(isSpecialMoving())
			System.out.println("Cannot Casting Special Moving, Special Moving already cast");
		else if(!isAttacking())
			System.out.println("Cannot Casting Special Move, The Bird must Attacking first");
		else if(target.isDie())
			System.out.println("Cannot Casting Special Move, " + target.getName() + " is Already Die");
	}
}
