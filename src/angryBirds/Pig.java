package angryBirds;

/** @author Nugraha1313 May 16, 2022 8:22:16 PM **/

public class Pig extends Obstacle implements Enemy{

	private boolean equippedHat, equippedArmor;
	
	public Pig(double width, double height, double x, double y) {
		super("Pig", "Hijau", width, height, x, y, 1);
	}
	
	//equip hat cmn bisa 1 kali
	@Override
	public void equipHat() {
		if(!isEquippedHat() && !isEquippedArmor() && !isDie()) {
			setLife(getLife() + 1);
			equippedHat = true;
			System.out.println(getName()+ " Equip Hat (Life = " + getLife() + ")");
		}
		else if(isEquippedHat())
			System.out.println("Hat Sudah Dipakai");
		else if(isEquippedArmor())
			System.out.println("Tidak bisa menggunakan hat, karena sudah memakai armor");
		else if(isDie())
			System.out.println("Tidak Bisa menggunakan hat, karena " + getName() + " mati");
	}

	@Override
	public void equipArmor() {
		if(!isEquippedHat() && !isEquippedArmor() && !isDie()) {
			setLife(getLife() + 2);
			equippedArmor = true;
		}
		else if(isEquippedHat())
			System.out.println("Hat Sudah Dipakai");
		else if(isEquippedArmor())
			System.out.println("Tidak bisa menggunakan hat, karena sudah memakai armor");
		else if(isDie())
			System.out.println("Tidak Bisa menggunakan hat, karena " + getName() + " mati");
	}
	
	public boolean isEquippedHat() {
		return equippedHat;
	}

	public boolean isEquippedArmor() {
		return equippedArmor;
	}

}
