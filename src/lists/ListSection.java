package lists;

import java.util.Scanner;

public class ListSection {
    // Create an instance of Task Manager
    public static void main(String[] args) {

        System.out.println("instantiating a TaskManager Class...");
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        boolean continueProcess = true;

        // Add some tasks using the addTask() method via user input.
        do {
            System.out.println("Enter a task (or type 'exit' to finish): ");
            String inputTask = scanner.nextLine();
            if (inputTask.equalsIgnoreCase("exit")) {
                break;
            }
            taskManager.addTask(inputTask);
        } while (true);

        // Marking a task as completed with the method markTaskAsCompleted

        do {
            System.out.println("marking a task as completed with the method markTaskAsCompleted...");
            System.out.print("Enter the index of the task to mark as completed (or type 'exit' to finish): ");
            String completedInput = scanner.nextLine();
            if (completedInput.equalsIgnoreCase("exit")) {
                break;
            }
            int completedIndex = Integer.parseInt(completedInput);
            taskManager.markTaskAsCompleted(completedIndex);
        } while (true);

        // Removing a Task via user input

        do {
            System.out.println("removing a task...");
            System.out.print("Enter the index of the task to remove (or type 'exit' to finish): ");
            String removedInput = scanner.nextLine();
            if (removedInput.equalsIgnoreCase("exit")) {
                break;
            }
            int removedIndex = Integer.parseInt(removedInput);
            taskManager.removeTask(removedIndex);
        } while (true);

        // Printing the task list

        System.out.println("printing the task list...");
        taskManager.printTaskList();

        // Using method contains via user input

        do {
            System.out.println("Checking task with contains() method...");
            System.out.print("Enter a task to check if it's in the list (or type 'exit' to finish): ");
            String taskToCheck = scanner.nextLine();
            if (taskToCheck.equalsIgnoreCase("exit")) {
                break;
            }
            boolean isInList = taskManager.contains(taskToCheck);
            System.out.println("Task: " + taskToCheck + " is in the list?: " + isInList);
        } while (true);

        // Using method isEmpty

        System.out.println("Using method isEmpty()");
        boolean isEmpty = taskManager.isEmpty();
        System.out.println("The list is empty?: " + isEmpty);

        // Using method sort()

        System.out.println("Using method sort()...");
        taskManager.sortTasksAlphabetically();
        System.out.println("Getting the new sorted list...");
        taskManager.printTaskList();

        // Converting to Array with toArray()

        System.out.println("Converting to Array with toArray()...");
        String[] taskArray = taskManager.getTaskArray();
        System.out.println("Printing the new array...");

        for (String task : taskArray) {
            System.out.println(task);
        }
    }
}
