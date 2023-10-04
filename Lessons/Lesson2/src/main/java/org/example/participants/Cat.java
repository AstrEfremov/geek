package org.example.participants;


import org.example.ability.Jumping;
import org.example.ability.Running;
import org.example.obstacles.Obstacles;
import org.example.obstacles.Treadmill;
import org.example.obstacles.Wall;

public class Cat implements Jumping, Running, Participant {
    int maxLengthOfTreadmill = 1000;
    int maxHeightOfWall = 2;
    int size;
    String name;
    Boolean isComplete = true;

    public Cat(String name) {

        this.name = name;
    }
    @Override
    public boolean isComplete() {
        return isComplete;
    }

    public void action(Obstacles obstacles){
        size = obstacles.getSize();
        if (obstacles.getClass().getSimpleName().equals("Treadmill")){
            run();
        }
        if (obstacles.getClass().getSimpleName().equals("Wall")){
            jump();
        }
    }

    @Override
    public void run() {
        if(maxLengthOfTreadmill<size) {
            System.out.println("Кот " + name + " не смог пробежать");
            isComplete = false;
        }
        else {
        System.out.println("Кот "+ name + "  пробежал "+ size);}
    }

    @Override
    public void jump() {
        if(maxHeightOfWall<size)
        { System.out.println("Кот "+ name+ "  не смог перепрыгнуть");
        isComplete = false;}
        else {System.out.println("Кот "+ name+ "  перепрыгнул "+ size);}
    }
}
