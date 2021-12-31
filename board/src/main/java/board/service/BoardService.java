package board.service;

import java.util.List;

import board.dao.BoardVO;

public interface BoardService {

	public List<BoardVO> list() throws Exception;
}
