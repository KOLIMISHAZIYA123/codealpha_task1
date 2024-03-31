package com;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int Students = scan.nextInt();

        double[] grades = new double[Students];
        double sum = 0;

        for(int i = 0; i < Students; i++) {
            System.out.print("Enter grade for student "+ (i+1) +": ");
            grades[i] = scan.nextDouble();
            sum += grades[i];
        }

        double average = sum / Students;
        double highscore = grades[0];
        double lowscore = grades[0];

        for (int i = 1; i < Students; i++) {
            if (grades[i] > highscore) {
                highscore = grades[i];
            }
            if (grades[i] < lowscore) {
                lowscore = grades[i];
            }
        }

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highscore);
        System.out.println("Lowest grade: " + lowscore);

        scan.close();
    }
}
