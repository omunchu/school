package chap6;

public class L6_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double[] d = new double[5];

		for(int i = 0 ; i < d.length ; i ++){
			d[i] = (i + 1) * 11 / 10d;	//	10dの演算が出来るまではint型なので、端数が出ない
		}

		for(int i = 0 ; i < d.length ; i ++){
			System.out.println("d[" + i + "] = " + d[i]);
		}
	}

}
