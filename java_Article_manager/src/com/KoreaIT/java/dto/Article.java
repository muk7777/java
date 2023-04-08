package com.KoreaIT.java.dto;

public class Article {
	public String title;
	public String body;
	public int id;
	public String now;
	public int hit;
	public int memberId;

	public Article(int id, String now, String title, String body, int memberId) {
		this(id, now, title, body, 0, memberId);
	}
	
	public Article(int id, String now, String title, String body, int hit, int memberId) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.now = now;
		this.hit = hit;
		this.memberId = memberId;
	}
	
	public void inceraseHit() {
		++this.hit;
	}
	
}

