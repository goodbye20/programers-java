package javaStudy;

public class OperatorExam2 {

	public static void main(String[] args) {
		int i = 10; // <- 단순 대입연산
		int j = 10;
		// 비교연산
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i < j);
		System.out.println(i <= j);
		System.out.println(i > j);
		System.out.println(i >= j);
		
		i += 10; // i= i + 10;
//		복합대입연산
		System.out.println(i);
		System.out.println(i -=5);
		System.out.println(i);
		
	}
}
