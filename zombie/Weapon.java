package week08;

public abstract class Weapon {

	int damage; // how much blood we take from zombie
	int durability; // izdrujlivost

	public Weapon(int damage, int durability) {

		this.damage = damage;
		this.durability = durability;
	}
	
	public abstract int hit();
}
