package chap6;

import java.util.ArrayList;

public class IntArrayList1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> a = new ArrayList<Integer>();

		a.add(37);
		a.add(51);
		a.add(a.get(1)*2);

		System.out.println("a.get(" + 0 + ") = " + a.get(0));
		System.out.println("a.get(" + 1 + ") = " + a.get(1));
		System.out.println("a.get(" + 2 + ") = " + a.get(2));
		System.out.println("a.size() = " + a.size());
	}

}
