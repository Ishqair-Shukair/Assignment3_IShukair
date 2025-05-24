/**
 * EagerSingleton creates 3 instances at  startup.
 * You can get an instance by index [0-2].
 */

public class EagerSingleton {

    private static final EagerSingleton[] instances = new EagerSingleton[3];
}
