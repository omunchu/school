package chap11;

public class Dog {

	public static String name = "犬";

	public int eatCount = 3;

	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		Dog.name = name;
	}
	public int getEatCount() {
		return eatCount;
	}
	public void setEatCount(int eatCount) {
		this.eatCount = eatCount;
	}



}
