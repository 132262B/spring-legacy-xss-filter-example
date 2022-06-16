package com.board.service;


import java.util.HashMap;
import java.util.List;

public interface BoardService {
    List<HashMap<String,Object>> boardListR(HashMap<String, Object> param);

    void boardAdd(HashMap<String, Object> param);

    HashMap<String, Object> boardDetailR(HashMap<String, Object> param);
}
