package com.windows;

public class MineDemo {

	public static void main(String[] args) {
		GoldMine mine = new GoldMine();
		Barracks barrack = new Barracks(mine);
		
		try {
			barrack.barracks.join();
		} catch (InterruptedException e) {}
		
		System.out.println("\nИгра закончена");
		
	}

}
