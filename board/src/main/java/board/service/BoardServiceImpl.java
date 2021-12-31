package board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import board.dao.BoardDAO;
import board.dao.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}
}
