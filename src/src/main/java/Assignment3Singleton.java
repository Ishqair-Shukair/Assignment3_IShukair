/**
 * Demonstrates usage of EagerSingleton and LazySingleton.
 */


public class Assignment3Singleton {
    public static void main(String[] args) {

        java.util.Random r = new java.util.Random();


        for (int i = 0; i < 10; i++) {
            EagerSingleton s = EagerSingleton.getInstance(r.nextInt(3));
            System.out.println("Retrieved eager singleton " + s.getId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
