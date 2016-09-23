package lesson;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i < 5 ; i++){
			list.add(i);
//			System.out.println(list.get(i));
		}
		Collections.reverse(list);

		for(int i : list){
			System.out.println(i);
		}


	}

}
