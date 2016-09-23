package chap7;

import java.util.Scanner;

public class Min {
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

	static int min(int[] a){
		int min = a[0];
		for(int i = 1 ; i < a.length ; i++){
			if(min > a[i]){
				min = a[i];
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

		int[] a ={x , y , z};

		System.out.println(x + "," + y + "の最小値は" + min(x , y) + "です。");
		System.out.println(x + "," + y + "," + z + "の最小値は" + min(x , y, z) + "です。");
		System.out.println("配列a[" + x + "," + y +  "," + z + "]の最小値は" + min(a) + "です。");
		stdIn.close();
	}

}
