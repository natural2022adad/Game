package game9;

public class Wizard {
	String name;
	int hp;
	int hpup = 10;
	
	public void heal (Hero h) {
		h.hp += hpup;
		System.out.println(h.name  + "のHPを" + hpup + "回復させた");
	
	}

	
}
