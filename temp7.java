package core_practices;

public class temp7 {

    public static void main(String[] args) {

        Aeroplane one = new Aeroplane();
        Aeroplane two = new Aeroplane();

        one.pilot = "ABC";
        two.pilot = "DEF";

        one.takeoff();
        two.takeoff();
    }
}

class Aeroplane {

    String name = "AIR_INDIA";
    String pilot;

    public void takeoff() {
        System.out.println(name + " is taking off...");
        System.out.println("Pilot: " + pilot);
    }
}