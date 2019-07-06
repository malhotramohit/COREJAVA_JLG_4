package com.gs.ilp.corejava.generics;

class Wallet {
	int id;
	String name;

	public Wallet(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Wallet wallet = (Wallet) obj;
		if (this.id == wallet.id && this.name.equals(wallet.name)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Wallet [id=" + id + ", name=" + name + "]";
	}
	

}

public class MyCollections {

	public static void main(String[] args) {

		Wallet wallet1 = new Wallet(1, "Wal1");
		Wallet wallet2 = new Wallet(1, "Wal1");
		Wallet wallet3 = new Wallet(3, "Wal3");
		Wallet wallet4 = new Wallet(4, "Wal4");
		Wallet wallet5 = new Wallet(5, "Wal5");
		
		Wallet wallet33 = new Wallet(3, "Wal3");

		
		
		Wallet[] wallets =  {wallet1,wallet2,wallet3,wallet4,wallet5};
		
		int index3 = linearSearch(wallets, wallet33);
		System.out.println(wallet3 + " is present at " + index3);


		if (wallet1.equals(wallet2)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		// List<Object[]> list =

		Integer[] array = { 4, 23, 45, 13, 67, 34, 78 };
		int num = 78;
		int index = linearSearch(array, num);
		System.out.println("Present at " + index);

		String[] names = { "mohit", "vineet", "jayadeeep", "hansnath", "khushboo" };
		String name = "khushboo";
		index = linearSearch(names, name);
		System.out.println(name + " is present at " + index);

	}

	private static <T> int linearSearch(T[] arr, T ele) {

		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(ele)) {
				index = i;
				break;
			}
		}

		return index;
	}

	// private static int linearSearch(int[] array, int num) {
	// int index = -1;
	// for (int i = 0; i < array.length; i++) {
	// if (array[i] == num) {
	// index = i;
	// break;
	// }
	// }
	// return index;
	// }

}
