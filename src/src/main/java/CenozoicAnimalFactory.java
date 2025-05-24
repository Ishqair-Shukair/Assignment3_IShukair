import java.util.Arrays;
import java.util.List;

public class CenozoicAnimalFactory implements AnimalAbstractFactory {
    public String getEra() {
        return "Cenozoic";
    }

    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Mammoth(), new CaveLion(), new WoollyRhino());
    }

    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Otodus(), new Whale());
    }

    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Argentavis());
    }
}

// Animal Implementations (in their own files ideally)
public class Mammoth implements LandAnimal {
    public String getName() { return "Mammoth"; }
    public String getWalking() { return "stomping"; }
}
public class CaveLion implements LandAnimal {
    public String getName() { return "Cave lion"; }
    public String getWalking() { return "walking"; }
}
public class WoollyRhino implements LandAnimal {
    public String getName() { return "Woolly rhino"; }
    public String getWalking() { return "running"; }
}
public class Otodus implements SeaAnimal {
    public String getName() { return "Otodus"; }
    public String getSwimming() { return "hunting"; }
}
public class Whale implements SeaAnimal {
    public String getName() { return "Whale"; }
    public String getSwimming() { return "swimming"; }
}
public class Argentavis implements SkyAnimal {
    public String getName() { return "Argentavis"; }
    public String getFlying() { return "flapping"; }
}