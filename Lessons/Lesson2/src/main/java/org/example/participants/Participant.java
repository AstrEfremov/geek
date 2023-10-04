package org.example.participants;

import org.example.obstacles.Obstacles;

public interface Participant {
    boolean isComplete();
    void action(Obstacles obstacle);
}
