import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EagerSingletonTest {

    @Test
    public void testUniqueInstances() {
        EagerSingleton s0 = EagerSingleton.getInstance(0);
        EagerSingleton s1 = EagerSingleton.getInstance(1);
        EagerSingleton s2 = EagerSingleton.getInstance(2);

        assertNotEquals(s0, s1);
        assertNotEquals(s1, s2);
        assertNotEquals(s0, s2);
    }

    @Test
    public void testSameInstanceReturned() {
        EagerSingleton sA = EagerSingleton.getInstance(1);
        EagerSingleton sB = EagerSingleton.getInstance(1);

        assertSame(sA, sB);
    }
}
