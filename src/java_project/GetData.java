package java_project;

import java.util.Scanner;

public class GetData {
	Scanner sc = new Scanner(System.in);
	String name;
	int num;
	
	public void getName() {
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next();
	}
	
	public void getNumber() {
		System.out.print("�й��� �Է��ϼ���: ");
		num = sc.nextInt();
	}
}
