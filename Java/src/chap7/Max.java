package chap7;

import java.util.Scanner;

public class Max {
	static int max(int a , int b){
		return a > b ? a : b ;
	}

	static int max(int a , int b , int c){
//		int max = a;
//		if(b > max){
//			max = b;
//		}
//		if(c > max){
//			max = c;
//		}

		return max(a , max(b , c));
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("xの値：");
		int x = stdIn.nextInt();
		System.out.print("yの値：");
		int y = stdIn.nextInt();
		System.out.print("zの値：");
		int z = stdIn.nextInt();

		System.out.println("x,yの最大値は" + max(x , y) + "です。");
		System.out.println("x,y,zの最大値は" + max(x , y, z) + "です。");

		stdIn.close();
	}

}
