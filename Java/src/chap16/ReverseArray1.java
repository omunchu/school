package chap16;

import java.util.Scanner;

public class ReverseArray1 {

	static void swap(int[] a , int idx1 , int idx2){
		try{
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("メソッドswap内で不正な添字を検出しました。");
			System.out.println("プログラムを終了します。");
			System.exit(1);
		}
	}

	static void reverse(int[] a){
		for(int i = 0 ; i < a.length ; i++){
			swap(a, i , a.length - i - 1);
		}
	}


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int num = stdIn.nextInt();

		int[] x = new int[num];

		for(int i = 0 ; i < num ; i++){
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		reverse(x);

		System.out.println("要素の並びを反転しました。");
		for(int i = 0 ; i < num ; i++){
			System.out.println("x[" + i + "] = " + x[i]);
		}
		stdIn.close();

	}

}
