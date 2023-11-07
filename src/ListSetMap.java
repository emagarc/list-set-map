import lists.ListSection;
import maps.MapSection;
import sets.SetSection;

import java.util.Scanner;

public class ListSetMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ListSetMap App!");
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "! This app will manage three sections: Lists, Sets, and Maps.");

        boolean repeatApp = true;

        do {
            String sectionChoice;

            while (true) {
                System.out.println(userName + ", select a section to interact with:");
                System.out.println("1. Lists Section");
                System.out.println("2. Sets Section");
                System.out.println("3. Maps Section");
                System.out.print("Enter the section number (1/2/3) or 'exit' to finish: ");
                sectionChoice = scanner.nextLine();

                if (sectionChoice.equalsIgnoreCase("exit")) {
                    repeatApp = false;
                    break;
                } else if (sectionChoice.equals("1") || sectionChoice.equals("2") || sectionChoice.equals("3")) {
                    break;
                } else {
                    System.out.println("Invalid section choice. Please try again.");
                }
            }

            if (!repeatApp) {
                break;
            }

            switch (sectionChoice) {
                case "1":
                    ListSection.main(args);
                    break;
                case "2":
                    SetSection.main(args);
                    break;
                case "3":
                    MapSection.main(args);
                    break;
            }

            System.out.print(userName + ", do you want to repeat the current section (1), choose another section (2), or exit (3)? (1/2/3): ");
            String repeatChoice = scanner.nextLine();
            if (repeatChoice.equals("3")) {
                repeatApp = false;
            } else if (repeatChoice.equals("2")) {
                continue;
            }
        } while (repeatApp);

        System.out.println("Thank you for using the ListSetMap App, " + userName + "!");
        scanner.close();
    }
}