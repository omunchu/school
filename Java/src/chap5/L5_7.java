package chap5;

public class L5_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		float sum = 0.0F;

		for (int i = 0;i <=1000 ;i++){
			float x = (float)i / 1000;
			System.out.print("x = " + x);
			System.out.println(" x^2 =" + (x * x));
			sum += x;
		}
		System.out.printf("%3.1f" , sum);
	}

}
