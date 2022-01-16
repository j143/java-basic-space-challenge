public class U1 extends Rocket {

    private static int COST = 100_000_000;
    private static int WEIGHT = 10;
    private static int MAX_WEIGHT = 18;

    private static double chance_of_launch_explosion = 0.05 * (4/8);
    private static double chance_of_landing_crash = 0.01 * (4/8);

    public static boolean launch() {
        return true;
    }

    public static boolean land() {
        return false;
    }
}
