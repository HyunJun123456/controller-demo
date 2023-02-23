package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryPathController {
	
	@GetMapping("/chicken")
	public String chickenQuery(String type) { // parameter를 주소 ? 뒤에 넣어주면됨
		return type+" 배달갑니다. (쿼리스트링)";
	}
	
	@GetMapping("/chicken/{type}")
	public String chickenPath(@PathVariable String type) {
		return type+" 배달갑니다. (주소변수매핑)";
	}
	
}

/*
 * http header의 Content-Type 이해
 * 어떤 종류의 곡식을 가져오는지 종이에 써서 함께줘
 * header + Body data
 * 스프링부트는 기본적으로 x-www-form-urlencoded 타입을 파싱(분석)해준다.
 * 
 * */
