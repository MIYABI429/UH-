package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("/////////////////////////////////");
	System.out.println("メニュー");
	System.out.println("/////////////////////////////////");
	System.out.println("足算1");
	System.out.println("引算2");
	System.out.println("割算3");
	System.out.println("終了4");
	System.out.println("何番の処理を行いますか");
	int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(a);
    System.out.println(b);
	}

}
