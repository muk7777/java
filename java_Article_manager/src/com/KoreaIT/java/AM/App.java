package com.KoreaIT.java.AM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.KoreaIT.java.AM.util.Util;
import com.KoreaIT.java.dto.Article;

public class App {
	List<Article> articles;
	List<Article> articlesFind;
	List<Article> articles0;

	App() {
		articles = new ArrayList<>();
		articles0 = new ArrayList<>();
		articlesFind = articles;
	}

	public void run() {
		System.out.println("== 프로그램 시작 ==");

		Scanner sc = new Scanner(System.in);

		makeTestData();

		int lastArticleId = 3;

		while (true) {
			System.out.println("명령어 : ");
			String cmd = sc.nextLine().trim();
			System.out.println("입력된 명령어 : " + cmd);

			if (cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}

			if (cmd.equals("exit")) {
				break;
			}

			if (cmd.equals("article write")) {
				int id = ++lastArticleId;
				lastArticleId = id;

				System.out.println("제목을 입력해주세요.");
				String title = sc.nextLine();
				System.out.println("제목 :" + title);

				System.out.println("내용을 입력해주세요.");
				String body = sc.nextLine();
				System.out.println("내용 :" + body);

				System.out.printf("%d번글이 생성되었습니다.\n", id);

				Article article = new Article(id, Util.getNowDateStr(), title, body);

				articles.add(article);

			} else if (cmd.startsWith("article list")) {
				cmd = cmd.substring(12).trim();

				
				
				if (articles.size() == 0) {
					System.out.println("게시글이 없습니다");
					continue;
				}
				
				if (cmd.length() > 0) {
					articlesFind = articles0;
					for (int i = 0; i < articles.size(); i++) {
						Article article = articles.get(i);
						if (article.title.contains(cmd)) {
							articlesFind.add(article);
						}
					}

				}
				
				
				if (articlesFind.size() == 0) {
					System.out.println("검색어와 일치하는 게시글이 없습니다.");
					continue;
				}
				
				System.out.println(articlesFind.size());
				System.out.println("조회수	|	번호	|	제목	|	날짜");
				
				for (int i = articlesFind.size() - 1; i >= 0; --i) {
					Article article = articlesFind.get(i);
					System.out.printf("%d	|	%d	|	%s	|	%s\n", article.hit, article.id, article.title,
							article.now);
				}
				articles0.clear();
				articlesFind = articles;

			} else if (cmd.startsWith("article detail ")) {
				String[] cmdBits = cmd.split(" ");

				if (articles.size() == 0) {
					System.out.println("게시글이 없습니다");
					continue;
				}

				int id = Integer.parseInt(cmdBits[2]);

				Article foundArticle = getArticleById(id);

				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
					continue;
				}

				foundArticle.inceraseHit();
				System.out.println("== 게시물 상세보기 ==");
				System.out.printf("조회수 : %d\n", foundArticle.hit);
				System.out.printf("작성일자 : %s\n", foundArticle.now);
				System.out.printf("번호 : %d\n", foundArticle.id);
				System.out.printf("제목 : %s\n", foundArticle.title);
				System.out.printf("내용 : %s\n", foundArticle.body);

			} else if (cmd.startsWith("article delete ")) {
				String[] cmdBits = cmd.split(" ");

				if (articles.size() == 0) {
					System.out.println("게시글이 없습니다");
					continue;
				}

				int id = Integer.parseInt(cmdBits[2]);

				Article foundArticle = getArticleById(id);

				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
					continue;
				}

				articles.remove(foundArticle);
				System.out.printf("%d번 게시물을 삭제했습니다.\n", id);

			} else if (cmd.startsWith("article modify ")) {
				String[] cmdBits = cmd.split(" ");

				if (articles.size() == 0) {
					System.out.println("게시글이 없습니다");
					continue;
				}

				int id = Integer.parseInt(cmdBits[2]);

				Article foundArticle = getArticleById(id);

				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
					continue;
				}

				System.out.println("== 게시물 수정하기 ==");
				System.out.printf("수정할 제목 : ");
				String title = sc.nextLine();
				System.out.println(title);

				System.out.printf("수정할 내용 : ");
				String body = sc.nextLine();
				System.out.println(body);

				foundArticle.title = title;
				foundArticle.body = body;

			} else {
				System.out.printf("%s(은)는 존재하지 않는 명령어입니다.\n", cmd);
			}
		}

		System.out.println("== 프로그램 끝 ==");
		sc.close();
	}

	private void makeTestData() {
		articles.add(new Article(1, Util.getNowDateStr(), "test1", "test1", 10));
		articles.add(new Article(2, Util.getNowDateStr(), "test2", "test2", 15));
		articles.add(new Article(3, Util.getNowDateStr(), "test3", "test3", 28));
	}

	private Article getArticleById(int id) {
		for (int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			if (id == article.id) {
				return article;
			}
		}
		return null;
	}

}
