package PollProgram;
import java.util.Scanner;
public class PollProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); int data;int surveyGo;int counter=0;
		int i;int j;int pointTotal;int high;int low;int questionNum;
		
		int averages[] = new int[5];
		
		int totals[] = new int[5];
		
		
		String topics [] = new String [5];
		topics[0] = ("2020 Presidential Election\n");
		topics[1] = ("Tekashi 6ix9ine Trial\n");
		topics[2] = ("UCF Football\n");
		topics[3] = ("Antonio Brown in the NFL");
		topics[4] = ("Iphone 11");
		
		//+1 for the 0th index and +1 for average of row
		int responses [][] = new int [5+1][10+1+1];
		for(j=1;j<6;j++) {
			responses[j][0] = j;
		}
		
		for(i=1;i<11;i++) {
			responses[0][i] = i;
		}
		
		System.out.printf("Would you like to fill out this survey? (Press 1 to start and any other number to end) ");
		surveyGo = scnr.nextInt();
		
		while(surveyGo == 1) {
			System.out.printf("How would you rate these topics on a scale from 1 being the least important to 10 being the most important?\n");
			System.out.printf("\n");
			for(i=0;i<5;i++) {
				System.out.print(topics[i]);
				data = scnr.nextInt();
				responses[i+1][data] += 1;
			}
			counter++;
			System.out.printf("Would you like to fill out this survey? (Press 1 to start and any other number to end) ");
			surveyGo = scnr.nextInt();
			}
		System.out.printf("Thank you for polling with us!\n");
		

		for(i = 0;i<6;i++){
		      for(j=0;j<12;j++){
		    	  System.out.print(responses[i][j] + " ");
		      }
		      
		      System.out.println("");

		    }
		
		System.out.print("\n");
		
if(counter != 0) {		
		for(i = 1;i<6;i++) {
			pointTotal = 0;
			for(j=1;j<11;j++) {
				 pointTotal += responses[i][j] * j;
				 
			}
		totals[i-1] = pointTotal;
		}
		
		for(i=0;i<5;i++) {
			averages[i] = totals[i] / counter;
			System.out.printf("Average for question %d is %d\n",i+1,averages[i]);
		}
		
		high = totals[0];
		questionNum = 1;
		for(i=1;i<5;i++) {
			if(totals[i]> high) {
				totals[i] = high;
				questionNum = i+1;
			}
		}
		System.out.printf("Question %d had the highest point total of %d\n", questionNum, high);
		
		low = totals[0];
		questionNum = 1;
		for(i=1;i<5;i++) {
			if(totals[i]< low) {
				totals[i] = low;
				questionNum = i+1;
			}
		}
		System.out.printf("Question %d had the lowest point total of %d\n", questionNum, low);
		scnr.close();
	}
	}
}
