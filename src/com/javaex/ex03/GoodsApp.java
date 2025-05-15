package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Goods> gArr = new ArrayList<Goods>();

		System.out.println("상품을 입력해주세요(종료 q)");

		while (true) {
			String show = sc.nextLine();
			if (show.equals("q")) {
				break;
			}
			String[] parts = show.split(",");
			String name = parts[0];
			int price = Integer.parseInt(parts[1]);
			int count = Integer.parseInt(parts[2]);

			// Goods
			Goods g = new Goods(name, price, count);

			// 담기
			gArr.add(g);
		}
		// 출력
		System.out.println("[입력완료]");
		System.out.println("==========================================");
		for (int i = 0; i < gArr.size(); i++) {
			gArr.get(i).showInfo();;
		}
		sc.close();

	}

}
