package chap7;

import java.util.Scanner;

public class ArrayEqual {

	static boolean equals(int[] a , int[] b){
		boolean ret = true;
		if(a.length != b.length){
			ret = false;
		}else{
			for(int i = 0 ; i < a.length ; i++){
				if(a[i] != b[i]){
					ret =  false;
					break;
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("配列aの要素数：");
		int[] a = inputArray(stdIn , "a{");

		System.out.print("配列bの要素数：");
		int[] b = inputArray(stdIn , "b[");

		System.out.println("配列aとbは" + (equals(a , b) ? "等しいです。" : "等しくありません。"));


		stdIn.close();
	}

	private static int[] inputArray(Scanner stdIn , String msg) {
		int na = stdIn.nextInt();

		int[] a = new int[na];

		for(int i = 0 ; i < na ; i++){
			System.out.print(msg + i + "] ：");
			a[i] = stdIn.nextInt();
		}
		return a;
	}

}
