package chap7;

import java.util.Scanner;

public class L7_22 {

	static int[] arrayClone(int[] a){
		int[] temp = new int [a.length];
//		for(int i = 0 ; i < a.length ; i++){
//			temp[i] = a[i];
//		}
		int i = 0;
		for(int aa : a){
			temp[i++] = aa;
		}
		return temp;

	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("配列a[]の要素数：");
		int na = stdIn.nextInt();

		int[] a = new int[na];

		for(int i = 0 ; i < a.length ; i++){
			System.out.print("a[" + i + "]：");
			a[i] = stdIn.nextInt();
		}

		int[] b = arrayClone(a);

		System.out.println("配列aをbにコピーしました。");
		System.out.print("b = {");
		for(int bb : b){
			System.out.print(bb + ",");
		}
		System.out.println("}");
		System.out.println(a.hashCode() + "：" + b.hashCode());

		stdIn.close();
	}

}
