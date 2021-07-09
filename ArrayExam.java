package javaStudy;

public class ArrayExam {

	public static void main(String[] args) {
		int[] array1 = new int[100];//배열은 처음 만들어진 크기가 변하지않음
		                            //방법1
		array1[0] = 50;
		array1[10] = 100;
		int value = array1[10];
		System.out.println(value);
		
		int[] array2 = new int[] {1,2,3,4,};//방법2
		
		int[] array3 = {1,2,3,4};//방법3
		
		System.out.println(array3[3]);
		int value2 = array3[0];
		
		System.out.println(value2);
	}
}
