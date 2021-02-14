package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while(true) {
//	↓メニューの実装↓
	System.out.println("/////////////////////////////////");
	System.out.println("メニュー");
	System.out.println("/////////////////////////////////");
	System.out.println("足算1");
	System.out.println("引算2");
	System.out.println("掛算3");
	System.out.println("割算4");
	System.out.println("終了99");
	System.out.println("/////////////////////////////////");
	System.out.println("何番の処理を行いますか?");
//	↑メニューの実装↑
//  標準入力の実装
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();

	switch (a) {
	case 1:
//		↓足算の処理
		System.out.println("データ１=>");
		int d = scanner.nextInt();
		System.out.println("データ１=>" + d);
		System.out.println("データ2=>");
		int e = scanner.nextInt();
		System.out.println("データ2=>" + e);
		int sum1 = d + e;
		System.out.println("データ１=>" + d);
		System.out.println("データ2=>" + e);
		System.out.println("答え=>" + sum1);
		break;
//		↑足算の処理
	case 2:
//	　	↓引き算の処理
		System.out.println("データ１=>");
		int d1 = scanner.nextInt();
		System.out.println("データ１=>" + d1);
		System.out.println("データ2=>");
		int e1 = scanner.nextInt();
		System.out.println("データ2=>" + e1);
		int sum11 = d1 - e1;
		System.out.println("データ１=>" + d1);
		System.out.println("データ2=>" + e1);
		System.out.println("答え=>" +  sum11);
		break;
//		↑引算の処理
	case 3:
//		↓掛算の処理
		System.out.println("データ１=>");
		int d11 = scanner.nextInt();
		System.out.println("データ１=>" + d11);
		System.out.println("データ2=>");
		int e11 = scanner.nextInt();
		System.out.println("データ2=>" + e11);
		int sum111 = d11 * e11;
		System.out.println("データ１=>" + d11);
		System.out.println("データ2=>" + e11);
		System.out.println("答え=>" + sum111);
		break;
//		↑掛算の処理
	case 4:
//		↓割算の処理
		System.out.println("データ１=>");
		int d111 = scanner.nextInt();
		System.out.println("データ１=>" + d111);
		System.out.println("データ2=>");
		int e111 = scanner.nextInt();
		System.out.println("データ2=>" + e111);
		int sum1111 = d111 / e111;
		System.out.println("データ１=>" + d111);
		System.out.println("データ2=>" + e111);
		System.out.println("答え=>" + sum1111);
		break;
//		↑割算の処理
	case 99:
		System.out.println("プログラムを終了しました。");
		break;
	default:
		System.out.println("エラー");
	}
//	↓終了の表示
     System.out.println("終了しますか？");
     System.out.println("はい：0");
     System.out.println("いいえ：１");
//  ↑終了の表示


 //
     int cc = scanner.nextInt();
  			if(cc == 0) {
  				break;
  			}
  		}
	System.out.println("プログラムを終了しました。");

	}

}
