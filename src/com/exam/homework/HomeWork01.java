package com.exam.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Collections;

/**
 * 1. arrayList 사용(10)
 * 2. 1~20 사이의 랜덤 값을 입력
 * 3. 중복을 제거
 * 4. 오름차순으로 출력
 * 
 * @author PC
 *
 */

public class HomeWork01 {
	public static void main(String[] args) {
		
		// 1. arraylist
		List<Integer> list = new ArrayList<Integer>();
		
		// 2. 랜덤값 입력
		Random ran = new Random();
		
		/**
		 * 값을 넣으면서 중복을 제거
		 */
		int listCount = 1;
		int tempValue = 0;
		while(listCount <= 10) {
			// 임의 값을 뽑아놓음
			tempValue = ran.nextInt(20) +1;
			
			// list에 아무겂도 없으면 비교할 필요x
			if (list.size() == 0) {
				list.add(tempValue);
			}else {
				
				// list에 해당 값이 포함되어 있는지 확인
				if(list.contains(tempValue)){
					continue;
				}
				
				list.add(tempValue);
				listCount++;
				
				
			}
		}
		
		/////////////////////////////////////////////////////////////////
		
		// 3. 오름차순 정렬
		Collections.sort(list);
		// 4. 출력
		System.out.println(Arrays.toString(list.toArray()));

	}

}
