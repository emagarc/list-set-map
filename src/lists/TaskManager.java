package lists;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private List<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public TaskManager(List<String> tasks) {
        this.tasks = tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            String taskName = tasks.get(index);
            tasks.set(index, taskName + " --- COMPLETED");
        } else {
            System.out.println("Please enter a valid index");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Please enter a valid index");
        }
    }

    public void printTaskList() {
        if (tasks.isEmpty()) {
            System.out.println("The task list is empty");
        } else {
            System.out.println("Task List:");
            int taskIndex = 1;
            for (String task : tasks) {
                System.out.println(taskIndex + ". " + task);
                taskIndex++;
            }
        }
    }

    public boolean contains(String taskToFind) {
        return tasks.contains(taskToFind);
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    public void sortTasksAlphabetically() {
        Collections.sort(tasks);
    }

    public String[] getTaskArray() {
        return tasks.toArray(new String[0]);
    }

}
