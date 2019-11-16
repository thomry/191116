package com.exam.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class KeyInputTest03 {

	public static void main(String[] args) {
		
		FileInputStream input = null;
		
		try {
			//화면에 표기하고자 하는 파일을 선택합니다.
			File file = new File("test.txt");
			input = new FileInputStream(file); // input stream을 선언합니다.
			int readBuffer = 0;
			
			// 버퍼 사이즈가 클수록 빠릅니다
			// 한번에 512byte 단위 처리
			byte [] buffer = new byte[512];
			
			// readBuffer는 팡일 읽는 위치. -1이면 끝에 다다른 것입니다.
			while((readBuffer = input.read(buffer)) != -1) {
				/**
				 * println이 아닌 이유는,
				 * byte배열로 받기때문입니다.
				 * write(버퍼배열, off, length);
				 */
				System.out.write(buffer, 0, readBuffer);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
		}

	}

}
