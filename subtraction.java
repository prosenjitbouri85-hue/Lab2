// Class with overloaded subtract methods
class Subtraction {

    // subtract two integers
    int subtract(int a, int b) {
        return a - b;
    }

    // subtract three integers
    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // subtract two double values
    double subtract(double a, double b) {
        return a - b;
    }
}

 class Demo {
    public static void main(String[] args) {

        Subtraction s = new Subtraction();

        // Calling different subtract methods
        System.out.println("Subtract two integers: " + s.subtract(10, 5));
        System.out.println("Subtract three integers: " + s.subtract(20, 5, 3));
        System.out.println("Subtract two doubles: " + s.subtract(15.5, 4.2));
    }
}
