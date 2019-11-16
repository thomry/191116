package com.exam.reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderTest02 {
	public static void main(String[] args) {
		FileReader  reader = null;
		BufferedReader buf = null;
		
		try {
			reader = new FileReader("test.txt");
			buf = new BufferedReader(reader);
			
			String str = null;
			
			while((str=buf.readLine()) != null) {
				// 라인단위로 읽기때문에 println사용합니다
				System.out.println(str);
			}
			reader.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
