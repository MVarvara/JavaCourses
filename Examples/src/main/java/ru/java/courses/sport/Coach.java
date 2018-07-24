package ru.java.courses.sport;

/**
 * Created by Варвара on 27.06.2018.
 */
public class Coach extends Person{
    private int experience = 0;

    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Coach coach = (Coach) o;

        return experience == coach.experience;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + experience;
        return result;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "experience=" + experience +
                "} " + super.toString();
    }
}
