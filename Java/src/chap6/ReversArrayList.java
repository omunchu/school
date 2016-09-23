package chap6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ReversArrayList {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.print("要素数：");
		int n = stdIn.nextInt();

		for(int i = 0 ; i < n ; i++){
			a.add(10 + rand.nextInt(90));
			System.out.println("a[" + i + "] = " + a.get(i));
		}

		for(int i = 0 ; i < n / 2 ; i++){
			int t = a.get(i);
			a.set(i , a.get(n - i - 1));
			a.set(n - i - 1 , t);
		}

		System.out.println("要素の並びを反転しました。");
		for(int i = 0 ; i < n ; i++){
			System.out.println("a[" + i + "] = " + a.get(i));
		}
		stdIn.close();
	}

}
