import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LazySingletonTest {

    @Test
    public void testLazyInstancesAreUnique() {
        LazySingleton s0 = LazySingleton.getInstance(0);
        LazySingleton s1 = LazySingleton.getInstance(1);
        LazySingleton s2 = LazySingleton.getInstance(2);

        assertNotEquals(s0, s1);
        assertNotEquals(s1, s2);
        assertNotEquals(s0, s2);
    }
}
