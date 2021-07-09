package javaStudy;

public class ForEachExam {

	public static void main(String[] args) {
		int[] iarr = {10,20,30,40,50};
		
		for(int i = 0; i < iarr.length; i++) {
			int value = iarr[i];
			System.out.println(value);
		}
		
		for(int value:iarr) {
			System.out.println(value);
			//for은 3줄로 표현해야할걸 간결하게
			//알아서 돌면서 다 인식
		}
		
	}
}
