package com.guro.board.impl;

import com.guro.board.model.FreeBoard;

public interface FreeBoardService {
	
	void insert(FreeBoard freeBoard);

	void update(FreeBoard freeBoard);

	void delete(FreeBoard freeBoard);

	FreeBoard select();
}
