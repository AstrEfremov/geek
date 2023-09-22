package geeks.lessons;

public class Dog extends Animal{
    int swimLimit = 10;
    int runLimit = 500;
    static int countDogs;

    public Dog(String name, int swimDistance, int runDistance) {
        super(name, swimDistance, runDistance);
        setRunLimit(runLimit);
        setSwimLimit(swimLimit);
        countDogs++;
    }
    public static int getCountDogs() {
        return countDogs;
    }

}