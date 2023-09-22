package geeks.lessons;

public class HouseCat extends Cat{
    int runLimit = 300;

    public HouseCat(String name, int swimDistance, int runDistance) {
        super(name, swimDistance, runDistance);
        setRunLimit(runLimit);
        countCats++;
    }

    public static int getCountTiger() {
        return countCats;
    }
}
