package figure;

public class Square {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int area() {
        return this.side * this.side;
    }
}