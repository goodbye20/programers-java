package javaStudy;

public class LedTV implements TV {

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("켜다");
	}

	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 조절하다");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널을 바꾸다");
	}

}
