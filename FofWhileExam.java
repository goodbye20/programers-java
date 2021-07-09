package javaStudy;

public class FofWhileExam {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			//초기 초기화는 한번만 그후 조건에 맞는지 후 박스안쪽 시행 그후 증감
			if(i % 2 != 0) {
				continue; //조건부가 continue를 만나면 밑에부분은 발동x 다시위로
			}             //조건부가 break를 만나면 그냥 작동을 멈추고 블록을 나감
			total = total + i;
			
		}
		System.out.println(total);
	}
}
