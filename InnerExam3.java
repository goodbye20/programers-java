package javaStudy;

public class InnerExam3 {
	
	public void exec() {
	   class Cal{
			int value = 0;
			public void plus() {
				value++;
			}
	   }
	   Cal cal = new Cal();
	   cal.plus();
	   System.out.println(cal.value);
	}
	
	public static void main(String[] args) {
		InnerExam3 t = new InnerExam3();
		t.exec();
		
		//메소드 안에서도 지역변수로 선언해서 사용가능 (지역 클래스)

	}

}
