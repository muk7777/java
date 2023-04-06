package com.KoreaIT.java.AM.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
    public static String getNowDateStr() {
    	 
        // 현재 날짜/시간
        LocalDateTime now = LocalDateTime.now();
        // 현재 날짜/시간 출력
//        System.out.println(now); // 2021-12-02T18:19:36.897421300
        // 포맷팅
//        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
        // 포맷팅 현재 날짜/시간 출력
//        System.out.println(formatedNow); // 2021년 12월 02일 18시 19분 36초
        return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}