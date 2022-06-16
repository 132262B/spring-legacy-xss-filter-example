package com.board.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository("board")
public class BoardDao extends SqlSessionDaoSupport {

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public List<HashMap<String, Object>> boardListR(HashMap<String, Object> param) {
        return getSqlSession().selectList("boardListR", param);

    }

    public void boardAdd(HashMap<String, Object> param) {
        getSqlSession().insert("boardAdd", param);
    }

    public HashMap<String, Object> boardDetailR(HashMap<String, Object> param) {
        return getSqlSession().selectOne("boardDetailR",param);
    }
}
