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
		
		m.name = "あだちゃん";
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
		
	}

}

