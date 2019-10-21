import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Animal> animals = new ArrayList<>();
        List<Animal> swimmers = new ArrayList<>();
        try {
            Save.loadTasks(animals, "animals.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
        sortAnimalsByName(animals);
        System.out.println("\nList sorted by name: ");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nThis is a swimmer: ");
        for (Animal animal : animals) {
            if (animal instanceof Swimmer) {
                System.out.println(animal);
                swimmers.add(animal);
            }
        }
        sortSwimmersByBirthDate(swimmers);
        System.out.println("\nSwimmers sorted by birth year: ");
        printListToConsole(swimmers);
        Save.saveFile(swimmers, "swimmers.csv");
    }

    static <T> void printListToConsole(List<T> list) {
        for (T animal : list) {
            System.out.println(animal);
        }
    }

    static void sortAnimalsByName(List<Animal> list) {
        Collections.sort(list, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    static void sortSwimmersByBirthDate(List<Animal> list) {
        Collections.sort(list, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return Integer.valueOf(o1.getBirth()).compareTo(Integer.valueOf(o2.getBirth()));
            }
        });
    }
}
