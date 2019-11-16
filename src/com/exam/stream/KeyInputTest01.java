package com.exam.stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyInputTest01 {

	public static void main(String[] args) {
		
		InputStreamReader isr = null; // 키보드 입력
		isr = new InputStreamReader(System.in);
		
		// 보조스트림
		BufferedReader r = new BufferedReader(isr);
		int i = 0;
		
		try {
			// ctrl+z를 누르면 종료
			while((i=r.read()) != -1) {
				// streamReader는 문자 입력값을 아스키 코드값으로 가져오기때문에 (char)캐스팅으로 문자값으로 변경해줘야합니다.
				System.out.print((char)i);
			}
		}catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
