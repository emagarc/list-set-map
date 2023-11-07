package maps;

import java.util.Set;
import java.util.Scanner;


public class MapSection {

    public static void main(String[] args) {

        // Create an instance of StudentRecord
        System.out.println("instantiating a StudentRecord Class...");
        StudentRecord studentRecord = new StudentRecord();
        Scanner scanner = new Scanner(System.in);
        boolean continueProcess = true;

        // Add students and their grades using user input
        while (continueProcess) {
            System.out.print("Enter a student's name (or type 'exit' to finish): ");
            String studentName = scanner.nextLine();

            if (studentName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter " + studentName + "'s grade: ");
            int studentGrade = scanner.nextInt();
            scanner.nextLine();
            studentRecord.addStudent(studentName, studentGrade);
        }


        // Check if a student is in the records using user input

        while (continueProcess) {
            System.out.print("Enter a student's name to check if they are in the records: ");
            String studentName = scanner.nextLine();
            boolean isInRecords = studentRecord.isStudentInRecord(studentName);

            if (isInRecords) {
                System.out.println("The student " + studentName + " is in our records");
            } else {
                System.out.println("The student " + studentName + " is not in our records");
            }

            System.out.print("Do you want to check another student? (yes/no): ");
            String checkAnotherStudent = scanner.nextLine();
            if (!checkAnotherStudent.equalsIgnoreCase("yes")) {
                continueProcess = false;
            }
        }


        // Get the grade of a student using user input

        do {
            System.out.print("Enter a student's name to get their grade (or type 'exit' to finish): ");
            String studentName = scanner.nextLine();

            if (studentName.equalsIgnoreCase("exit")) {
                break;
            }

            int getGrade = studentRecord.getGrade(studentName);

            if (getGrade == -1) {
                System.out.println("Student " + studentName + " is not in our records. Please enter a valid student name.");
            } else {
                System.out.println("The grade of " + studentName + " is " + getGrade + " at this time");
            }
        } while (true);

        // Remove a student from the records using user input
        do {
            System.out.print("Enter a student's name to remove them from the records (or type 'exit' to finish): ");
            String studentName = scanner.nextLine();


            if (studentName.equalsIgnoreCase("exit")) {
                break;
            }

            boolean isRemoved = studentRecord.removeStudent(studentName);

            if (!isRemoved) {
                System.out.println("Student " + studentName + " is not in our records. Please enter a valid student name.");
            } else {
                System.out.println("Student " + studentName + " was deleted from our records");
            }
        } while (true);

        // Check if a grade is in the records using user input

        do {
            System.out.print("Enter a grade to check if it is in the records (or type 'exit' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            int grade = Integer.parseInt(input);
            boolean isGrade = studentRecord.containsGrade(grade);

            if (isGrade) {
                System.out.println("The grade: " + grade + " is in our records");
            } else {
                System.out.println("The grade: " + grade + " is not in our records, try with a number between 1 and 10");
            }
        } while (true);

        // Printing all the names in our records
        System.out.println("Now we are going to print all the names of our records");
        Set<String> studentNames = studentRecord.getStudentsNames();

        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
