package Lesson0914;

import java.util.ArrayList;
public class Sample {
	static String[] countNames(String[] names){

		int[] counts = new int[names.length];
		for(int index = 0 ; index < names.length ; index++){
			int count = 0;
			String target = names[index];
			for(int i = index ; i < names.length; i++){
				if(target.equals(names[i])){
					count++;
				}
			}
			counts[index] = count;
		}

		boolean[] isOk = new boolean[names.length];
		for(int index = 0 ; index < names.length; index++){
			String target = names[index];
			isOk[index] = true;
			int i = index - 1;
			while(i >= 0){
				if(target.equals(names[i--])){
					isOk[index] = false;
					break;
				}
			}
		}


		ArrayList<String> a = new ArrayList<String>();
		int max = -1;
		for (int index = 0; index < names.length; index++) {
			max = Math.max(max, counts[index]);
		}
		for (int count=max ; count > 0 ; count--){
			for ( int index =0; index<names.length; index++){
				if (counts[index] == count){
					if (isOk[index]) {
						a.add(names[index] + " " + counts[index]);
					}
				}
			}
		}
//		for(int index = 0 ; index < names.length ; index++){
//			if(isOk[index]){
//				a.add(names[index] + " " + counts[index]);
//			}
//		}

		String[] ret = (String[]) a.toArray(new String[a.size()]);


		System.out.print("counts = {");
		for(int aa : counts){
			System.out.print(aa + ",");
		}
		System.out.println("}");

		System.out.print("isOk = {");
		for(boolean aa : isOk){
			System.out.print(aa + ",");
		}
		System.out.println("}");

		System.out.print("結果 = {");
		for(String aa : ret){
			System.out.print(aa + ",");
		}
		System.out.println("}");


		return ret;
	}

	static String[][] countNamesOption(String[] names){
		return new String[1][];
	}
}
