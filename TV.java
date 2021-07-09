package javaStudy;

public interface TV {
	public int MIN_VOLUME=0;
	public int MAX_VOLUME=100;
	
	
	public void trunOff();
	public void trunOn();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}

//인터페이스란 객체를 선언하기전에 어떤어떤 기능들을 가지고 있었으면 좋겠다.해서 기능만 
//구현해 두는것
