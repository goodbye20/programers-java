package javaStudy;

public class InnerExam2 {
	static class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
}
public static void main(String[] args) {
		InnerExam2.Cal cal = new InnerExam2.Cal();
		//static으로 외부메소드로 객체를 만들필요없이 바로 내부로 접근가능
		cal.plus();
		System.out.println(cal.value);
	}
}
