/**
 * LazySingleton creates instances only when requested.
 * Up to 3 instances total can be created.
 */


public class LazySingleton {

    private static final LazySingleton[] instances = new LazySingleton[3];


    private final int id;

    /**
     * Private constructor with ID.
     * @param id unique identifier of the instance
     */
    private LazySingleton(int id) {
        this.id = id;
        System.out.println("LazySingleton " + id + " instantiated");
    }

    /**
     * Returns the singleton instance at the given index.
     * If it doesn't exist, it is created.
     * @param i index [0-2]
     * @return LazySingleton instance
     */
    public static LazySingleton getInstance(int i) {
        if (instances[i] == null) {
            instances[i] = new LazySingleton(i);
        }
        return instances[i];
    }
    /**
     * @return instance id
     */

    public int getId() {
        return id;
    }
}
