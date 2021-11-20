public class Room {

    private Door[] doors;
    private Position position;

    public Room(Position position) {
        this.doors = new Door[4];
       this.position = position;
    }

    public Door[] getDoors() {
        return doors;
    }

    public Position getPosition() {
        return position;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

  //  public int countDoors() {
    //    int c = 0;
       // for (Door d: doors) {
        //    if (d == null) {
        //        c++;
          //  }
     //   }
      //  return c;
    //}
}
