package ru.interview.oop_easy;


import ru.interview.oop_easy.Obstacle.Cross;
import ru.interview.oop_easy.Obstacle.Fence;
import ru.interview.oop_easy.Obstacle.Obstacle;
import ru.interview.oop_easy.Obstacle.Pool;
import ru.interview.oop_easy.Participant.Cat;
import ru.interview.oop_easy.Participant.Dog;
import ru.interview.oop_easy.Participant.Duck;
import ru.interview.oop_easy.Participant.Participant;

public class Main {

    public static void main(String[] args) {

        Participant[] participants = new Participant[3];
        participants[0]=new Cat();
        participants[1]=new Dog();
        participants[2]=new Duck();

        Obstacle[] track= new Obstacle[4];
        track[0]= new Cross(0.3);
        track[1]= new Fence(1.5);
        track[2]= new Fence(1);
        track[3]=new Pool(1.1);
        for (Participant p:participants
                ) {
        for (Obstacle o:track
                ) {
                if (!o.tryObstacle(p)){
                    System.out.println("Участник "+p+ " не прошел этап "+ o);
                    break;
                }System.out.println("Участник " +p + " прошел этап "+o);
            }
        }
    }

}

