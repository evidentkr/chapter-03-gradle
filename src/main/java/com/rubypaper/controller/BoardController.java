package com.rubypaper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;
import com.rubypaper.service.BoardService;

@RestController
public class BoardController {
	public BoardController() {
		System.out.println("===> BoardController 생성");
	}
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/hello")
	public String hello(String name) {
		return boardService.hello(name);
		//return "Hello : "+name;
	}

	@GetMapping("/getBoard")
	public BoardVO getBoard() {
		return boardService.getBoard();
	}

	@GetMapping("/getBoardList")
	public List<BoardVO> getBoardList() {
		return boardService.getBoardList();
	}
}
