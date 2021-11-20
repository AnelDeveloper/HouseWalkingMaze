import java.util.Scanner;

public class Labyrinth {
    public static void main(String[] args){
        House maze = House.CreateHouse();
        Room currentRoom = maze.enterHouse();

        System.out.println("Walk the rooms using directions, or exit with x");
        String direction;
        //String direction = readLine();
        while (true) {
            System.out.print("Current room: " + currentRoom.getPosition() + ". You can use the doors: ");
            Door[] currentRoomDoors = currentRoom.getDoors();

            for (int i = 0; i < currentRoomDoors.length; i++) {
                if (currentRoomDoors[i] != null) {
                    System.out.print(indexToDirection(i) + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();

            direction = readLine();
            if (direction.equals("x")) {
                break;
            }

            if (!direction.equals("N") && !direction.equals("E") && !direction.equals("S") && !direction.equals("W")) {
                System.out.println("Invalid direction. Please try again.");
                continue;
            }

            currentRoom = currentRoomDoors[directionToIndex(direction)].getNextRoom(currentRoom);
        }

    }

    public static String indexToDirection(int index) {
        switch (index) {
            case 0:
                return "N";
            case 1:
                return "E";
            case 2:
                return "S";
            case 3:
                return "W";
            default:
                return null;
        }
    }

    public static int directionToIndex(String direction) {
        switch (direction) {
            case "N":
                return 0;
            case "E":
                return 1;
            case "S":
                return 2;
            case "W":
                return 3;
            default:
                return -1;
        }
    }

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which direction do you want to go: ");
        String input = scanner.nextLine();
        return input;
    }
}
