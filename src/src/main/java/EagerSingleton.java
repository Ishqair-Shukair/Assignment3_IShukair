/**
 * EagerSingleton creates 3 instances at  startup.
 * You can get an instance by index [0-2].
 */

public class EagerSingleton {

    private static final EagerSingleton[] instances = new EagerSingleton[3];


    static {
        for (int i = 0; i < 3; i++) {
            instances[i] = new EagerSingleton(i);
            System.out.println("EagerSingleton " + i + " instantiated");
        }
    }

    private final int id;

}
