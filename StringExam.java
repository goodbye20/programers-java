package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		
		//String�� Ư���ϰԵ� new�� �����ʾƵ� ������ ����.
		//str2�� �̹� ������ ����ν��Ͻ��� hello�� �ֱ⿡ ���̻� ������ �����ʴ´�
		//���� str1 �� str2 �� ���� ��� hello�� ����Ų��
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		//������ new�� ���ԵǸ� �ݵ�� ���ο� �޸𸮰����� �����ϰ� �ű⿡ �ν��Ͻ��� �����.

		if(str1 == str2)
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�");
		
		if(str1 == str3)
			System.out.println("str1�� str3�� ���� ���۷����Դϴ�");
		
		if(str3 == str4)
			System.out.println("str3�� st4�� ���� ���۷����Դϴ�");
		
		System.out.println(str1);
		//String�� �ѹ� ������ Ŭ������ �������ʴ´�
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
					
					
	}

}
