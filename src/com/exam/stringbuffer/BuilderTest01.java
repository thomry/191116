package com.exam.stringbuffer;

/**
 * StringBuilder 예제
 * String은 내부구조가 배열로 되어있어
 * 문자열을 합칠 경우
 * 내부적으로 새로운 배열공간을 만들고 문자열을 만듭니다.
 * 때문에, 문자열을 합칠때마다 메모리를 사용하게 됩니다.
 * 
 * 이러한 단점을 보안하기위해서 StringBuilder 또는 StringBuffer를 사용합니다.
 * 
 * 두객체는 문자열을 만들때 버퍼공간을 만들어두고,
 * 새로운 문자열이 들어오면 확장하여 담으며,
 * 배열을 새로 만들필요없이 공간 확장이 가능합니다.
 * 
 * 처음 생성될때 배열의 공간을 8byte정도 더 만들기때문에
 * 일반 String보다 새롭게 만들어지는 횟수가 훨씬 적어집니다.
 * 
 * @author PC
 *
 */

public class BuilderTest01 {
	public static void main(String[] args) {
		
		String str = "아빠"; // 2개의 배열공간이 내부적으로 생성됩니다.
		str += "안녕!";		// 하나의 문자를 합친 것처럼 보이지만 실제로는 새로운 공간에 생성됩니다.
		StringBuilder sb = new StringBuilder(); // 문자열 합치기용 // StringBuilder(1000); - 1000byte로 늘어남
		
		/**
		 * builder가 생성될때 공간을 설정할 수 있습니다.
		 * 따라서, 문자열을 많이 받아야하는 경우에는
		 * builder생성시에 공간을 정해줍니다.
		 * 
		 * sb = new StringBuilder(size);
		 */
		
		sb.append("아빠");
		sb.append("안녕!");
		
		System.out.println(str);
		
		/*
		 * String과 Stringbuilder는 문자열을 다루나, 객체가 다릅니다.
		 * 
		 * 따라서, String에 builder의 문자열을 대입하려면,
		 * .toString(); method를 호출해야합니다.
		 */
		
		str = sb.toString();
		System.out.println(str);
		
		

	}

}
