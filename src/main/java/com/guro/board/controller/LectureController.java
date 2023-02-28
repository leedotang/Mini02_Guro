package com.guro.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guro.board.service.LectureService;
import com.guro.board.model.Lecture;

@RestController
public class LectureController {
	@Autowired
	private LectureService lectureService;
	
	@RequestMapping(value= "selectLecture.do")
	public Lecture viewLecture() {
		Lecture lecture = lectureService.select();
		return lecture;
		
	}
}
