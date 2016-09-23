package chap6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class ExpL6_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		ArrayList<Integer> a = new ArrayList<Integer>();

		System.out.print("要素数：");
		int n = stdIn.nextInt();

		for(int i = 0 ; i < n ; i ++){
			a.add(rand.nextInt(10) + 1);
		}

		System.out.println(a);

		stdIn.close();
	}

}
