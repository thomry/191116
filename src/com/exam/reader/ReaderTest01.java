package com.exam.reader;

import java.io.FileReader;

public class ReaderTest01 {
	public static void main(String[] args) {
		FileReader reader = null;
		
		try {
			reader = new FileReader("test.txt");
			int i = 0;
			while((i=reader.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
