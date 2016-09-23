package chap7;

import java.util.ArrayList;
public class L7_24_2 {

	static ArrayList<Integer> arrayRmvOf(ArrayList<Integer> a , int idx){
		ArrayList<Integer> ret = new ArrayList<Integer>();

		for(int src = 0 ; src < a.size() ; src++){
			if(src != idx){
				ret.add(a.get(src));
			}
		}

		return ret;
	}
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(4);
		a.add(7);
		a.add(9);
		a.add(11);

		ArrayList<Integer> b = arrayRmvOf(a , 2);
		System.out.print("b = {");
		for(int bb : b){
			System.out.print(bb + ",");
		}
		System.out.println("}");

		System.out.println(a.hashCode() + "：" + b.hashCode());
	}

}
