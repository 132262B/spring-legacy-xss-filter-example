package com.board.controller;

import com.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    /**
     * 메인페이지 View 호출
     */
    @GetMapping("/mainPage")
    public String mainPage(@RequestParam HashMap<String, Object> param, Model model) {
        List<HashMap<String, Object>> list = boardService.boardListR(param);
        model.addAttribute("list", list);
        return "main/main";
    }

    /**
     * 등록페이지 View 호출
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "posting/add";
    }

    /**
     * 게시물 등록
     */
    @PostMapping("/add")
    public String add(@RequestParam HashMap<String, Object> param) {
        boardService.boardAdd(param);
        return "redirect:/mainPage";
    }

    /**
     * 상세페이지 View 호출
     */
    @GetMapping("/detail/{pageSeq}")
    public String detailPage(@PathVariable("pageSeq") String pageSeq, @RequestParam HashMap<String, Object> param, Model model) {
        param.put("pageSeq", pageSeq);
        HashMap<String, Object> detailPage = boardService.boardDetailR(param);
        model.addAttribute("detailPage", detailPage);
        return "posting/detail";
    }

}
