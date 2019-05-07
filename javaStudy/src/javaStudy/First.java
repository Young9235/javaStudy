package javaStudy;
import java.util.Random;

class Person {
	int eye;		
	String name;	
	float height;
	float weight;
}



public class First {
	/**
	 * 이 함수는 값을 입력 받은 후 XX연산 실행 후 정수 값 반환
	 */
	public void func() {
		
	}
	
	// main 입력  : ctrl + space
	public static void main(String[] args) {
		First f = new First();
		f.func();
		Person p = new Person();		//메모리상에 만들어지는 것, 인스턴스 p에 주소값이 들어간다.
										//그주소값이 가르키는 메모리에 eye, name, height, weight층이 있다.
		
		Random r = new Random();
		
		//int a = p.eye;
		
		// 0.0 <= x < 1.0
		double r1 = Math.random() * 6;		//0.0 ~ 5.9999999.... 중 하나의 숫자가 튀어나옴
		r1 = r1 + 1;
		int num = (int) r1;
		System.out.println(num);
		
		int num1 = (int) (Math.random() * 6 + 1);
		//
		long ut = System.currentTimeMillis();
		System.out.println(ut);
	}
}
