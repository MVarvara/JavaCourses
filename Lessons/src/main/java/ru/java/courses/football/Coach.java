package ru.java.courses.football;

/**
 * Created by Варвара on 24.07.2018.
 */
public class Coach extends Person {
    private int experience;

    public Coach(String name) {
        super(name);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Coach(String name, int experience) {
        super(name);
        this.experience = experience;
    }
}
