package javaStudy;

public class DogExam {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		
//    	Animal a = new Animal();
		Animal a = new Dog(); //�θ�Ÿ������ �ڽİ�ü�� �����ҋ� ���������� ����ȯ��.
		a.cute();
//		a.walwal();
		
		Dog dog = (Dog)a; //dogŸ������ ����ȯ
		dog.walwal();
		dog.cute();

// ��ü�� �����ҋ� �ݵ�� �����ڸ� �����ϰ� �����ȴ�.
// �����ڸ� ȣ���ϴ°��� ��ü�� �ʱ�ȭ�ϴ°��ε�
// �����ڸ� ȣ���ҋ� �ڵ����� �θ��� *�⺻ ������*�� ȣ���ϸ� �θ��� ��ü�� �ʱ�ȭ��
//           ->  �����ϵɋ�  �ڵ����� super(); ����
//���� ����Ű�°��� this, �θ� ����Ű�°��� super
	}
}

//�ڽ��� �θ��� �޼ҵ带 ������ ����������, �θ�� ������ �������ִ� �޼ҵ常 ��밡��