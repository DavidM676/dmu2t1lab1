public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x) {
        this.x = this.y = x;
    }

    public Point() {
        x = y = 0;
    }

    public int getX() {
        return this.x;
    }
    public int getY() { return this.y; }
    public void setX(int newX) {this.x = newX; }
    public void setY(int newY) {this.y = newY; }

    public String coordinate() {
        return "("+x+", "+y+")";
    }

    public String quadrant() {
        if (x == 0 || y == 0) {
            if (x == 0 && y ==0) {
                return "origin";

            } else {
                return "on an axis";
            }
        } else {
            if (x>0) {
                if (y<0) {
                    return "IV";
                } else {
                    return "I";
                }
            } else {
                if (y<0) {
                    return "III";
                } else {
                    return "II";
                }
            }
        }
    }

}
