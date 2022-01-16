public class Rocket implements SpaceShip {
    public static boolean launch() {
        return true;
    }

    public static boolean land() {
        return true;
    }

    public static boolean canCarry() {
        return false;
    }

    public static void carry(Item item) {
        // do nothing
    }
}
