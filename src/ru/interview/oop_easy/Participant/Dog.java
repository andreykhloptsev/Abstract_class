package ru.interview.oop_easy.Participant;

/**
 * Created by DIO
 */
public class Dog extends Participant {
    @Override
    public double run() {
        return 3;
    }

    @Override
    public double swim() {
        return 0.7;
    }

    @Override
    public double jump() {
        return 1;
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
