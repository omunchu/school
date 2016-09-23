package chap7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinList {
	static int min(int a , int b){
		return a < b ? a : b ;
	}

	static int min(int a , int b , int c){
//		int min = a;
//		if(b > min){
//			min = b;
//		}
//		if(c > min){
//			min = c;
//		}

		return min(a , min(b , c));
	}

	static int min(List<Integer> a){
		int min = a.get(0);
		for(int i = 1 ; i < a.size() ; i++){
			if(min > a.get(i)){
				min = a.get(i);
			}
		}
		return min;
	}



	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("xの値：");
		int x = stdIn.nextInt();
		System.out.print("yの値：");
		int y = stdIn.nextInt();
		System.out.print("zの値：");
		int z = stdIn.nextInt();

		List<Integer> a = Arrays.asList(new Integer[] { x , y , z});

		System.out.println(x + "," + y + "の最小値は" + min(x , y) + "です。");
		System.out.println(x + "," + y + "," + z + "の最小値は" + min(x , y, z) + "です。");
		System.out.println("List a[" + a.get(0) + "," + a.get(1) +  "," + a.get(2) + "]の最小値は" + min(a) + "です。");
		stdIn.close();
	}

}
