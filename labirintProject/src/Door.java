public class Door {
    private Room[] adjacentRooms;

    public Door(Room room1, Room room2) {
        adjacentRooms = new Room[2];
        adjacentRooms[0] = room1;
        adjacentRooms[1] = room2;
    }

    public Room getNextRoom(Room currentRoom) {
        if (currentRoom == adjacentRooms[0]) {
            return adjacentRooms[1];
        } else {
            return adjacentRooms[0];
        }
    }
}
