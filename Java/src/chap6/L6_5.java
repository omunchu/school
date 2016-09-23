package chap6;
import java.util.Scanner;
public class L6_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for(int i = 0 ; i < n ; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("a = {");
		for(int i = 0 ; i < n ; i++){
			System.out.print(a[i]);
			if(i == n -1){
				break;
			}
			System.out.print(", ");
		}


		System.out.print('}');


		stdIn.close();

	}

}
