// Write a program to take user input for the age of all 10 students in a class and check
// whether the student can vote depending on his/her age is greater or equal to 18.
// Hint =>
// a. Create a class public class StudentVoteChecker and define a method public
// boolean canStudentVote(int age) which takes in age as a parameter and returns
// true or false
// b. Inside the method firstly validate the age for a negative number, if a negative return is
// false cannot vote. For valid age check for age is 18 or above return true; else return
// false;
// c. In the main function define an array of 10 integer elements, loop through the array by
// take user input for the student's age, call canStudentVote() and display the result
package Level2;
import java.util.*;
public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        StudentVoteChecker voteChecker= new StudentVoteChecker();
        int [] studentAge= new int[10];
        for(int i=0;i<studentAge.length;i++){
            System.out.print("Enter student age "+(i+1)+ ":");
             studentAge[i] = sc.nextInt();
             boolean canVote = voteChecker.canStudentVote(studentAge[i]);
             if(studentAge[i]<0){
                System.out.println("Invalid age entered");
             }
             if(canVote){
                System.out.println("Student" +(i+1)+" is eligible for vote");
             }
             else{
                System.out.println("Student" +(i+1)+" is not eligible for vote");

             }
        }
    }
    public  boolean canStudentVote(int age){
        if(age<0){
            return false;
        }
        else if(age>=18){
            return true;
        }
        else{
        return false;
        }
    }
}
