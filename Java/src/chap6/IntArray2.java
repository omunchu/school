package chap6;

public class IntArray2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a = new int[5];

		for(int i = 0 ; i < a.length ; i ++){
			a[i] = i + 1;
		}

		for(int i = 0 ; i < a.length ; i ++){
			System.out.println("a[" + i + "] = " + a[i]);
		}


	}

}
