package angryBirds;

/** @author Nugraha1313 May 17, 2022 2:21:35 AM **/

public class Main {
	
	public static int score = 0, star = 0, dieCount = 0;
	
	public static void gameOver() {
		System.out.println("========GAME OVER========");
	}
	
	public static void level1() {
		System.out.println("=========Level 1=========");
		// Initializing Component
		// --Bird--
		Bird bird1 = new Red();
		Bird bird2 = new Red();
		Bird bird3 = new Bomb();
		Bird bird4 = new Matilda();

		// --Obstacle--
		// -pig-
		Pig pig1 = new Pig(2, 2, 11, 4);
		Pig pig2 = new Pig(2, 2, 11, 1);
		// -block
		Wood block1 = new Wood(1, 2, 9.5, 1, false);
		Wood block2 = new Wood(4, 1, 11, 2.5, true);
		Wood block3 = new Wood(1, 2, 12.5, 1, false);
		Glass block4 = new Glass(2, 2, 14.5, 3.5, true);
		Stone block5 = new Stone(1, 3, 14.5, 1.5, false);
		Glass block6 = new Glass(1, 1, 13.5, 0.5, false);
		Glass block7 = new Glass(1, 1, 15.5, 0.5, false);
		
		// action game
		pig1.equipHat();
		bird1.attack(pig1);
		bird1.specialMove(pig1); 
		bird2.attack(pig1);
		
		bird3.attack(block2);
		// bombing in areas
		bird3.specialMove(block3);
		bird3.specialMove(block2);
		bird3.specialMove(block1);
		bird3.specialMove(pig2);
		
		//perhitungan score
		if(pig1.isDie()) {
			dieCount++;
			score += 500;
		}
		if(pig2.isDie()) {
			dieCount++;
			score += 500;
		}
		if(block1.isDie())
			score += 100;
		if(block2.isDie())
			score += 100;
		if(block3.isDie())
			score += 100;
		if(block4.isDie())
			score += 50;
		if(block5.isDie())
			score += 150;
		if(block6.isDie())
			score += 50;
		if(block7.isDie())
			score += 50;
		if(!bird1.isAttacking() && dieCount == 2)
			score += 200;
		if(!bird2.isAttacking() && dieCount == 2)
			score += 200;
		if(!bird3.isAttacking() && dieCount == 2)
			score += 200;
		if(!bird4.isAttacking() && dieCount == 2)
			score += 200;
		System.out.println("SCORE = " + score);
		
		if(dieCount == 0) {
			System.out.println("STAR = " + star);
			gameOver();
		}
		else if(dieCount == 1) {
			star = 1;
			System.out.println("STAR = " + star);
			gameOver();
		}
		else if(dieCount == 1 && score > 1000) {
			star = 2;
			System.out.println("STAR = " + star);
			gameOver();
		}
		else if(dieCount == 2) {
			star = 3;
			System.out.println("STAR = " + star);
			score = 0;
			dieCount = 0;
			star = 0;
			level2();
		}
		
		
	}

	public static void level2() {
		System.out.println("=========Level 2=========");
		// Initializing Component
		// --Bird--
		Bird bird1 = new TheBlues();
		Bird bird2 = new Chuck();
		Bird bird3 = new Chuck();

		// --Obstacle--
		// -pig-
		Pig pig1 = new Pig(2, 2, 11, 1);
		Pig pig2 = new Pig(2, 2, 14, 2);
		// -block
		Wood block1 = new Wood(1, 2, 9.5, 1, false);
		Wood block2 = new Wood(4, 1, 11, 2.5, true);
		Wood block3 = new Wood(1, 2, 12.5, 1, false);
		Glass block4 = new Glass(2, 2, 14, 0.5, true);

		// action game
		pig1.equipHat();
		pig2.equipArmor();
		bird1.attack(pig2);
		bird1.specialMove(block2);
		bird1.specialMove(pig2);
		
		bird2.attack(block2);
		bird3.attack(block1);
		bird3.specialMove(block1);

		//perhitungan score
		if(pig1.isDie()) {
			dieCount++;
			score += 500;
		}
		if(pig2.isDie()) {
			dieCount++;
			score += 500;
		}
		if(block1.isDie())
			score += 100;
		if(block2.isDie())
			score += 100;
		if(block3.isDie())
			score += 100;
		if(block4.isDie())
			score += 50;
		if(!bird1.isAttacking() && dieCount == 2)
			score += 200;
		if(!bird2.isAttacking() && dieCount == 2)
			score += 200;
		if(!bird3.isAttacking() && dieCount == 2)
			score += 200;
		System.out.println("SCORE = " + score);

		if(dieCount == 0) {
			System.out.println("STAR = " + star);
			gameOver();
		}
		else if(dieCount == 1) {
			star = 1;
			System.out.println("STAR = " + star);
			gameOver();
		}
		else if(dieCount == 1 && score > 1000) {
			star = 2;
			System.out.println("STAR = " + star);
			gameOver();
		}
		else if(dieCount == 2) {
			star = 3;
			System.out.println("STAR = " + star);
			System.out.println("=========You Win=========");
		}
		
	}
	
	public static void main(String[] args) {
		level1();
	}
}
