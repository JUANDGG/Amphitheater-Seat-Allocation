
import java.util.Scanner;

public class AmphitheaterSeatAllocation {

    private static final int NUM_ROWS = 10;
    private static final int NUM_SEATS = 10;
    private static final char SEAT_FREE = 'F';
    private static final char SEAT_OCCUPIED = 'X';

    private char[][] amphitheater;
    private Scanner scanner;

    public AmphitheaterSeatAllocation() {
        amphitheater = new char[NUM_ROWS][NUM_SEATS];
        initializeAmphitheater();
        scanner = new Scanner(System.in);
    }

    private void initializeAmphitheater() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_SEATS; j++) {
                amphitheater[i][j] = SEAT_FREE;
            }
        }
    }

    public void showMap() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_SEATS; j++) {
                System.out.print("|" + amphitheater[i][j] + "|");
            }
            System.out.println();
        }
    }

    public boolean checkRow(int rowNumber) {
        return rowNumber > 0 && rowNumber <= NUM_ROWS;
    }

    public boolean checkSeat(int seatNumber) {
        return seatNumber > 0 && seatNumber <= NUM_SEATS;
    }

    public boolean checkAvailableSeat(int rowNumber, int seatNumber) {
        return amphitheater[rowNumber - 1][seatNumber - 1] == SEAT_FREE;
    }

    public void assignSeat(int rowNumber, int seatNumber) {
        if (!checkRow(rowNumber) || !checkSeat(seatNumber)) {
            System.out.println("Invalid seat or row number.");
            return;
        }

        if (!checkAvailableSeat(rowNumber, seatNumber)) {
            System.out.println("The seat is already occupied.");
            return;
        }

        amphitheater[rowNumber - 1][seatNumber - 1] = SEAT_OCCUPIED;
        System.out.println("Seat assigned successfully.");
    }

    public void userEntry() {
        System.out.print("Enter the row you want: ");
        int row = scanner.nextInt();
        System.out.print("Enter the seat you want: ");
        int seat = scanner.nextInt();

        assignSeat(row, seat);
    }

    public static void main(String[] args) {
        AmphitheaterSeatAllocation exercise1 = new AmphitheaterSeatAllocation();
        Scanner scanner = new Scanner(System.in);

        boolean continueFlag = true;
        while (continueFlag) {
            exercise1.showMap();
            exercise1.userEntry();

            System.out.println("Do you want to continue (Y/N)?");
            String response = scanner.nextLine().trim().toUpperCase();
            if (!response.equals("Y")) {
                continueFlag = false;
            }
        }

        scanner.close();
        System.out.println("Thank you for using the program!");
    }
}
