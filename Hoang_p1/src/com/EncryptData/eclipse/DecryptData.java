package com.EncryptData.eclipse;
import java.util.Scanner;

public class DecryptData {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int data;int lastDigit;int thirdDigit;int secondDigit;int firstDigit;int tmp;
		
		System.out.printf("Enter a 4 digit integer to decrypt. ");
		data = scnr.nextInt();
		lastDigit = data % 10;
		data /= 10;
		thirdDigit = data % 10;
		data /=10;
		secondDigit = data % 10;
		data /=10;
		firstDigit = data % 10;
		
			//Undo Swap
		tmp = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = tmp;
		tmp = secondDigit;
		secondDigit = lastDigit;
		lastDigit = tmp;
		
		//Decryption
		firstDigit = firstDigit - 7;
			if(firstDigit <= 0) {
				firstDigit = (10 + firstDigit) % 10;
			}
		secondDigit = secondDigit - 7;
			if(secondDigit <= 0) {
				secondDigit = (10 + secondDigit) % 10;
			}
		thirdDigit = thirdDigit - 7;
			if(thirdDigit <= 0) {
				thirdDigit = (10 + thirdDigit) % 10;
			}
		lastDigit = lastDigit - 7;
			if(lastDigit <= 0) {
				lastDigit = (10 + lastDigit) % 10;
			}
		System.out.printf("%d%d%d%d\n", firstDigit,secondDigit,thirdDigit,lastDigit);
		scnr.close();
	}

}
