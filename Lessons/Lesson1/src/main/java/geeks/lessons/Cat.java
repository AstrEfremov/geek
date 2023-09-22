package geeks.lessons;

public abstract class Cat extends Animal {
    static int countCats;

    public Cat(String name, int swimDistance, int runDistance) {
        super(name, swimDistance, runDistance);
    }
    public void swim() {
        System.out.println("Кошачии не умеют плавать");
    }
}
