package com.guro.board.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "tb_gr_free")
public class FreeBoard {
	
	@Id
	@GeneratedValue
	@Column(name = "BNO")
	private Long bno;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Column(name = "WRITER")
	private String writer;

	@Column(name = "REGDATE")
	private Date regdate;
	
}
