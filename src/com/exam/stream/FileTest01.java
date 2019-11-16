package com.exam.stream;

import java.io.File;

public class FileTest01 {
	public static void main(String[] args) {
		
		File file = new File("test.txt"); // 디렉토리, 파일이름]
		
		System.out.println("파일의 경로는?		"+file.getPath());
		System.out.println("파일의 이름은?		"+file.getName());
		System.out.println("파일의 상위디렉토리는?	"+file.getParent());
		System.out.println("파일의 절대경로는?	"+file.getAbsolutePath());
		System.out.println("파일의 절대경로인가?	"+file.isAbsolute());
		System.out.println("파일이 존재하는가?	"+file.exists());
		System.out.println("파일인가?			"+file.isFile());
		System.out.println("디렉토리인가?		"+file.isDirectory());
		System.out.println("파일을 읽을 수 있는가?	"+file.canRead());
		System.out.println("파일을 쓸 수 있는가?	"+file.canWrite());
		System.out.println("파일의 바이트 크기는?	"+file.length());
		
		/**
		 * 모든 운영체제의 호환성을 위해서 경로 구분자를 사용합니다.
		 * 리눅스는 파일경로를 쓸때 /home/lib/....이며
		 * 윈도우는 파일경로를 쓸때 \home\lib\....입니다.
		 */
		boolean b = new File("."+File.separator+"hello").mkdir(); //경로에 맞게 폴더를 생성
		
		/*
		 * boolean b = new File("./hello").mkdir(); // 리눅스
		 * boolean b = new File(".\hello").mkdir(); // 윈도우
		 */
		
		String[] listing = new File(".").list();
		System.out.println("현재 디렉토리의 내용은?");
		for(int i=0; i<listing.length; ++i) {
			System.out.println(listing[i]);
		}

	}

}
