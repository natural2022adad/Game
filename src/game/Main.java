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
	}

}

