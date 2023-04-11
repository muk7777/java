package com.KoreaIT.java.dto;

public class Article {
	public String title;
	public String body;
	public int id;
	public String regDate;
	public int hit;
	public int memberId;

	public Article(int id, String regDate, String title, String body, int memberId) {
		this(id, regDate, title, body, 0, memberId);
	}
	
	public Article(int id, String regDate, String title, String body, int hit, int memberId) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.regDate = regDate;
		this.hit = hit;
		this.memberId = memberId;
	}
	
	public void inceraseHit() {
		++this.hit;
	}
	
	public void increaseId() {
		++this.id;
	}
	
}

