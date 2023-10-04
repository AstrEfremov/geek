package org.example.obstacles;

import org.example.ability.Jumping;

public class Wall implements Obstacles, Jumping {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void jump() {
    }

    @Override
    public int getSize() {
        return height;
    }
}
