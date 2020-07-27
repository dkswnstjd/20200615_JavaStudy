package com.sist.util;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5];//5~14
		
		String day="";
		for(int i=0;i<resDay.length;i++)
		{
			resDay[i]=r.nextInt(31)+1;
			day+=resDay[i]+"|";
		}
		day=day.substring(0,day.lastIndexOf("|"));
		
		System.out.println(day);
		
        //날짜별 분리 
		String[] resdays=day.split("\\|");// 정규식
		/*
		 *    정규식
		 *     ^ => 시작 문자    ^A  => ^[가-힣] ^[A-Za-z] ^[0-9]
		 *                          [^가-힣] => 제외 
		 *                   지니뮤직 
		 *                     => 3상승 => [^가-힣] ==> 3
		 *                     => 1하강 => [^0-9]
		 *     $ => 끝문자        A$
		 *     . => 임의의 한글자 (모든 글자)  ==> \\.
		 *     | => 선택 
		 *     ? => 있으면 출력 , 없으면 미출력 
		 */
		for(String s:resdays)
		{
			System.out.println(s);
		}
		System.out.println("=====StringTokenizer=====");
		StringTokenizer st=new StringTokenizer(day, "|");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}

}



