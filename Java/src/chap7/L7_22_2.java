package chap7;

import java.util.ArrayList;
import java.util.Scanner;
public class L7_22_2 {

	static ArrayList<Integer> arrayClone(ArrayList<Integer> a){
		ArrayList<Integer> temp = new ArrayList<Integer>(a.size());
		for(int i = 0 ; i < a.size() ; i++){
			temp.add(a.get(i));
		}
		return temp;

	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		ArrayList<Integer> a = new ArrayList<Integer>();

		System.out.println("要素数をいくつにしますか：");
		int na = stdIn.nextInt();
		for(int i = 0 ; i < na ; i++){
			System.out.print("a.add(" + i + ")：");
			a.add(stdIn.nextInt());
		}

		ArrayList<Integer> b = arrayClone(a);

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
