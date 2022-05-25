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
		System.out.println("酒好き" + m.name + "を生み出しました！");
		h.sit(50);
		System.out.println(h.hp);
		h.slip();
		System.out.println(h.hp);
		h.sit(5);
		System.out.println(h.hp);
		h.run();
		
		m.slip();
		System.out.println(m.hp);
		m.sleep();
		System.out.println(h.hp);
		System.out.println(m.hp);
		
	}

}

