package game9;

public class Wizard {
	String name;
	int hp;
	int hpup = 10;
	
	public void heal (Hero o) {
		o.hp += hpup;
		System.out.println(o.name  + "のHPを" + hpup + "回復させた");
	
	}

	
}
