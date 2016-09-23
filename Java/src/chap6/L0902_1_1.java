package chap6;

import java.util.ArrayList;

public class L0902_1_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> a = new ArrayList<Integer>();


		a.add(1);
		a.add(2);
		a.add(3);

		for(int i = 0 ; i < a.size() ; i++){
			System.out.println("a.get(" + i + ") = " + a.get(i));
		}
		System.out.println();

		a.add(4);
		a.add(5);

		for(int i = 0 ; i < a.size() ; i++){
			System.out.println("a.get(" + i + ") = " + a.get(i));
		}
	}
}
