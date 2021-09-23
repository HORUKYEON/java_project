package java_project;

import java.util.Scanner;

public class GetData {
	Scanner sc = new Scanner(System.in);
	String name;
	int num;
	
	public void getName() {
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
	}
	
	public void getNumber() {
		System.out.print("학번을 입력하세요: ");
		num = sc.nextInt();
	}
}
