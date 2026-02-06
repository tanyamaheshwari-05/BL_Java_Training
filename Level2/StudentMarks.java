package Level2;

import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int student = sc.nextInt();
        double[][] marks = new double[student][3];
        double[] percentage = new double[student];
        char[] grade = new char[student];
        for (int i = 0; i < student; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Marks are negative.Enter positive values");
                i--;
                continue;
            }
            percentage[i]=marks[i][0]+marks[i][1]+marks[i][2]/3;
            if(percentage[i]>=80){
                grade[i]='A';
            }
            if(percentage[i]>=70 && percentage[i]<=79){
                grade[i]='B';
            }
            if(percentage[i]>=60 && percentage[i]<=69){
                grade[i]='C';
            }
            if(percentage[i]>=50 && percentage[i]<=59){
                grade[i]='D';
            }
            if(percentage[i]>=40 && percentage[i]<=49){
                grade[i]='E';
            }
            if(percentage[i]<=39){
                grade[i]='F';
            }
        }
          System.out.println("\n--- Student Results ---");
        for (int i = 0; i < student; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
    }

}
