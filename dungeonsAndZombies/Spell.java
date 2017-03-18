package dungeonsAndZombies;

public class Spell extends Instruments{
	
	
	private int manaCost;
	private int castRange;
	
	public Spell(String name, int damage, int manaCost, int castRange) {
		super(name, damage);
		
		this.manaCost = manaCost;
		this.castRange = castRange;
	}
	
	public int getManaCost(){
		
		return manaCost;
	}
	
	public void setManaCost(int manaCost){
		
		this.manaCost = manaCost;
	}
	
	public int getCastRange(){
		
		return castRange;
	}
	
	public void setCatsRange(int castRange){
		
		this.castRange = castRange;
	}
	

}
