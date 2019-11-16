package com.exam.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 2번째 예제
 * @author PC
 *
 */

public class HomeWork02 {
	public static void main(String[] args) {
		
		// 1. arraylist
		List<Integer> list = new ArrayList<Integer>();
				
		// 2. 랜덤값 입력
		Random ran = new Random();
		int tempVal = 0;
		
		// 우선 삽입
		for(int i =0; i<10; i++) {
			tempVal = ran.nextInt(20)+1;
			list.add(tempVal);
		}
		
		// 중복을 제거
		Set<Integer> listSet = new HashSet<>(list);
		list = new ArrayList<Integer>(listSet);
		
		Collections.sort(list);
		
		System.out.println(Arrays.deepToString(list.toArray()));

	}

}
