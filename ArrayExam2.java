package javaStudy;

public class ArrayExam2 {

	public static void main(String[] args) {
		
		int[][] array4 = new int[3][4];
		array4[0][1] = 10;
		//    세로 가로
		// 앞에[]는 정수를 담을수없는 1차원 배열 뒤에[]이 정수를 담는 2차원 배열
		int [][] array5 = new int [3][];
		array5[0] = new int[1];
		array5[0][0] = 10;
		
		int [][] array6 = {{1},{1,2},{1,2,3}};
		System.out.println(array6[0][0]);
		
		System.out.println(array6[2][2]);
		System.out.println(array6[2][1]);
	}
}
