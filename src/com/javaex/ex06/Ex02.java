package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg");
		/*
		System.out.println(a.concat(b)); //concat 더하기
		System.out.println(a); //원본이 바뀌지않음
		System.out.println(a+b); //같은맥락
		*/
		a = a.concat(b); //값을 직접 넣어주므로 바뀜
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a.trim()); //해당값이 가지고있는 문자열의 공백을 사라지게함
		System.out.println("__"+a+"__");
		
		a = a.replace("ab","12");
		System.out.println(a); //자릿수 상관없이 해당 값을 바꾼다
		
		System.out.println("==============");
		
		String[] sArray = a.split(",");
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println(a);
		
		String str = "Hello java!"; //총 11칸의 배열
		String result = str.substring(1); //해당 배열값부터 뒤까지 잘라낸다
		System.out.println(result);
		
		String result02 = str.substring(1,3); //해당값부터 해당값까지 x~y
		System.out.println(result02);
		
		char result03 = str.charAt(8); // 해당번호 값만 출력
		System.out.println(result03);

	}

}
