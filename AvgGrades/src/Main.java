import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int grade, score = 0, grades = 0; 
		double avg;  
		System.out.println("Enter Grade Number " + (score + 1) + " here:");
		grade = in.nextInt();
		while(grade != -1){
		score++;
		grades += grade;
			System.out.println("Enter Grade Number " + (score + 1) + " here:");
		grade = in.nextInt();
		
		} 
		avg = (double) grades / score;
		if(avg >= 95){
			System.out.println("WOW!!! Your avg is sooo high!!!");
		}else if(avg >=85 && avg < 95) {
			System.out.println("Your avg is good!");
		}else {
			System.out.println("your avg is not good!");
		}
		System.out.println("Your avg is " + avg + "!");
		in.close();

	}
}