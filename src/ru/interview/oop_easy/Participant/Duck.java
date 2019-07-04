package ru.interview.oop_easy.Participant;

/**
 * Created by DIO
 */
public class Duck extends Participant {
    @Override
    public double run() {
        return 0.7;
    }

    @Override
    public double swim() {
        return 5;
    }

    @Override
    public double jump() {
        return 0.3;
    }


    @Override
    public String toString() {
        return "Duck";
    }
}
