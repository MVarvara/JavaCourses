package ru.java.courses.sport;

/**
 * Created by Варвара on 27.06.2018.
 */
public class Runner extends Athlete{

    private Coach coach;
    private double personalRecord = 0.0;

    public Runner(String name, int age, String name1, SportTitle title, int salary) {
        super(name, age, name1, title, salary);
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public double getPersonalRecord() {
        return personalRecord;
    }

    public void setPersonalRecord(double personalRecord) {
        this.personalRecord = personalRecord;
    }

    public Runner(String name, int age, Coach coach, double personalRecord) {
        super(name, age);
        this.coach = coach;
        this.personalRecord = personalRecord;
    }

    public Runner(String name, int age, String name1, SportTitle title, int salary, Coach coach, double personalRecord) {
        super(name, age, name1, title, salary);
        this.coach = coach;
        this.personalRecord = personalRecord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Runner runner = (Runner) o;

        if (Double.compare(runner.personalRecord, personalRecord) != 0) return false;
        return coach != null ? coach.equals(runner.coach) : runner.coach == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (coach != null ? coach.hashCode() : 0);
        temp = Double.doubleToLongBits(personalRecord);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "coach=" + coach +
                ", personalRecord=" + personalRecord +
                "} " + super.toString();
    }
}
