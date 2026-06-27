package com.wipro.bank.main;
import java.util.Scanner;

import com.wipro.bank.service.BankService;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the tenure period (5 or 10):");
		int tenure=sc.nextInt();
		System.out.print("Enter the principal amount (>=500):");
		float principal=sc.nextFloat();
		System.out.print("Enter the age:");
		int age=sc.nextInt();
		System.out.print("Enter the gender:");
		String gender=sc.next();
		BankService b=new BankService();
		b.calculate(principal, tenure, age, gender);
		sc.close();
	}

}
