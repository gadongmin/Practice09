package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;

public class FriendApp {

	public static void main(String[] args) {
		// 리스트
		List<Friend> fArr = new ArrayList<Friend>();

		// Friend
		Friend f01 = new Friend("정우성", "010-2222-3333", "초");
		Friend f02 = new Friend("이효리", "010-3232-6666", "중");
		Friend f03 = new Friend("이정재", "010-5434-9999", "고");

		// 담기
		fArr.add(f01);
		fArr.add(f02);
		fArr.add(f03);

		// 출력
		for (int i = 0; i < fArr.size(); i++) {
			System.out.println(fArr.get(i));
		}
		for (int i = 0; i < fArr.size(); i++) {
			((Friend) fArr.get(i)).infor();
			;
		}

	}

}
