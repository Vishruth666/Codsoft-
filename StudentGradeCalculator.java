import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        double averagePercentage = (double) totalMarks / numSubjects;
        char grade;
        if (averagePercentage >= 90) {
            grade = 'O'; 
        } else if (averagePercentage >= 80) {
            grade = 'A';  
        } else if (averagePercentage >= 70) {
            grade = 'B'; 
        } else if (averagePercentage >= 60) {
            grade = 'C';  
        } else if (averagePercentage >= 50) {
            grade = 'D';  
        } else if (averagePercentage >= 40) {
            grade = 'E';  
        } else {
            grade = 'F'; 
        }
        System.out.println("Total marks scored: " + totalMarks);
        System.out.printf("Average percentage scored: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}