package collection;

import java.util.ArrayList;

public class toStringequality {

    public static void main(String[] args) {

        ArrayList<Books> arr = new ArrayList<Books>();

        arr.add(new Books(100, "agnipankh"));
        arr.add(new Books(200, "amrutvel"));

        System.out.println(arr);

        System.out.println(arr.contains(new Books(200, "amrutvel")));

        /*
         * Contains ==> 1. equals() method
         *             2. to check the equality
         */
    }
}
class Books {

    double price;
    String name;

    public Books(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String toString() {
        return this.name + "::" + this.price;
    }

    public boolean equals(Object obj) {
        System.out.println("-----------------------");

        Books b = (Books) obj;

        return this.name.equals(b.name) && this.price == b.price;
    }
}