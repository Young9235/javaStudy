package javaStudy;

public class Variable1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.printf("a�� ����? %d\n", a);

		int b = 11;
		System.out.println("b�� ����? " + b);

		// a�� ���� b�� �Է�
		// ���� a�� ���� 10�� �����
		b = a;
		System.out.println("a�� ����? " + b);
		
	}
}