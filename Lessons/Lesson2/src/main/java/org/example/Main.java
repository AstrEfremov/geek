package org.example;

import org.example.obstacles.Obstacles;
import org.example.obstacles.Treadmill;
import org.example.obstacles.Wall;
import org.example.participants.Cat;
import org.example.participants.Human;
import org.example.participants.Participant;
import org.example.participants.Robot;


public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[]{
                new Cat("Barsik"),
                new Human("Bob"),
                new Robot("robot")
        };
        Obstacles [] obstacles = new Obstacles[]{
                new Treadmill(1000),
                new Wall(100),
                new Wall(100),
                new Wall(100000),
                new Wall(100),

        };
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                participants[i].action(obstacles[j]);
                if (!participants[i].isComplete()) {
                    System.out.println("Следующий!!!");
                    System.out.println();
                    break;
                }
            }
        }
    }
}