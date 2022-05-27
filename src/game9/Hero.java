package game9;

public class Hero {
	String name;
	int hp;
	Sword sword;
	int age;
	//コンストラクタ
	public Hero(String name,int age) {
		this.hp = 100;
		this.name = name;
		this.age = age;
	}
	public Hero() {
		this.hp = 100;
		this.name = "名無し";
		this.age = 20;
	}
	
	public void attack() {
		System.out.println(this.name  + "は、"+ this.sword.name +  "で攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
	
	

}
