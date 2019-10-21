public abstract class Animal {

    private String type;
    private String name;
    private int birth;

    public Animal(String type, String name, int birth) {
        this.type = type;
        this.name = name;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d", type, name, birth);
    }

    void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getBirth() {
        return birth;
    }
}
