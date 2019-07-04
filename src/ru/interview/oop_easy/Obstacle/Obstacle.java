package ru.interview.oop_easy.Obstacle;

import ru.interview.oop_easy.Participant.Participant;

/**
 * Created by DIO
 */
public abstract class Obstacle {
    protected double distance;

    public Obstacle(double distance) {
        this.distance = distance;
    }

    public abstract boolean tryObstacle(Participant p);
}
