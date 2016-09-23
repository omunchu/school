package chap7;


public class L7_1 {
	static int signOf(int n){
		int ret = 0;
		if(n > 0){
			ret = 1;
		}else if(n < ret){
			ret = -1;
		}
		return ret;
		}

	public static void main(String[] args) {

		int param = -10;
		System.out.printf("引数 = %4d 戻り値 = %d\n"  ,  param , signOf(param));

		param = 0;
		System.out.printf("引数 = %4d 戻り値 = %d\n"  ,  param , signOf(param));

		param = 10;
		System.out.printf("引数 = %4d 戻り値 = %d\n"  ,  param , signOf(param));

	}

}
