
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CenozoicAnimalFactoryTest {

    @Test
    public void testEraName() {
        AnimalAbstractFactory factory = new CenozoicAnimalFactory();
        assertEquals("Cenozoic", factory.getEra());
    }
}
