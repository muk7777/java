package com.KoreaIT.java.dto;

public class Article {
	public String title;
	public String body;
	public int id;
	public String now;
	public int hit;

	public Article(int id, String now, String title, String body) {
		this(id, now, title, body, 0);
	}
	
	public Article(int id, String now, String title, String body, int hit) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.now = now;
		this.hit = hit;
	}
	
	public void inceraseHit() {
		++this.hit;
	}
	
}
