public class Square extends Rectangle {
    private double side = 1.0;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }


    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return getWith();
    }

    public void setSide(double side) {
        setWith(side);
        setLength(side);

    }
}
