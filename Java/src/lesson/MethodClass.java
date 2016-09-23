package lesson;

import java.util.Random;

public class MethodClass {
	Random rand = new Random();



	private String name;
	private int hitPoint;
	private int attack;
	private int resilience;


	public MethodClass(String name ,int hitPoint, int attack, int resilience) {
		this.name = name;
		this.hitPoint = hitPoint;
		this.attack = attack;
		this.resilience = resilience;
	}


	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;

	}

	public int getHitPoint() {
		return hitPoint;
	}


	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getResilience() {
		return resilience;
	}


	public void setResilience(int resilience) {
		this.resilience = resilience;
	}


	void status(){
		System.out.println("名前：" + name);
		System.out.println("HP：" + hitPoint);
		System.out.println("攻撃力：" + attack);
		System.out.println("回復力：" + resilience);
	}

	void attack(String a){
		System.out.println(name + "の攻撃！");
		int damage = rand.nextInt(100) * 10;
		System.out.println(a + "に" + damage + "のダメージ！");


	}



}
