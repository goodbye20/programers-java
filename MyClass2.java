package javaStudy;

public class MyClass2 {
	public int plus(int x , int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {//매개변수 수가 다름
		return x + y + z;
	}
	
	public String plus(String x, String y) {//타입이 다름
		return x + y;
	}
	//오버로딩을 할떄는 타입이 다르거나 매개변수의 수가 달아야함
	
//	public int plus(int i, int p) {
	//매개변수의 이름(i,p)는 중요하지않고 제일 상단 메소드와 타입이 같기에 오류발생
	
	
}
