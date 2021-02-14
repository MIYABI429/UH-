package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while(true) {
		Scanner scanner = new Scanner(System.in);
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

	int a = scanner.nextInt();

	switch (a) {
	case 1:
		int d = scanner.nextInt();
		System.out.println("データ１=>" + d);
		int b = scanner.nextInt();
		System.out.println("データ2=>" + b);
		int c = scanner.nextInt();
		int sum = b + c;
		System.out.println("答え=>" + sum);
		break;
	case 2:
		int c1 = scanner.nextInt();
		System.out.println("データ１=>" + c1);
		int e = scanner.nextInt();
		System.out.println("データ2=>" + e);
		int sum1 = c1 - e;
		System.out.println("答え=>" + sum1);
		break;
	case 3:
		int d1 = scanner.nextInt();
		System.out.println("データ１=>" + d1);
		int e1 = scanner.nextInt();
		System.out.println("データ2=>" + e1);
		int sum11 = d1 * e1;
		System.out.println("答え=>" + sum11);
		break;
	case 4:
		int d11 = scanner.nextInt();
		System.out.println("データ１=>" + d11);
		int e11 = scanner.nextInt();
		System.out.println("データ2=>" + e11);
		int sum111 = d11 / e11;
		System.out.println("答え=>" + sum111);
		break;
	case 99:
		System.out.println("プログラムを終了しました。");
		break;
	default:
		System.out.println("エラー");
	}
     System.out.println("終了しますか？");
     int cc = scanner.nextInt();


  // 6の目が出たら whileループから抜ける
  			if(cc == 0) {
  				break;
  			}
  		}
	System.out.println("プリントを終了しました。");

	}

}
