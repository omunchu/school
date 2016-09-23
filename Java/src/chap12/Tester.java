package chap12;

public class Tester {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.say();
		cat.say();

		Animal animal = dog;
		animal.say();
	}
}
