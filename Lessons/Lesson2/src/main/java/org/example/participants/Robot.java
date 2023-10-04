package org.example.participants;

import org.example.ability.Jumping;
import org.example.ability.Running;
import org.example.obstacles.Obstacles;

public class Robot implements Jumping, Running, Participant {
    int maxLengthOfTreadmill = 10000;
    int maxHeightOfWall = 100;
    int size;
    String name;
    Boolean isComplete = true;

    public Robot(String name) {

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
            System.out.println("Робот " + name + "  не смог пробежать");
            isComplete = false;
        }
        else {
        System.out.println("Робот "+ name+ "  пробежал "+ size);}
    }

    @Override
    public void jump() {
        if(maxHeightOfWall<size){
            System.out.println("Робот "+ name+ "  не смог перепрыгнуть");
            isComplete = false;
        }
        else {
        System.out.println("Робот "+ name+ "  перепрыгнул "+ size);}
    }
}