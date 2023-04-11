package com.KoreaIT.java.AM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.KoreaIT.java.AM.util.Util;
import com.KoreaIT.java.dto.Article;
import com.KoreaIT.java.dto.Member;

public class App {
	List<Article> articles;
	List<Member> members;
	Member loginedMember;

	App() {
		articles = new ArrayList<>();
		members = new ArrayList<>();
		this.loginedMember = null;
	}

	public void run() {
		System.out.println("== 프로그램 시작 ==");

		Scanner sc = new Scanner(System.in);

		makeTestData();
		makeTestData2();


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

			if (cmd.equals("member join")) {
				
				if (isLogined()) {
					System.out.println("로그아웃 후 이용해주세요.");
					continue;
				}
				
				int id = LastPId.getMemberLastId();

				String loginId = null;
				
				while (true) {
					System.out.printf("로그인 아이디 : ");
					loginId = sc.nextLine();
					
					if (isLoginIdDup(loginId) == false) {
						System.out.printf("%s은(는)이미 사용중인 아이디입니다.\n", loginId);
						continue;
					}
					
					System.out.printf("%s은(는) 사용 가능한 아이디 입니다.\n", loginId);
					break;
				}
				
				String loginPw = null;
				while (true) {
					System.out.printf("로그인 비밀번호 : ");
					loginPw = sc.nextLine();
					System.out.printf("로그인 비밀번호 확인 : ");
					String loginPwCheck = sc.nextLine();
					if (loginPwCheck.equals(loginPw) == false) {
						System.out.println("비밀번호를 다시 입력해주세요.");
						continue;
					}
					break;
				}
				
				System.out.printf("이름 : ");
				String name = sc.nextLine();

				Member member = new Member(id, Util.getNowDateStr(), loginId, loginPw, name);
				
				members.add(member);

				System.out.printf("%s 회원님 환영합니다.\n", name);
			} else if (cmd.equals("member login")) {
				
				if (isLogined()) {
					System.out.println("로그아웃 후 이용해주세요.");
					continue;
				}
				
				String loginId = null;
				String loginPw = null;
				while (true) {
					
					System.out.printf("로그인 아이디 : ");
					loginId = sc.nextLine().trim();
					if (loginId.equals("")) {
						System.out.println("아이디를 입력해주세요.");
						continue;
					}
					while (true) {
						
						System.out.printf("로그인 패스워드 : ");
						loginPw = sc.nextLine();
						if (loginPw.equals("")) {
							System.out.println("비밀번호를 입력해주세요.");
							continue;
						}
						break;
					}
					break;
				}
				Member member = getMemberById(loginId);
				
				if (member == null) {
					System.out.printf("%s(은)는 존재하지 않는 아이디 입니다.\n", loginId);
					continue;
				}
				
				
				if (member.loginPw.equals(loginPw) == false) {
					System.out.println("비밀번호가 틀렸습니다.");
					continue;
				}
				
				this.loginedMember = member;
				System.out.printf("로그인 성공 : %s 회원님 환영합니다.\n", member.name);
				
			} else if (cmd.equals("member logout")) {
				if (isLogined() == false) {
					System.out.println("로그인 상태가 아닙니다.");
					continue;
				}
				
				this.loginedMember = null;
				System.out.println("로그아웃 되었습니다.");
				
			} else if (cmd.equals("article write")) {
				
				if (isLogined() == false) {
					System.out.println("로그인 상태가 아닙니다.");
					continue;
				}
				
				int id = LastPId.getArticleLastId();
				
				String regDate = Util.getNowDateStr();
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();

				System.out.printf("%d번글이 생성되었습니다.\n", id);

				Article article = new Article(id, regDate, title, body, loginedMember.id);

				articles.add(article);
				
			} else if (cmd.startsWith("member profile")) {
				if (isLogined() == false) {
					System.out.println("로그인 후 이용해주세요.");
					continue;
				}
				
				System.out.println("이름 : " + this.loginedMember.name);
				System.out.println("아이디 : " + this.loginedMember.loginId);
				System.out.println("가입일자 : " + this.loginedMember.regDate);
				
			} else if (cmd.startsWith("member modify")) {
				
				if (isLogined() == false) {
					System.out.println("로그인 후 이용해주세요.");
					continue;
				}
				
				String loginPw;
				while (true) {
					System.out.printf("로그인 패스워드 : ");
					loginPw = sc.nextLine();
					
					if (this.loginedMember.loginPw.equals(loginPw) == false) {
						System.out.println("비밀번호가 일치하지 않습니다.");
						continue;
					}
					break;
				}
				
				System.out.printf("변경할 이름 : ");
				String name = sc.nextLine();
				
				this.loginedMember.name = name; 
				
			} else if (cmd.startsWith("article list")) {
				
				if (articles.size() == 0) {
					System.out.println("게시글이 없습니다");
					continue;
				}
				
				String searchKeyward = cmd.substring(12).trim();
				List<Article> articlesFind = articles;
				
				if (searchKeyward.length() > 0) {
					articlesFind = new ArrayList<>();
					
					for (Article article : articles) {
						if (article.title.contains(searchKeyward)) {
							articlesFind.add(article);
						}
					}

				}
				
				
				if (articlesFind.size() == 0) {
					System.out.println("검색어와 일치하는 게시글이 없습니다.");
					continue;
				}
				
				System.out.println("번호	|	조회수	|	제목	|	작성자	|	날짜");
				
				String writerName = null;
				
				for (int i = articlesFind.size() - 1; i >= 0; --i) {
					Article article = articlesFind.get(i);
					for (Member member : members) {
						if (article.memberId == member.id) {
							writerName = member.name;
						}
					}
					System.out.printf("%d	|	%d	|	%s	|	%s	|	%s\n", article.id, article.hit, article.title,
							writerName, article.regDate);
				}

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
				
				String writerName = null;
				for (Member member : members) {
					if (foundArticle.memberId == member.id) {
						writerName = member.name;
					}
				}
				foundArticle.inceraseHit();
				System.out.println("== 게시물 상세보기 ==");
				System.out.printf("조회수 : %d\n", foundArticle.hit);
				System.out.printf("작성일자 : %s\n", foundArticle.regDate);
				System.out.printf("작성자이름 : %s\n", writerName);
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
				
				if (isAuthority(foundArticle.id) == false) {
					System.out.println("권한이 없습니다.");
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
				
				if (isAuthority(foundArticle.id) == false) {
					System.out.println("권한이 없습니다.");
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
				System.out.printf("%d번 게시물이 수정되었습니다.\n", id);

			} else {
				System.out.printf("%s(은)는 존재하지 않는 명령어입니다.\n", cmd);
			}
		}

		System.out.println("== 프로그램 끝 ==");
		sc.close();
	}

	private void makeTestData() {
		System.out.println("테스트를 위한 게시글 데이터를 생성합니다");
		articles.add(new Article(LastPId.getArticleLastId(), Util.getNowDateStr(), "test1", "test1", 10, 1));
		articles.add(new Article(LastPId.getArticleLastId(), Util.getNowDateStr(), "test2", "test2", 15, 2));
		articles.add(new Article(LastPId.getArticleLastId(), Util.getNowDateStr(), "test3", "test3", 28, 3));
	}
	
	private void makeTestData2() {
		System.out.println("테스트를 위한 회원 데이터를 생성합니다");
		members.add(new Member(LastPId.getMemberLastId(), Util.getNowDateStr(), "test1", "test1", "test1"));
		members.add(new Member(LastPId.getMemberLastId(), Util.getNowDateStr(), "test2", "test2", "test2"));
		members.add(new Member(LastPId.getMemberLastId(), Util.getNowDateStr(), "test3", "test3", "test3"));
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
	
	private Member getMemberById(String loginId) {
		for (Member member : members) {
			if (member.loginId.equals(loginId)) {
				return member;
			}
		}
		return null;
	}
	private boolean isLoginIdDup(String loginId) {
		for (Member member : members) {
			if (member.loginId.equals(loginId)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isLogined() {
		return this.loginedMember != null;
	}
	
	private boolean isAuthority(int memberId) {
		return memberId == this.loginedMember.id;
	}
	

}