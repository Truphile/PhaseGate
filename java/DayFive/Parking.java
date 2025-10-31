import java.util.Arrays;
import java.util.Scanner;

public class Parking {

    int[] carSlots = new int[20];

    public void enterParkingLot(int carNumber) {
        for (int lobbyCount = 0; lobbyCount < carSlots.length; lobbyCount++) {
            if (carSlots[lobbyCount] == 0) {
                carSlots[lobbyCount] = carNumber;
                System.out.println("Car " + carNumber + " parked in slot " + (lobbyCount + 1));
                displayStatus();
                return;
            }
        }
        System.out.println("Parking lot full! Car " + carNumber + " cannot enter find another garage!! abi you want make dem toll your car?");
    }

    public void leaveParkingLot(int carSlotNumber) {
        if (carSlotNumber < 1 || carSlotNumber > 20) {
            System.out.println("Invalid slot number!");
	    System.out.println("Oga! your car no dey here!");
	    System.out.println("Police is coming for you");
            return;
        }
        if (carSlots[carSlotNumber - 1] == 0) {
            System.out.println("Slot " + carSlotNumber + " is already empty!");
        } else {
            System.out.println("Car " + carSlots[carSlotNumber - 1] + " left slot " + carSlotNumber);
            carSlots[carSlotNumber - 1] = 0;
        }
        displayStatus();
    }

    public void displayStatus() {
        System.out.println("Parking Status: " + Arrays.toString(carSlots));
    }

    public static void main(String[] args) {
        Parking parking = new Parking();
        Scanner scanner = new Scanner(System.in);

        while (true) {
	    System.out.println("\n===Welcome to Devs parking Lot===");
            System.out.println("\n1. Enter Parking Lot");
            System.out.println("2. Leave Parking Lot");
            System.out.println("3. Display Status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();
	

            switch (choice) {
                case "1":
                    System.out.print("Enter car number: ");
                    int carNumber = Integer.parseInt(scanner.nextLine());
                    parking.enterParkingLot(carNumber);
                    break;

                case "2":
                    System.out.print("Enter slot number to leave: ");
                    int slotNumber = Integer.parseInt(scanner.nextLine());
                    parking.leaveParkingLot(slotNumber);
                    break;

                case "3":
                    parking.displayStatus();
                    break;

                case "4":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option!, Oga you don't follow rules, try again!");
            }
        }
    }
}
