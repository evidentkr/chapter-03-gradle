package com.rubypaper.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rubypaper.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Override
	public String hello(String name) {
		return "Hello : "+name;
	}

	@Override	
	public BoardVO getBoard() {
		BoardVO board = new BoardVO();

		board.setCnt(0);
		board.setContent("content");
		board.setCreateDate(new Date());
		board.setSeq(1);
		board.setTitle("title");
		board.setWriter("writer");

		return board;
	}

	@Override
	public List<BoardVO> getBoardList() {
		List<BoardVO> boardList = new ArrayList<BoardVO>();

		for (int i = 1; i <= 10; i++) {

			BoardVO board = new BoardVO();

			board.setCnt(0);
			board.setContent("content");
			board.setCreateDate(new Date());
			board.setSeq(i);
			board.setTitle("title");
			board.setWriter("writer");

			boardList.add(board);
		}
		return boardList;
	}
}