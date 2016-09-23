package chap8;

import java.util.Scanner;
public class Car {
	/** 名前 */
	private String name;
	/** 幅 */
	private int width;
	/** 高さ */
	private int height;
	/** 長さ */
	private int length;
	/** 現在位置X座標 */
	private double x;
	/** 現在位置Y座標 */
	private double y;
	/** 残り燃料 */
	private double fuel;
	/** 移動時間 */
	private double time;


	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getFuel() {
		return fuel;
	}

	/** スペック表示 */
	void putSpec() {
		System.out.println("名前:" + name);
		System.out.println("車幅" + width + "mm");
		System.out.println("車高" + height + "mm");
		System.out.println("車長" + length + "mm");
	}

	/**
	 * X方向にdx、Y方向にdy分移動する
	 * @param dx X方向
	 * @param dy Y方向
	 * @return 燃料が足りているので移動した=true/燃料不足=false
	 */
	boolean move(double dx, double dy) {
		boolean ret = true;

		double dist = Math.sqrt(dx * dx+dy * dy);
		if (dist > fuel) {
			ret = false;
		} else {
			fuel -= dist;
			x += dx;
			y += dy;
		}
		return ret;

	}


	void getTime(){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("X方向の移動距離：");
		double dx = stdIn.nextDouble();
		System.out.print("Y方向の移動距離：");
		double dy = stdIn.nextDouble();
		System.out.print("平均速度：");
		double speed = stdIn.nextDouble() / 60;

		time = Math.sqrt(dx * dx + dy * dy) * speed;


		System.out.println("X方向に" + dx + "Y方向に" + dy + "移動すると" + time + "分掛かります。");

		stdIn.close();
	}

}
