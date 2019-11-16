package com.exam.stream;

import java.io.FileInputStream;

public class FileInputTest01 {
	public static void main(String[] args) {
		
		FileInputStream in = null;
		
		try {
			//test.txt 이름의 파일을 읽는다
			in = new FileInputStream("test.txt");
			
			int i = 0;
			
			while((i=in.read()) != -1) {
				/**
				 * 파일을 byte단위로 읽어온다는 의미는
				 * 파일의 char(문자)를 아스키 값으로 받아온다는 것이며
				 * 출력할때 i값을 char형으로 변환해야
				 * 아스키값에 대응하는 문자를 출력받을 수 있습니다
				 */
				System.out.print((char)i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
