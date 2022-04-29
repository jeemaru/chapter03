package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj.getClass()); //클래스정보
		System.out.println(obj.hashCode()); //hashCode <-- obj의 주소?
		System.out.println(obj.toString()); //java.lang.Object@515f550a
		System.out.println(obj.equals(obj)); //같냐
		System.out.println("========================================");
		
		System.out.println("obj.getClass()==========================");
		System.out.println(obj.getClass()); // 어디에 속해있는지
		
		System.out.println("obj.hashCode()==========================");
		//메모리 주소값에 대응되는 중복되지 않는 값
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		
		System.out.println("obj.toString()==========================");
		//객체의 값 정보를 문자열로 리턴
		System.out.println(obj.toString());
		
		System.out.println("obj.equals()==========================");
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj03));
		
	}

}
