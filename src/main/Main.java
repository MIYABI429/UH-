package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		終了しますか?の処理
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
//	↓標準入力の処理
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
//  ↑
	switch (a) {
	case 1:
//		↓足算の処理
		System.out.println("データ１=>");
		int plus0 = scanner.nextInt();
		System.out.println("データ１=>" + plus0);
		System.out.println("データ2=>");
		int plus1 = scanner.nextInt();
		System.out.println("データ2=>" + plus1);
		int sum0 = plus0 +  plus1;
		System.out.println("データ１=>" + plus0);
		System.out.println("データ2=>" + plus1);
		System.out.println("答え=>" + sum0);
		break;
//		↑足算の処理
	case 2:
//	　	↓引き算の処理
		System.out.println("データ１=>");
		int subtraction0 = scanner.nextInt();
		System.out.println("データ１=>" + subtraction0);
		System.out.println("データ2=>");
		int subtraction1 = scanner.nextInt();
		System.out.println("データ2=>" + subtraction1);
		int sum1 = subtraction0 - subtraction1;
		System.out.println("データ１=>" + subtraction0);
		System.out.println("データ2=>" + subtraction1);
		System.out.println("答え=>" +  sum1);
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
		int sum2 = d11 * e11;
		System.out.println("データ１=>" + d11);
		System.out.println("データ2=>" + e11);
		System.out.println("答え=>" + sum2);
		break;
//		↑掛算の処理
	case 4:
//		↓割算の処理
		System.out.println("データ１=>");
		int division0 = scanner.nextInt();
		System.out.println("データ１=>" + division0);
		System.out.println("データ2=>");
		int division1 = scanner.nextInt();
		System.out.println("データ2=>" + division0);
		int sum3 = division0 / division0;
		System.out.println("データ１=>" + division0);
		System.out.println("データ2=>" + division1);
		System.out.println("答え=>" + sum3);
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


//  はい：0　いいえ：１　の標準入力の処理
     int cc = scanner.nextInt();
//     ↓はい：０の処理
  			if(cc == 0) {
  				break;
//  　　　↑はい：０の処理
  			}
  		}
//		プログラムを終了しましたの処理
	System.out.println("プログラムを終了しました。");

	}

}
