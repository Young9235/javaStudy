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
	 * �� �Լ��� ���� �Է� ���� �� XX���� ���� �� ���� �� ��ȯ
	 */
	public void func() {
		
	}
	
	// main �Է�  : ctrl + space
	public static void main(String[] args) {
		First f = new First();
		f.func();
		Person p = new Person();		//�޸𸮻� ��������� ��, �ν��Ͻ� p�� �ּҰ��� ����.
										//���ּҰ��� ����Ű�� �޸𸮿� eye, name, height, weight���� �ִ�.
		
		Random r = new Random();
		
		//int a = p.eye;
		
		// 0.0 <= x < 1.0
		double r1 = Math.random() * 6;		//0.0 ~ 5.9999999.... �� �ϳ��� ���ڰ� Ƣ���
		r1 = r1 + 1;
		int num = (int) r1;
		System.out.println(num);
		
		int num1 = (int) (Math.random() * 6 + 1);
		//
		long ut = System.currentTimeMillis();
		System.out.println(ut);
	}
}
