public class GermanShepherd extends Animal implements Swimmer {
    public GermanShepherd(String type, String name, int birth) {
        super(type, name, birth);
    }

    @Override
    public void swim() {
        System.out.println("A little bit.");
    }
}
