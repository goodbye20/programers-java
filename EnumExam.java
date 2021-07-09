package javaStudy;

public class EnumExam {
//열거    ----- >> 특정값만 가져다 쓰게 하고싶을떄
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
		//gender1은 string의 변수 값이기에 다른 값을 넣어도 오류가 안남
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy;"
	}
}
enum Gender{
	MALE,FEMALE;
	//이렇게 열거를 만듬으로써 위에 gender2 선언부터 gender2을 위로 가져다 쓸수있으며
	//gender2는 Gender라는 열거형 변수로 선언됬기에 다른 값을 가질수없음
}
	