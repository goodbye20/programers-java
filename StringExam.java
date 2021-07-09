package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		
		//String은 특별하게도 new를 쓰지않아도 문제가 없다.
		//str2는 이미 생성된 상수인스턴스에 hello가 있기에 더이상 생성을 하지않는다
		//위에 str1 은 str2 는 같은 상수 hello를 가르킨다
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		//하지만 new를 쓰게되면 반드시 새로운 메모리공간을 생성하고 거기에 인스턴스를 만든다.

		if(str1 == str2)
			System.out.println("str1과 str2는 같은 래퍼런스입니다");
		
		if(str1 == str3)
			System.out.println("str1과 str3는 같은 래퍼런스입니다");
		
		if(str3 == str4)
			System.out.println("str3와 st4는 같은 래퍼런스입니다");
		
		System.out.println(str1);
		//String은 한번 선언한 클래스는 변하지않는다
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
					
					
	}

}
