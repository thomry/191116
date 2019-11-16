package com.exam.stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyInputTest02 {
	public static void main(String[] args) {
		InputStreamReader isr = null; // 키보드 입력
		isr = new InputStreamReader(System.in); // 입력장치. 즉, 키보드로 읽겠다는 뜻입니다.
		
		//보조스트림 buffer 메모리를 사용하여 기능 향상 목적으로 사용
		BufferedReader r = new BufferedReader(isr);
		
		try {
			String s = null;
			while(true) {
				/**
				 * 라인으로 읽기
				 * scanner의 nextLine()처럼
				 * buffer flush기능도 있습니다.
				 */
				String str = r.readLine();
				if(str.equals("q")) {
					break;
				}
				System.out.println(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
