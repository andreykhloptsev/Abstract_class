package ru.interview.oop_easy.Obstacle;

import ru.interview.oop_easy.Participant.Participant;

/**
 * Created by DIO
 */
public class Fence extends Obstacle {
    @Override
    public boolean tryObstacle(Participant p) {
        return p.jump()>=distance;
    }

    public Fence(double distance) {
        super(distance);
    }



    @Override
    public String toString() {
        return "Fence: "+distance;
    }
}
