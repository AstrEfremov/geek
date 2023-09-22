package geeks.lessons;

public class Cat extends Animal {
    int runLimit = 200;
    static int countCats;


    public Cat(String name, int swimDistance, int runDistance) {
        super(name, swimDistance, runDistance);
        setRunLimit(runLimit);
        countCats++;
    }
    public void swim() {
            System.out.println("Коты не умеют плавать");
    }

    public static int getCountCats() {
        return countCats;
    }
}
