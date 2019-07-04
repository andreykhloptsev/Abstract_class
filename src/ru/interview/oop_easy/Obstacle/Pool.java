package ru.interview.oop_easy.Obstacle;

import ru.interview.oop_easy.Participant.Participant;

/**
 * Created by DIO
 */
public class Pool extends Obstacle {
    @Override
    public boolean tryObstacle(Participant p) {
        return p.swim()>=distance;
    }

    public Pool(double distance) {
        super(distance);
    }


    @Override
    public String toString() {
        return "Pool: "+distance;
    }
}
