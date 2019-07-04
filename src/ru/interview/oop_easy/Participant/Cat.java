package ru.interview.oop_easy.Participant;

/**
 * Created by DIO
 */
public class Cat extends Participant {
    @Override
    public double run() {
        return 1.5;
    }

    @Override
    public double swim() {
        return 0;
    }

    @Override
    public double jump() {
        return 2;
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
