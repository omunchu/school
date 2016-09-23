package chap7;

public class L7_21_2 {

	static void aryExchange(int[] a , int[] b){
		int min = Math.min(a.length , b.length);
			for(int i = 0 , t = 0; i < min ; i++){
				t    = a[i];
				a[i] = b[i];
				b[i] = t;
		}

	}
	public static void main(String[] args) {
		int[] a = {1 , 2 , 3 , 4 , 5 , 6 , 7};
		int[] b = {5 , 4 , 3 , 2 , 1};

		aryExchange(a , b);

		printAry(a , "a");

		printAry(b , "b");

	}
	private static void printAry(int[] a , String msg) {
		System.out.print(msg + "= {");
		for(int aa :a){
			System.out.print(aa + ",");
		}
		System.out.println("}");
	}

}
