public class Dolphin extends Animal implements Swimmer {

    public Dolphin(String type, String name, int birth) {
        super(type, name, birth);
        this.setType("dolphin");
    }

    @Override
    public void swim() {
        System.out.println("Dolphins can swim.");
    }
}