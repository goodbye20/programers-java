package javaStudy;

public class EnumExam {
//����    ----- >> Ư������ ������ ���� �ϰ������
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
		//gender1�� string�� ���� ���̱⿡ �ٸ� ���� �־ ������ �ȳ�
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy;"
	}
}
enum Gender{
	MALE,FEMALE;
	//�̷��� ���Ÿ� �������ν� ���� gender2 ������� gender2�� ���� ������ ����������
	//gender2�� Gender��� ������ ������ ������⿡ �ٸ� ���� ����������
}
	