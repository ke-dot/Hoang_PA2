package com.EncryptData.eclipse;
import java.util.Scanner;

public class EncryptData {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int data;int lastDigit;int thirdDigit;int secondDigit;int firstDigit;int tmp;
		
		System.out.printf("Enter a 4 digit integer to encrypt. ");
		data = scnr.nextInt();
		lastDigit = data % 10;
		data /= 10;
		thirdDigit = data % 10;
		data /=10;
		secondDigit = data % 10;
		data /=10;
		firstDigit = data % 10;
		
		//Encryption Method
		firstDigit = (firstDigit + 7) % 10;
		secondDigit = (secondDigit + 7) % 10;
		thirdDigit = (thirdDigit + 7) % 10;
		lastDigit = (lastDigit + 7) % 10;
		
		// Swapping Digits
		tmp = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = tmp;
		tmp = secondDigit;
		secondDigit = lastDigit;
		lastDigit = tmp;
		
		System.out.printf("%d%d%d%d\n", firstDigit,secondDigit,thirdDigit,lastDigit);
		
	scnr.close();
   }
}