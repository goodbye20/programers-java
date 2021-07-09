package javaStudy;

public class InnerExam1 {
	class Cal{
			int value = 0;
			public void plus() {
				value++;
			}
			//필드안에서 클래스를 또 선언해서 사용하는경우 (인스턴스 클래스)
	}
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();
		InnerExam1.Cal cal = t.new Cal();
		//cal 이라는 내부의 객체를 사용하려면 
		//외부의클래스명.타입 변수명 = 이렇게
		cal.plus();
		System.out.println(cal.value);
	}
	
}
