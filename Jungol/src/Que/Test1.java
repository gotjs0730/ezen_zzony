package Que;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double inp = sc.nextDouble();
		sc.close();
		
		System.out.println("몸무게를 입력하세요");
		
		if(inp<=50.08) {
			System.out.println("Flyweight");
		}else if(inp <= 61.23) {
			System.out.println("Lightweight");
		}
		else if(inp <= 72.57) {
			System.out.println("Middleweight");
		}
		else if(inp <= 88.45) {
			System.out.println("Cruiserweight");
		}
		else{
			System.out.println("Heavyweight");
		}
		
		
		

	}

}
