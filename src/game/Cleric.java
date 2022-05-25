package game;

public class Cleric 
{
	
	String name;
	int hp = 50;
	int mp = 10;
	
	int max_hp = 50;
	int max_mp = 10;
	public void selfAid() 
	{
		this.mp -= 3;
		this.hp = this.max_hp;
	}
	
	public void pray(int sec) 
	{
		int r = new java.util.Random().nextInt(3);
		System.out.println(r);
		int p = (sec + r);
		System.out.println(p);
		if (this.mp <= 10) 
		{
			this.mp += p; 
			if (this.mp >= 10) 
			{
				this.mp =10;
			}
		}
	}	

}
 