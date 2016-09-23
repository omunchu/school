package chap7;

public class L7_24 {

	static int[] arrayRmvOf(int[]a , int idx){
		int[] ret = new int[a.length - 1];

		for(int src = 0 , des = 0; src < a.length ; src++){
			if(src != idx){
				ret[des++] = a[src];
			}
		}

		return ret;
	}
	public static void main(String[] args) {
		int[] a = {1, 3 , 4 , 7 , 9 , 11};

		int[] b = arrayRmvOf(a , 2);
		System.out.print("b = {");
		for(int bb : b){
			System.out.print(bb + ",");
		}
		System.out.println("}");

		System.out.println(a.hashCode() + "：" + b.hashCode());
	}

}
