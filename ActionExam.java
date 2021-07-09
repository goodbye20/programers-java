package javaStudy;

public class ActionExam {
	
	public static void main(String[] args) {
//		Action action = new MyAction();
//		//Action은 추상클래스기에 객체로 생성이안되기떄문에 자식인 MyAction으로 생성
//		action.exec();
		
		Action action = new Action() {
		//생성자 뒤 중괄호( { )	는 해당 생성자이름을 상속받은 이름없는 객체를 만듬
			@Override
			public void exec() {
				System.out.println("exec");
				
			}
		 
		};	
		action.exec();
	}
	
	

}
