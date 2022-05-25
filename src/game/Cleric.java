package game;

import java.util.Random;

public class Cleric 
{
	
	String name;
	int hp = 50;
	int mp = 10;
	
	final int MAX_HP = 50;
	final int MAX_MP = 10;
	public void selfAid() 
	{
		this.mp -= 3;
		this.hp = this.MAX_HP;
	}
	
	public int pray(int sec) 
	{
		int r = new Random().nextInt(3);
		System.out.println(r);
		int p = (sec + r);
		System.out.println(p);
		if (this.mp <= MAX_MP) 
		{
			this.mp += p; 
			if (this.mp >= MAX_MP) 
			{
				this.mp = MAX_MP;
			}
		
		}
		return p;
	}

}
 