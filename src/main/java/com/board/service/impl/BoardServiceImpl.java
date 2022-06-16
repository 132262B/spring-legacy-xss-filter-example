package com.board.service.impl;

import com.board.dao.BoardDao;
import com.board.service.BoardService;
import com.board.util.ViewConverterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDao boardDao;

    @Override
    public List<HashMap<String, Object>> boardListR(HashMap<String, Object> param) {
        return boardDao.boardListR(param);
    }

    @Override
    public void boardAdd(HashMap<String, Object> param) {
        boardDao.boardAdd(param);
    }

    @Override
    public HashMap<String, Object> boardDetailR(HashMap<String, Object> param) {
        HashMap<String, Object> map = boardDao.boardDetailR(param);
        if(map.get("content") != null) {
            map.put("content", ViewConverterUtil.toHtmlConverter(map.get("content")));
        }
        return map;
    }
}
