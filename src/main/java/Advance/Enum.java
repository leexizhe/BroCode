package Advance;

public class Enum {
    public static void main(String[] args) {
        Planet planet1 = Planet.EARTH;
        canILiveHere(planet1);
        System.out.println("");
        Planet planet2 = Planet.MARS;
        canILiveHere(planet2);
        System.out.println("");
        Planet planet3 = Planet.PLUTO;
        canILiveHere(planet3);
    }

    static void canILiveHere(Planet myPlanet) {
        switch (myPlanet) {
            case EARTH:
                System.out.printf("You are safe on and the planet is %d", myPlanet.number);
                break;
            case MARS:
                System.out.printf("You are not safe on and the planet is %d", myPlanet.number);
                break;
            default:
                System.out.println("GG");
        }

    }

    enum Planet {
        MERCURY(1),
        VENUS(2),
        EARTH(3),
        MARS(4),
        JUPITER(5),
        SATURN(6),
        URANUS(7),
        NEPTUNE(8),
        PLUTO(9);

        int number;

        Planet(int number) {
            this.number = number;
        }
    }
}


