package game;

public class Main 
{
	
	public static void main(String[] arg) 
	{
		// ココからスタート現実世界
		Hero h = new Hero();
		
		h.name = "あだち";
		h.hp = 1000;
		System.out.println("プログラマー" + h.name + "を生み出しました！");
		
		Hero m = new Hero();
		
		m.name = "あだちん";
		m.hp = 50;
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.Suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.Suffix = 'B';
		
		System.out.println("酒好き" + m.name + "を生み出しました！");
		h.sit(50);
		System.out.println(h.hp);
		m1.run();
		m2.run();
		h.run();
		
		m.slip();
		System.out.println(m.hp);
		m.sleep();
		System.out.println(h.hp);
		System.out.println(m.hp);
		
		Matango m3 = new Matango();
		m3.hp = 80;
		m3.Suffix = 'C';
		
		Adachan a1 = new Adachan();
		a1.hp = 1;
		a1.na = 1.0;
		a1.beer();
		
		Cleric c1 = new Cleric();
		c1.name = "はるき";
		c1.hp = 15;
		c1.mp = 10;
		System.out.println("こんにちは私は聖職者" + c1.name + "だよ");
		System.out.println(c1.hp);
		c1.selfAid();
		int r = new java.util.Random().nextInt(3);
		c1.pray(r);
		System.out.println(c1.hp);
		System.out.println(c1.mp);
		
	}

}

