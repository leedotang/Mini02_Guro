package com.guro.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guro.board.model.Lecture;
import com.guro.board.repository.LectureRepository;

@Service("lectureService")
public class LectureServiceImpl implements LectureService {

	@Autowired
	private LectureRepository repo;
	
	@Override
	public Lecture select() {
		return repo.findTopByOrderByBnoDesc();
	}	
}
