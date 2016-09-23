package chap7;

public class L7_19 {

	static void aryRmvN(int[] a , int idx , int n){
		for(int i = idx + n ; i < a.length ; i++){
			a[idx++] = a[i];
		}
	}

	public static void main(String[] args) {
		int[] a = new int[]{1, 3 , 4 , 7 , 9 , 11};

		System.out.print("{");
		aryRmvN(a , 1 , 3);
		for(int aa : a){
			System.out.print(aa + ",");
		}
		System.out.println("}");
	}

}
