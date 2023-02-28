package com.guro.board.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.guro.board.model.Lecture;

@Repository
public interface LectureRepository extends CrudRepository<Lecture, Integer> {
	Lecture save(Lecture lecture);
	Lecture findTopByOrderByBnoDesc();
}
