package ru.java.courses.sport;

/**
 * Created by Варвара on 27.06.2018.
 */
public class Athlete extends Person{

    private SportTitle title = SportTitle.NO_TITLE;
    private int salary;

    public Athlete(String name, int age) {
        super(name, age);
    }

    public Athlete(String name, int age, String name1, SportTitle title, int salary) {
        super(name, age);
        this.title = title;
        this.salary = salary;
    }

    public SportTitle getTitle() {
        return title;
    }

    public void setTitle(SportTitle title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Athlete athlete = (Athlete) o;

        if (salary != athlete.salary) return false;
        return title == athlete.title;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + salary;
        return result;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "title=" + title +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
