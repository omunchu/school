package chap6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExpL6_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		ArrayList<Integer> a = new ArrayList<Integer>();

		System.out.print("要素数：");
		int n = stdIn.nextInt();

		int before = -1;
		for(int i = 0 ; i < n ; i ++){
			a.add(rand.nextInt(10) + 1);
				while(before == a.get(i)){
					a.add(rand.nextInt(9)+1);
			}
			before = a.get(i);
		}
		System.out.print('{');
		for(int i = 0 ; i < n - 1 ; i++){
			System.out.print(a.get(i) + ", ");
		}
		System.out.print(a.get(n - 1) + "}");
		stdIn.close();
	}

}
