public class Position {
    int Columns = 5;
    int Rows = 5;


    public Position(int Columns , int Rows) {
        this.Columns = Columns;
        this.Rows = Rows;

    }

    public int getCol() {
        return this.Columns;

    }

    public int getRows() {
        return this.Columns;

    }

    public String toString() {
        return "(" + Columns + "," + Rows + ")";
}


public enum Direction
{
    // enum fields

    EAST, WEST , NORTH ,SOUTH;



}
}