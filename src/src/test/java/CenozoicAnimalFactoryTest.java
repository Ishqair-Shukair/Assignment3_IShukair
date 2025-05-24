
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CenozoicAnimalFactoryTest {

    @Test
    public void testEraName() {
        AnimalAbstractFactory factory = new CenozoicAnimalFactory();
        assertEquals("Cenozoic", factory.getEra());
    }

    @Test
    public void testLandAnimals() {
        AnimalAbstractFactory factory = new CenozoicAnimalFactory();
        List<LandAnimal> animals = factory.createLandAnimals();
        assertEquals(3, animals.size());
        assertTrue(animals.stream().anyMatch(a -> a.getName().equals("Mammoth")));
    }
}
