package game9;

public class Main {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h1 = new Hero("ミナト", 35);

		h1.sword = s;
		System.out.println("現在の武器は" + h1.sword.name);
		h1.attack();
		
		Hero h2 = new Hero("アサカ", 25);
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		
		Hero h = new Hero("アダチん", 41);
		Hero h4 = new Hero();
		System.out.println(h.name + h.age + "歳HP" + h.hp);
		System.out.println(h1.name + h1.age + "歳HP" + h1.hp);
		System.out.println(h2.name + h2.age + "歳HP" + h2.hp);
		System.out.println(h4.name + h4.age + "歳HP" + h4.hp);
		
	}

}
