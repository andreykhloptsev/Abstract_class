package ru.interview.oop_easy.Obstacle;

import ru.interview.oop_easy.Participant.Participant;

/**
 * Created by DIO
 */
public class Cross extends Obstacle {
    @Override
    public boolean tryObstacle(Participant p) {
        return p.run()>=distance;
    }

    public Cross(double distance) {
        super(distance);
    }

    @Override
    public String toString() {
        return "Cross: "+distance;
    }
}
