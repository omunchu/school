package chap7;

public class L7_21 {

	static void aryExchange(int[] a , int[] b){
		for(int i = 0 , t = 0 ; i < a.length ; i++){
			t    = a[i];
			a[i] = b[i];
			b[i] = t   ;
		}
//		int[] t = a;
//		a = b;
//		b = t;
	}
	public static void main(String[] args) {
		int[] a = {1 , 2 , 3 , 4 , 5};
		int[] b = {5 , 4 , 3 , 2 , 1};

		aryExchange(a , b);

		System.out.print("a = {");
		for(int aa :a){
			System.out.print(aa + ",");
		}
		System.out.println("}");

		System.out.print("b = {");
		for(int bb : b){
			System.out.print(bb + ",");
		}
		System.out.println("}");

	}

}
