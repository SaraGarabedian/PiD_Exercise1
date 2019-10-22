import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Save {

    public static void saveFile(Collection<Animal> swimmers, String fileName) throws IOException {
        FileWriter write = new FileWriter(new File(fileName), false);
        PrintWriter print_line = new PrintWriter(write);
        for (Animal swimmer : swimmers) {
            print_line.println(swimmer.toString());
        }
        print_line.close();
        write.close();
    }

    public static void loadTasks(List<Animal> animalList, String fileName) throws Exception {
        File file = new File(fileName);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File location: " + file.getAbsolutePath() + "\n" + e.getMessage());
        }
        while (sc.hasNextLine()) {
            String currentTaskString = sc.nextLine();
            String[] splitList = currentTaskString.split(",");
            String type = splitList[0];
            String name = splitList[1];
            String birthYear = splitList[2];
            try {
                int birth = Integer.parseInt(birthYear);
                Animal animal = createAnimal(type, name, birth);
                animalList.add(animal);
            } catch (Exception e) {
                System.out.println("Invalid data: " + currentTaskString);
            }

        }
        sc.close();
    }

    private static Animal createAnimal(String type, String name, int birth) throws Exception {
        switch (type) {
            case "golden retriever":
                return new GoldenRetriever(type, name, birth);
            case "dolphin":
                return new Dolphin(type, name, birth);
            case "duck":
                return new Duck(type, name, birth);
            case "bengal cat":
                return new BengalCat(type, name, birth);
            case "chicken":
                return new Chicken(type, name, birth);
            case "arabian horse":
                return new ArabianHorse(type, name, birth);
            case "german shepherd":
                return new GermanShepherd(type, name, birth);
            case "great white shark":
                return new GreatWhiteShark(type, name, birth);
            case "parakeet":
                return new Parakeet(type, name, birth);
            default:
                throw new Exception("This is an unknown animal: " + type + ".");
        }
    }
}
