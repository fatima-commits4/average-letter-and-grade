package OP1;

import java.util.Scanner;

public class AverageLetterAndGrade {
public static void main (String [] args) {
	 System.out.println("This program allows you to enter quiz grades, calculates the average, and determines the letter grade based on the average.");
     System.out.println("Enter quiz grades between 0 and 100, or 999 to quit.");
     System.out.println("The program will stop after 10 grades or when you enter 999.");
     System.out.println();
     
     Scanner scanner = new Scanner(System.in);
     int grades[] = new int[11];
     int total = 0;
     int count = 0;
     while (count < 10) {
    	    System.out.println("Enter a grade from 0 to 100, or enter 999 to quit: ");
    	    int grade = scanner.nextInt();
    	    
    	    if (grade == 999) {
    	        break;
    	    }
    	    if (grade >= 0 && grade <= 100) {
    	        grades[count] = grade;
    	        total += grade;
    	        count++;
    	    } else {
    	        System.out.println("Invalid input. Please enter a grade from 0 to 100.");
    	    }
    	}
    
     if (count > 0 ) {
    	 System.out.println("\nGrades entered:");
    	 for (int i = 0; i < count; i++) {
    		 System.out.println("Grade " + (i + 1) + ": " +grades[i]);
    }
    double average = total/(double) count;
    System.out.println("\nAverage grade: " +average);
    System.out.println("Current count: " +count);
    char LetterGrade = 0;
    if (average >= 90 && average <= 100) {
    	LetterGrade = 'A';
    } else if (average >= 80 && average <= 89) {
    	LetterGrade = 'B';
    } else if (average >= 70 && average <= 79) {
    	LetterGrade = 'C';
    } else if (average >= 60 && average <= 69) {
    	LetterGrade = 'D';
    } else if (average >= 0  && average <= 59) {
    	LetterGrade = 'F';
    }
    System.out.println("Letter Grade: " +LetterGrade);
     } else {
    	 System.out.println("No valid grades were entered.");
     }
     
}
}