package javaStudy;

public class LedTV implements TV {

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("�Ѵ�");
	}

	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("������ �����ϴ�");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("ä���� �ٲٴ�");
	}

}
