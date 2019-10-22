import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest {
    @Test
    void sortListBy() {
        Animal animal1 = new Animal("dolphin", "winter", 2003) {
        };
        Animal animal2 = new Animal("dog", "rex", 2010) {
        };
        Animal animal3 = new Animal("girafe", "giselle", 2012) {
        };
        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        Main.sortAnimalsByName(animalList);
        assertEquals("rex", animalList.get(1).getName());
        Main.sortSwimmersByBirthDate(animalList);
        assertEquals(2012, animalList.get(2).getBirth());
    }
}
