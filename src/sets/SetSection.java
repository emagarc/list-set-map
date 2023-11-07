package sets;

import java.util.Scanner;

public class SetSection {

    public static void main(String[] args) {

        System.out.println("instantiating a PartyGuestList Class...");
        PartyGuestList partyGuestList = new PartyGuestList();
        Scanner scanner = new Scanner(System.in);

        boolean continueProcess = true;

        // Using addGuest()
        do {
            while (continueProcess) {
                System.out.println("Please enter at least 5 guests:");
                int guestsAdded = 0;

                while (guestsAdded < 5) {
                    System.out.println("Guest " + (guestsAdded + 1) + ": ");
                    String guest = scanner.nextLine();
                    partyGuestList.addGuest(guest);
                    guestsAdded++;
                }

                System.out.println("Guests added, thank you.");

                System.out.print("Do you want to continue adding guests? (yes/no): ");
                String addMoreGuests = scanner.nextLine();
                if (!addMoreGuests.equalsIgnoreCase("yes")) {
                    break;
                }
            }

            while (true) {
                // Removing a guest
                System.out.println("Now, we are going to remove a guest.");
                System.out.print("Please type the name of the guest to remove: ");
                String guest = scanner.nextLine();
                partyGuestList.removeGuest(guest);
                System.out.println("Guest " + guest + " removed.");

                System.out.print("Do you want to remove another guest? (yes/no): ");
                String removeMoreGuests = scanner.nextLine();
                if (!removeMoreGuests.equalsIgnoreCase("yes")) {
                    break;
                }
            }

            // Checking if a guest  is in List
            while (true) {
                System.out.print("Please type the name of the guest to check: ");
                String guestToCheck = scanner.nextLine();
                System.out.println("Checking if the guest: " + guestToCheck + " is in the list.");

                if (partyGuestList.isGuestInList(guestToCheck)) {
                    System.out.println(guestToCheck + " is in the guest list.");
                } else {
                    System.out.println(guestToCheck + " is not in the guest list.");
                }

                System.out.print("Do you want to check another guest? (yes/no): ");
                String checkAnotherGuest = scanner.nextLine();
                if (!checkAnotherGuest.equalsIgnoreCase("yes")) {
                    break;
                }
            }

            // Getting all the guests
            System.out.println("Getting all the guests...");
            int allTheGuests = partyGuestList.getTotalGuests();
            System.out.println("The total amount of guests is " + allTheGuests);

            // Checking if the guest list is empty
            System.out.println("Checking if the guest list is empty");
            boolean isEmpty = partyGuestList.isEmpty();
            System.out.println("The guest list is empty?: " + isEmpty);


            System.out.print("Do you want to repeat the whole Set Section? (yes/no): ");
            String repeatSection = scanner.nextLine();
            continueProcess = repeatSection.equalsIgnoreCase("yes");

        } while (continueProcess);
    }
}
