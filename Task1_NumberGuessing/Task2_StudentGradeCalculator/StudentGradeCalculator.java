import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n------- Welcome to \"Student Grade Calculator\" -------");  

        int totalMarks = 0;
        float avgPercentage;

        System.out.print("\nEnter the total number of Subjects: ");
        int subjects = sc.nextInt();

        if(subjects <= 0) {
            System.out.println("Subjects must be greater than 0.");
            return;
        }
        
        for(int i = 1; i <= subjects; i++) {
            System.out.printf("Enter marks of Subject %d (Out of 100): ", i);
            int marks = sc.nextInt();

            if(marks < 0 || marks > 100) {
                System.out.println("\nInvalid Input! Please enter correct marks.");
                i--;    // Ask for the current subject again
                continue;
            }
            totalMarks += marks;
        }

        System.out.println("\nThe Sum of marks in all subjects is " + totalMarks);

        avgPercentage = (float) totalMarks / subjects;
        System.out.println("Average Percentage: " + avgPercentage + "%");

        // Assign Grade 
        if(avgPercentage >= 90) {
            System.out.println("Grade A");
        } else if(avgPercentage >= 80) {
            System.out.println("Grade B");
        } else if(avgPercentage >= 70) {
            System.out.println("Grade C");
        } else if(avgPercentage >= 60) {
            System.out.println("Grade D");
        } else if (avgPercentage >= 50) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F! (You need improvement)");
        }

        sc.close();
    }
}
