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

    @Test
    public void testLazyInstanceSameObject() {
        LazySingleton a = LazySingleton.getInstance(0);
        LazySingleton b = LazySingleton.getInstance(0);
        assertSame(a, b);
    }

    @Test
    public void testLazyIdCheck() {
        LazySingleton s = LazySingleton.getInstance(1);
        assertEquals(1, s.getId());
    }
}
