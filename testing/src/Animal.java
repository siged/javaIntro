public class Animal implements AnimalInterface {

    private String kind;
    private int weight;
    private int age;

    public Animal(String kind, int weight, int age) {
        this.kind = kind;
        this.weight = weight;
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{" +
                "kind='" + kind + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
