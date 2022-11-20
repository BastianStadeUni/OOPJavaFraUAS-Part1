
class Point {
    public int x = 0;
    public int y = 0;
    //constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}

class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Rectangle() {
        origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
        origin = p;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing the area of the rectangle
    public int getArea() {
        return width * height;
    }
}

public class Task_1 {
	public static void main(String[] args) {
		Point p1 = new Point(0, 5);
		System.out.println("p1 created with x coordinate: " + p1.x + " and y coordinate: " + p1.y);
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(p1);
		Rectangle r3 = new Rectangle(2, 2);
		Rectangle r4 = new Rectangle(p1, 4, 4);
		System.out.println("r1 with origin: (" + r1.origin.x + "|" + r1.origin.y + ") and height: " + r1.height + " and width: " + r1.width + " created, with 1. Constructor");
		System.out.println("r2 with origin: (" + r2.origin.x + "|" + r2.origin.y + ") and height: " + r2.height + " and width: " + r2.width + " created, with 2. Constructor");
		System.out.println("r3 with origin: (" + r3.origin.x + "|" + r3.origin.y + ") and height: " + r3.height + " and width: " + r3.width + " created, with 3. Constructor");
		System.out.println("r4 with origin: (" + r4.origin.x + "|" + r4.origin.y + ") and height: " + r4.height + " and width: " + r4.width + " created, with 4. Constructor");
		r1.move(5, 5);
		System.out.println("r1 moved from (0/0) to (5/5)");
		System.out.println("Area of r3: " + r3.getArea() + "	Area of r4: " + r4.getArea());
	
	}
}
