package com.windows;

import java.util.concurrent.TimeUnit;

public class Barracks implements Runnable {
	public GoldMine mine;
	public Worker worker;
	public Thread barracks;

	public Barracks(GoldMine mine) {
		this.mine = mine;
		barracks = new Thread(this);
		barracks.start();
	}

	@Override
	public void run() {
		for (int i = 0;; i++) {
			if (GoldMine.MineGold > 0) {
				worker = new Worker("worker " + i, mine);
				System.out.println("\nБаррак построил рабочего: " + worker.name + "\n");
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else
				break;
		}

	}

}
