package com.jbedu.test.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbedu.test.dao.BoardDao;

@Controller
public class MemberController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value="/")
	public String test(Model model) {
		
		BoardDao dao = sqlSession.getMapper(BoardDao.class)
	
		model.addAttribute("title", dao.testDao("1"));
		dao.testDao("1");
		
		return test;
	}

}
