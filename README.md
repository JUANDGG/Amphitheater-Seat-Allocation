# Amphitheater Seat Allocation

This is a Java program for managing seat allocation in an amphitheater. It allows users to view the seating arrangement, assign seats, and continue until they finish.

## Technologies Used

- **Java**: Programming language used for the implementation.
- **Scanner Class**: Used for user input.
- **IDE (Integrated Development Environment)**: Used for development and testing.

## Class Structure

The program consists of a single class:

- **AmphitheaterSeatAllocation**: Main class responsible for managing the seat allocation process.

## Class Members

### Constants

- `NUM_ROWS`: Total number of rows in the amphitheater.
- `NUM_SEATS`: Total number of seats per row.
- `SEAT_FREE`: Symbol representing a free seat.
- `SEAT_OCCUPIED`: Symbol representing an occupied seat.

### Fields

- `amphitheater`: 2D array representing the seating arrangement.
- `scanner`: Scanner object for user input.

### Methods

- `initializeAmphitheater()`: Initializes the seating arrangement with free seats.
- `showMap()`: Displays the seating arrangement.
- `checkRow(int rowNumber)`: Checks if the given row number is valid.
- `checkSeat(int seatNumber)`: Checks if the given seat number is valid.
- `checkAvailableSeat(int rowNumber, int seatNumber)`: Checks if the given seat is available.
- `assignSeat(int rowNumber, int seatNumber)`: Assigns the given seat to the user.
- `userEntry()`: Prompts the user to enter the desired row and seat.

## Usage

1. Create an instance of the `AmphitheaterSeatAllocation` class.
2. Use the `showMap()` method to display the seating arrangement.
3. Use the `userEntry()` method to assign seats to users.
4. Continue assigning seats as needed.
5. Exit the program when finished.

## Example

```java
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