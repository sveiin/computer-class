package com.itwill.map03;

import java.util.HashMap;

public class MapMain03 {

	public static void main(String[] args) {
		// 단어 개수 세기(word counting):
		// 문자열에 등장하는 단어를 key로 하고,
		// 단어가 문자열에 등장하는 횟수를 value로 하는 Map 객체를 만들고, 출력
		
		String sentence = "짜장면 짬뽕 짜장면 볶음밥 김치찌개 부대찌개 김치찌개 된장찌개";
		// -> 결과: {짜장면=2, 짬뽕=1, 볶음밥=1, 김치찌개=2, 부대찌개=1, 된장찌개=1}
		
		// 문자열 sentence를 공백으로 구분해서 단어들로만 이루어진 배열
		String[] words = sentence.split(" ");
		
		// 단어(key)-빈도수(value) 저장하기 위한 Map을 선언, 초기화
		HashMap<String, Integer> wordCounts = new HashMap<>();
		
		// 배열에 저장된 단어들을 순서대로 하나씩 반복
		for(String w : words) {
			// 1
//			if(wordCounts.get(w) == null) {
//				wordCounts.put(w, 1);
//			} else {
//				wordCounts.put(w, wordCounts.get(w) + 1);
//			}
			
			// 2
//			Integer count = wordCounts.get(w);
//            if (count != null) {
//                wordCounts.put(w, count + 1);
//            } else {
//                wordCounts.put(w, 1);
//            }
            
            // 3
			Integer count = wordCounts.getOrDefault(w, 0);
			wordCounts.put(w, count + 1);
		}
		
		System.out.println(wordCounts);

	}

}
