package com.windows;

public class GoldMine {
	static volatile int MineGold = 1000;
	volatile int workerGold;

	public GoldMine() {
		System.out.println("В шахте " + MineGold + " золота");
	}

	public int getMineGold() {
		return MineGold;
	}

	public int getWorkerGold() {
		return workerGold;
	}

	public void setGold() {
		if (MineGold >= 3) {
			workerGold = 3;
			MineGold -= workerGold;
		} else if (MineGold > 0) {
			workerGold = MineGold;
			MineGold -= workerGold;
		}
	}
}
