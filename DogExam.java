package javaStudy;

public class DogExam {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		
//    	Animal a = new Animal();
		Animal a = new Dog(); //부모타입으로 자식객체를 참조할떄 묵시적으로 형변환됨.
		a.cute();
//		a.walwal();
		
		Dog dog = (Dog)a; //dog타입으로 형변환
		dog.walwal();
		dog.cute();

// 객체를 생성할떄 반드시 생성자를 실행하고서 생성된다.
// 생성자를 호출하는것은 객체를 초기화하는것인데
// 생성자를 호출할떄 자동으로 부모의 *기본 생성자*를 호출하며 부모의 객체도 초기화함
//           ->  컴파일될떄  자동으로 super(); 생성
//나를 가르키는것은 this, 부모를 가르키는것은 super
	}
}

//자식은 부모의 메소드를 가져다 쓸수있지만, 부모님 본인이 가지고있는 메소드만 사용가능