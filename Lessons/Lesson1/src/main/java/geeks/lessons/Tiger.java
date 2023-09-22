package geeks.lessons;

public class Tiger extends Cat{
    int runLimit = 1500;

    public Tiger(String name, int swimDistance, int runDistance) {
        super(name, swimDistance, runDistance);
        setRunLimit(runLimit);
        countCats++;
    }

    public static int getCountTiger() {
        return countCats;
    }
}
