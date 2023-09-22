package geeks.lessons;

public abstract class Animal {
    String name;
    int swimDistance;
    int swimLimit;
    int runDistance;
    int runLimit;

    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }

    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }

    public Animal(String name, int swimDistance, int runDistance) {
        this.name = name;
        this.swimDistance = swimDistance;
        this.runDistance = runDistance;
    }
    public void swim(){
        if (swimLimit<swimDistance){
            System.out.println(name + " Не смог столько пробежать :("+" из "+ swimLimit+ " пробежал " +swimDistance );
        }
        else System.out.println(name + " пробежал всю дистанцию :)"+" из " + swimLimit+ " проплыл " +swimDistance );
    }
    public void run(){
        if (runLimit<runDistance){
            System.out.println(name + " Не смог столько проплыть :("+" из "+ runLimit+ " пробежал " +runDistance );
        }
        else System.out.println(name + " проплыл всю дистанцию :)"+" из "+ runLimit+ " пробежал " +runDistance );
    }
}
