package chap10;

class Static{
//	private static int s;
//	private int a;
//
//
//	public static void m1(){
//	}
//
//	public 		void f1(){
//	}
//
//	public static void m2(int x){
//		s = x;
////		a = x;
//		m1();
////		f1();
//	}
//
//	public void f2(int x){
//		s = x;
//		a = x;
//		m1();
//		f1();
//		System.out.println("s = " + s + "  a = " + a );
//	}
//}
//
//public class StaticTester {
//
//	public static void main(String[] args) {
//		Static c1 = new Static();
//		Static c2 = new Static();
//
//		Static.m2(5);
//		c1.f2(10);
//		c2.f2(20);
//	}
	private static int count;
	private         int sum;

	public static void countUp() {
		count++;
	}

	public         void sumUp() {
		sum++;
	}

	public static void setCount(int x){
		count = x;
//		sum   = x;
		countUp();
//		sumUp();
	}

	public void setSum(int x){
		count = x;
		sum   = x;
		countUp();
		sumUp();
	}

	public static int getCount() {
		return count;
	}

	public int getSum() {
		return sum;
	}
}

public class StaticTester {

	public static void main(String[] args) {
		Static c1 = new Static();
		Static c2 = new Static();

		Static.setCount(5);
		c1.setSum(10);
		System.out.println("count = " + Static.getCount() + "  sum = " + c1.getSum());
		c2.setSum(20);
		System.out.println("count = " + Static.getCount() + "  sum = " + c2.getSum());
	}
}
