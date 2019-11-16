package com.exam.stream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileOutputTest01 {
	public static void main(String[] args) {
		
		InputStreamReader isr = null; // 키보드 입력
		// 보조스트림
		BufferedReader buf = null;
		// outputStream
		FileOutputStream out = null;
		
		try {
			// true는 파일에 내용을 계속 추가할지를 결정합니다.
			// true를 하지 않으면 내용이 지워지고 새로 쓰여집니다.
			isr = new InputStreamReader(System.in);
			// 보조스트림 buffer 메모리를 사용하여 기능을 향상하는 목적으로 사용합니다.
			buf = new BufferedReader(isr);
			out = new FileOutputStream("write.txt",true);
			
			// 한글깨짐을 방지하기위해서 인코딩
			OutputStreamWriter writer= new OutputStreamWriter(out, "UTF-8");
			
			int str = 0;
			
			// ctrl+z를 누르면 종료됩니다.
			while((str=buf.read()) != -1) {
				writer.write((char)str);	// OutPutStream에 내용을 기록합니다
				writer.flush();	// 스트림에 있는 데이터를 출력합니다
			}
			
			out.close();
			buf.close();
			isr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
