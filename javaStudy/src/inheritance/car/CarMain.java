package inheritance.car;

import inheritance.Driver;

public class CarMain {
	public static void main(String[] args) {
		Driver d = new Driver();	// ���� ����(action)�ϴ� ���	
		Ray r = new Ray();		// Ray�� Car�� �ڽ�
		//����̹��� ���� �� ������ �����ϴ�.
		d.action(r);
	}
}
