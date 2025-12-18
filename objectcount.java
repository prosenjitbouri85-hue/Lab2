class ObjectCount {

    // static variable to count objects
    static int count = 0;

    // constructor
    ObjectCount() {
        count++;
    }

    public static void main(String[] args) {

        // creating objects
        ObjectCount obj1 = new ObjectCount();
        ObjectCount obj2 = new ObjectCount();
        ObjectCount obj3 = new ObjectCount();

        // printing number of objects created
        System.out.println("Number of objects created: " + count);
    }
}

