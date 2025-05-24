/**
 * LazySingleton creates instances only when requested.
 * Up to 3 instances total can be created.
 */


public class LazySingleton {

    private static final LazySingleton[] instances = new LazySingleton[3];


    private final int id;
}
