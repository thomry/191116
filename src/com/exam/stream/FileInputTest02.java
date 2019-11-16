package com.exam.stream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileInputTest02 {
	public static void main(String[] args){
		
		FileInputStream     in     = null;
		InputStreamReader   reader = null;
		
		try {
			in     = new FileInputStream("test.txt");
		    reader = new InputStreamReader(in, "UTF-8"); // 보조 스트림 사용
			
			int i = 0;
			
			
			// 한글은 깨짐
			while((i=reader.read()) != -1) {
				System.out.print((char)i);
			}
			
			/**
			 * IO는 외부랑 통신하기때문에
			 * 그 자체가 열려있으면 메모리를 점유하게 됩니다.
			 * 그래서 사용이 끝나면 무조건 닫아주어야 낭비가 없어집니다.
			 */
			in.close();
			reader.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
