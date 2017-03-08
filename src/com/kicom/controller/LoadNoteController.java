package com.kicom.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kicom.entity.Note;

@Controller
public class LoadNoteController {
	
	@RequestMapping("/ajax01.do")
	@ResponseBody //将返回结果转为JSON即调用jackson.jar
	public List<Note> execute() {
		List<Note> list = new ArrayList<Note>();
		Note n1 = new Note();
		n1.setId("01");
		n1.setName("SpringMVC");
		
		Note n2 = new Note();
		n2.setId("02");
		n2.setName("JSON应用");
		
		list.add(n1);
		list.add(n2);
		
		return list;
	}
	
}
