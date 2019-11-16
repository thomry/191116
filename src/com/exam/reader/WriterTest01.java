package com.exam.reader;

import java.io.FileWriter;
import java.io.InputStreamReader;

public class WriterTest01 {

	public static void main(String[] args) {
		
		FileWriter writer = null;
		InputStreamReader in = null;
		
		try {
			/*
			 * true이면 기존파일에 추가, 파일이 엇ㅂ으면 새로 생성
			 * false면 무조건 새로 생성합니다.
			 */
			writer = new FileWriter("test01.txt",true);
			
			in = new InputStreamReader(System.in);
			int i = 0;
			while((i=in.read()) != -1) {
				writer.append((char)i);
				writer.flush();
			}
			writer.close();
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
