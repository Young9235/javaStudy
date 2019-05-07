package inheritance.car;

import inheritance.Driver;

public class CarMain {
	public static void main(String[] args) {
		Driver d = new Driver();	// 차를 운전(action)하는 사람	
		Ray r = new Ray();		// Ray는 Car의 자식
		//드라이버는 차면 다 운전이 가능하다.
		d.action(r);
	}
}
