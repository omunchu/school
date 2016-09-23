package chap6;

public class Ex03 {

	public static void main(String[] args) {
		int[] a = {1 , 2 , 3 , 4 , 5};
		int[] b = {1 , 2 , 3 , 4 , 5};

		a = b;

		if(a == b){
			System.out.println("一致");
		}else{
			System.out.println("不一致");
		}
		System.out.print("a = ");
		for(int i = 0 ; i < a.length ; i++){
			System.out.print(a[i] + ",");
		}
		System.out.print("\nb = ");
		for(int i = 0 ; i < a.length ; i++){
			System.out.print(a[i] + ",");
		}
	}

}
