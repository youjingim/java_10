package com.uj.s1;

public class ObjectTest{

	public static void main(String[] args) {
		Object obj = new Object();
/*		Object o = obj.clone();
*/		Object obj2 = new Object();
		// obj == obj2 ?   - > equals
		Boolean result = obj.equals(obj2);
		//System.out.println(result);
		String s = obj.toString();
		System.out.println(s);
		System.out.println(obj);
		//참조 변수를 프린트하면 내부에서 
		//해당클레스의 toString 이라는 메소드가 자동호출
		
		int a = obj.hashCode();
		System.out.println(a);
	}

}
