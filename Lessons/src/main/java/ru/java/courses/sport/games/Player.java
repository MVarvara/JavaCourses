package ru.java.courses.sport.games;

import ru.java.courses.sport.Athlete;
import ru.java.courses.sport.SportTitle;

/**
 * Created by Варвара on 05.07.2018.
 */
public abstract class Player extends Athlete {

    private int points;
    private int personalNumber;
    private boolean active;

    public Player(String name, int age, String name1, SportTitle title, int salary, int points, int personalNumber, boolean active) {
        super(name, age, name1, title, salary);
        this.points = points;
        this.personalNumber = personalNumber;
        this.active = active;
    }

    protected abstract void makeScore();

    public void score(){
        if (active){
            makeScore();
        } else {
            throw new IllegalStateException("Only active players can score!");
        }
    }

    protected void addPoints(int p){
        this.points += p;
    };

    public Player(String name, int age, int points, int personalNumber, boolean active) {
        super(name, age);
        this.points = points;
        this.personalNumber = personalNumber;
        this.active = active;
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public Player(String name, int age, String name1, SportTitle title, int salary) {
        super(name, age, name1, title, salary);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
