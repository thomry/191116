package com.exam.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterTest02 {
	public static void main(String[] args) {
		
		FileWriter  writer = null;
		BufferedWriter buf = null;
		
		try {
			writer = new FileWriter("test02.txt");
			buf    = new BufferedWriter(writer);
			buf.write("홍길동");
			buf.write(" 율도국");
			buf.newLine(); // 라인변경
			buf.write("English");
			
			buf.flush();
			buf.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("파일생성 완료");

	}

}
