package searchTeacher;

public class Pokemon {

	
	private int level;
	private String name;
	private int hp;
	private boolean poisoned;
	
	public Pokemon(String name, int level){
		hp = 100;
		this.name = name;
		this.level = level;
	}
	
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit");
		}else{
			System.out.println("The attack missed");
		}
	}

	public void iChooseYou() {
		System.out.println(name+", "+name+"!");
	}

	public int getHP() {
		return hp;
	}
	
	public String getName(){
		return name;
	}
	
	public void setHP(int newHP){
		hp = newHP;
	}

	public void setPoisoned(boolean b) {
		poisoned = true;
	}
	
	public void lapse(){
		if(poisoned)hp-=15;
	}
}