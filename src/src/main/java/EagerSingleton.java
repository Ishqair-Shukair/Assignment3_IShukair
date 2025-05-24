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


    /**
     * Private constructor for EagerSingleton
     * @param id - unique identifier of the instance (0, 1, 2)
     */
    private EagerSingleton(int id) {
        this.id = id;
    }

    /**
     * Returns one of the 3 singleton instances based on index.
     * @param i index of instance (0, 1, 2)
     * @return EagerSingleton instance
     */
    public static EagerSingleton getInstance(int i) {
        return instances[i];
    }

    /**
     * @return instance id
     */

    public int getId() {
        return id;
    }
}
