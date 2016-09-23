package chap10;

public class MinMax {

	public static int max(int a , int  b , int c){
		int ret;
		ret = Math.max(Math.max(a, b), c);

		return ret;
	}

	public static int min(int a , int  b , int c){
		int ret;
		ret = Math.min(Math.min(a, b), c);

		return ret;
	}

	public static int max(int a[]){
		int ret = a[0];

		for(int i = 1  ; i < a.length ; i++ ){
			ret = Math.max(ret, a[i]);
		}

		return ret;
	}

	public static int min(int a[]){
		int ret = a[0];

		for(int i = 1  ; i < a.length ; i++ ){
			ret = Math.min(ret, a[i]);
		}

		return ret;
	}


}
