package org.example.obstacles;

import org.example.ability.Running;

public class Treadmill implements Obstacles, Running {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void run() {

    }
    @Override
    public int getSize() {
        return length;
    }
}
