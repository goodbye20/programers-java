package javaStudy;

public class ExceptionExam3 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		int k = divide(i, j);
		System.out.println(k);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}

		public static int divide(int i,int j) throws IllegalArgumentException {
			if(j == 0) {
				throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
				}
			int k = i/j;
			return k;
		}
		//throw 로 강제 오류를 발생시키며 보통 throws로 호출하는곳으로 예외(오류)를
		//넘겨 한곳에서 오류를 처리하고 관리할수 있도록함.
		
		//*throw로 오류를 발생시킬떄 꼭 new를 붙여써줘야함*
	
}
