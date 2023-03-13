package com.study.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.test.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	//form태그의 method가 post이기 때문에 @PostMapping로 받는다.
	
	@GetMapping("/list")
	public String boardList() {
		return "board_list";
	}
	
	@GetMapping("/writeForm")
	public String writeForm() {
		return "board_write_form";
	}
	
	@PostMapping("/regBoard")
	public String regBoard(String title, String content, int age) {
		System.out.println("글등록실행");
		System.out.println(title);
		System.out.println(content);
		System.out.println(age);
		return null;
	}
	
	//BoardVO boardVO : 커맨드 객체
	@PostMapping("/regBoard2")
	public String regBoard2(BoardVO boardVO, Model model) {
		System.out.println(boardVO);

		//html로 데이터 보내기
		model.addAttribute("name", "홍길동");
		model.addAttribute("age", 20);
		return "board_info";
	}
}
