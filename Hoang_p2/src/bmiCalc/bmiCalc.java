package bmiCalc;
import java.util.Scanner;
import java.lang.Math;

public class bmiCalc {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int formulaSelector; 
		double bmi;double weightPounds;double heightInches;double weightKilos;double heightMeters;
		
		
		System.out.printf("Are you using freedom units? (Pounds and Inches) (1 for yes 2 for no Any other to exit) ");
		formulaSelector = scnr.nextInt();
		
		if(formulaSelector == 1) {
			System.out.printf("How much do you weigh? ");
			weightPounds = scnr.nextDouble();
			System.out.printf("How tall are you? ");
			heightInches = scnr.nextDouble();
			
			bmi = (703 * weightPounds) / (Math.pow(heightInches, 2)); 
			System.out.printf("BMI : %.2f",bmi);
			System.out.printf("\n\n");
			
			System.out.printf("BMI Categories are:\n");
			System.out.printf("Underweight = <18.5\n");
			System.out.printf("Normal weight = 18.5�24.9\n ");
			System.out.printf("Overweight = 25�29.9\n");
			System.out.printf("Obesity = >30\n");
			
		}
		else if(formulaSelector == 2) {
			System.out.printf("How much do you weigh? ");
			weightKilos = scnr.nextDouble();
			System.out.printf("How tall are you? ");
			heightMeters = scnr.nextDouble();
			
			bmi = weightKilos / (Math.pow(heightMeters, 2)); 
			System.out.printf("BMI : %.2f",bmi);
			System.out.printf("\n\n");
			
			System.out.printf("BMI Categories are:\n");
			System.out.printf("Underweight = <18.5\n");
			System.out.printf("Normal weight = 18.5�24.9\n");
			System.out.printf("Overweight = 25�29.9\n");
			System.out.printf("Obesity = >30\n");
		}
		else 
			System.out.printf("Thank you for using my bmi calculator!");
		scnr.close();
	}
}
