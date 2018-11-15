package com.windows;

import java.util.concurrent.TimeUnit;

public class Worker implements Runnable {
	public GoldMine mine;
	public int gold;
	public String name;

	public Worker(String name, GoldMine mine) {
		this.mine = mine;
		this.name = name;
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (GoldMine.MineGold > 0) {
			mine.setGold();
			gold += mine.getWorkerGold();
			System.out.println("Рабочий " + name + " добыл " + gold + " золота");
			System.out.println("В шахте " + mine.getMineGold() + " золота");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
