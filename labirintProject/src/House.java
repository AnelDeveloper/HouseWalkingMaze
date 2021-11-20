public class House {

    private Room[][] rooms;
    private Door entranceDoor;

    public House(Room[][] rooms, Door entranceDoor) {
        this.rooms = rooms;
        this.entranceDoor = entranceDoor;
    }
// eNTER hOUSE

    public Room enterHouse() {
        return entranceDoor.getNextRoom(new Room(new Position(-1, -1)));
    }

    // Create House

    public static House CreateHouse() {
        Room[][] internalRooms = new Room[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                internalRooms[j][i] = new Room(new Position(j, i));
            }
        }
        // Outside Doors
        Room exteriorRoom = new Room(new Position(-1, -1));
        Door eDoor = new Door(exteriorRoom, internalRooms[1][1]);
        exteriorRoom.setDoors(new Door[] {eDoor, null, null, null});

// Doors from house
        Door door1 = new Door(internalRooms[0][0], internalRooms[0][1]);
        Door door2 = new Door(internalRooms[0][0], internalRooms[1][0]);
        Door door3 = new Door(internalRooms[1][0], internalRooms[1][1]);
        Door door4 = new Door(internalRooms[1][1], internalRooms[0][1]);

        // Set Doors , left right behind

        internalRooms[0][0].setDoors(new Door[]{null, door2, door1, null});
        internalRooms[0][1].setDoors(new Door[]{door1, door4, null, null});
        internalRooms[1][0].setDoors(new Door[]{null, null, door3, door2});
        internalRooms[1][1].setDoors(new Door[]{door3, null, eDoor, door4});

        return new House(internalRooms, eDoor);
    }
}
