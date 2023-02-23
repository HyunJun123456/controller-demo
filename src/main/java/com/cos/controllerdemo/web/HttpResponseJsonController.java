package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controllerdemo.domain.User;

@RestController
public class HttpResponseJsonController {
	@GetMapping("/resp/json")
	public String respJson() {
		return "{\"username\":\"cos\"}";
	}
	
	@GetMapping("/resp/json/javaobject")
	public User respJsonJavaObject() { 
		User user = new User();
		user.setUsername("홍길동");
		// String이어도 json 형태로 만들면 json이 return됨
		return user; // 1. MessageConvert가 자동으로 JavaObject를 Json(구:xml)으로 변경해서 통신을 통해 응답을 해줌.
							 // 2. @RestController 일때만 MessageConverter가 작동함.
	}
	
	
	
}
/*
 * 웹 브라우저는 html만 해석 가능
 * 웹 브라우저에서 자바 코드를 사용하게 되면 text로 인식해버리는 문제
 * 웹서버가 톰캣에게 던져서 index.jsp에 있는 자바 코드를 해석하게 시키고
 * index.jsp가 index.html로 바뀜
 * 
 *  
 * */
