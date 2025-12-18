import java.util.Scanner;

class AreaOfRectangle {

    double length, breadth;

    // Default constructor
    AreaOfRectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    AreaOfRectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to display area
    void showArea() {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object using default constructor
        AreaOfRectangle r1 = new AreaOfRectangle();
        r1.showArea();

        // User input
        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        // Object using parameterized constructor
        AreaOfRectangle r2 = new AreaOfRectangle(l, b);
        r2.showArea();

        sc.close();
    }
}

