package game;

public class Hero 
{//フィールド
	
	String name; //名前の宣言
	int hp; //hpの宣言
	
	//メソッド
	public void sleep() //動詞にする	sleep
	{ 
		this.hp = 100; //各それぞれの値
		System.out.println(this.name + "は、眠って回復した");
	}
	
	public void sit(int sec) //仮引数
	{ 
		this.hp += sec; //
		System.out.println(this.name + "は、" + sec +"秒座った");
		System.out.println("HPが、" + sec +"ポイント回復した");
	}
	
	public void slip() 
	{ 
		this.hp -= 5; 
		System.out.println(this.name + "は、転んだ");
		System.out.println("5のダメージ");
	}
	
	public void run() 
	{
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは、" + this.hp +"でした");
	}
}
